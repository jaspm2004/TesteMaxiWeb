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
public class CityContainerDTO {
    @XmlElement
    List<CityDTO> cities = new ArrayList<>();

    public CityContainerDTO() {
    }

    public void setCities(List<CityDTO> cities) {
        this.cities = cities;
    }

    /*public List<CityDTO> getCities() {
        return cities;
    }*/
}