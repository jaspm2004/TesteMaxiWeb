package com.maxipago.teste.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose
 */
@XmlRootElement
public class CityDistanceDTO {
    
    @XmlElement
    private String cityA;
    
    @XmlElement
    private String cityB;
    
    @XmlElement
    private double distanceAB;
    
    @XmlElement
    private String unit;

    public CityDistanceDTO() {
        
    }
    
    public CityDistanceDTO(String cityA, String cityB, double distanceAB, String unit) {
        this.cityA = cityA;
        this.cityB = cityB;
        this.distanceAB = distanceAB;
        this.unit = unit;
    }

    public String getCityA() {
        return cityA;
    }

    public String getCityB() {
        return cityB;
    }

    public double getDistanceAB() {
        return distanceAB;
    }

    public String getUnit() {
        return unit;
    }
}