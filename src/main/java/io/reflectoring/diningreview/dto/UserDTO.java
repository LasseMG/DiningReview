package io.reflectoring.diningreview.dto;

import io.reflectoring.diningreview.model.User;

/*
Standard data om en bruger DTO.
 */
public class UserDTO {
    private Long id;
    private String name;
    private String city;
    private String state;
    private String zipcode;

    public UserDTO(Long id, String name, String city, String state, String zipcode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.city = user.getCity();
        this.state = user.getState();
        this.zipcode = user.getZipcode();
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
