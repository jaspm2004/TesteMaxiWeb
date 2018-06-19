package com.maxipago.teste.dto;

/**
 *
 * @author Jose
 */
public class CityDistanceDTO {
    
    private String cityA;
    private String cityB;
    private double distanceAB;
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