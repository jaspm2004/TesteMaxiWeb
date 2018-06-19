package com.maxipago.teste.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author José San Pedro
 */
@XmlRootElement
public class CityDistanceContainerDTO {
    @XmlElement
    List<CityDistanceDTO> distancesList = new ArrayList<>();

    public CityDistanceContainerDTO() {
    }

    /*public List<CityDistanceDTO> getDistances() {
        return distancesList;
    }*/
    
    public void add(String city1name, String city2name, double distance, String unit) {
        distancesList.add(new CityDistanceDTO(city1name, city2name, distance, unit));
    }
}