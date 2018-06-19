package com.maxipago.teste.dto;

/**
 *
 * @author Jose San Pedro
 */
public class CityDTO {

    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

    public CityDTO() {
    }

    public CityDTO(Long id, String name, Double latitude, Double longitude) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}