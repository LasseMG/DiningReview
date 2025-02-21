package io.reflectoring.diningreview.dto;

import io.reflectoring.diningreview.model.EndUser;

/*
Standard data om en bruger DTO.
 */
public class EndUserDTO {
    private Long id;
    private String name;
    private String city;
    private String state;
    private String zipcode;

    public EndUserDTO(Long id, String name, String city, String state, String zipcode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public EndUserDTO(EndUser endUser) {
        this.id = endUser.getId();
        this.name = endUser.getUsername();
        this.city = endUser.getCity();
        this.state = endUser.getState();
        this.zipcode = endUser.getZipcode();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
