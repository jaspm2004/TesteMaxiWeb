package com.maxipago.teste.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose San Pedro
 */
@XmlRootElement
public class CityDTO {

    @XmlElement
    private Long id;
    
    @XmlElement
    private String name;
    
    @XmlElement
    private Double latitude;
    
    @XmlElement
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