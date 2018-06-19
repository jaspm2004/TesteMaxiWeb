package com.maxipago.teste.services;

import com.maxipago.teste.dto.CityDistanceDTO;
import com.maxipago.teste.dao.CityDAO;
import com.maxipago.teste.dto.CityDTO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Jose San Pedro
 */
public class CityService {
    
    @Inject
    private CityDAO cityDAO;
    
    @Inject
    DistanceCalculator distanceCalc;
    
    public List<CityDTO> findAll() {
        return cityDAO.findAll();
    }
    
    public CityDTO getCity() {
        return new CityDTO(1L, "Sao Paulo", 123D, 456D);
    }
    
    public List<CityDistanceDTO> getDistances(String unit) {
        List<CityDTO> cities = cityDAO.findAll();
        CityDTO cityI, cityJ;
        double distance;
        List<CityDistanceDTO> distances = new ArrayList<>();
        String nUnit = "K";
        
        switch(unit) {
            case "km" :
                nUnit = "K";
                break;
            case "mi" :
                nUnit = "M";
                break;
        }
        
        for (int i = 0; i < cities.size() - 1; i++) {
            cityI = cities.get(i);
            
            for (int j = i + 1; j < cities.size(); j++) {
                cityJ = cities.get(j);
                
                distance = distanceCalc.distance(cityI.getLatitude(), cityI.getLongitude()
                                                , cityJ.getLatitude(), cityJ.getLongitude()
                                                , nUnit);
                distance = Math.floor(distance);
                
                distances.add(new CityDistanceDTO(cityI.getName(), cityJ.getName(), distance, unit));
            }
        }
        
        return distances;
    }
}