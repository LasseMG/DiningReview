package io.reflectoring.diningreview.dto;

import io.reflectoring.diningreview.model.PriceRange;
import io.reflectoring.diningreview.model.Restaurant;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RestaurantDTO {
    private String name;
    private String address;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private PriceRange priceRange;
    private String state;
    private String zipCode;
    private double overallScore;

    public RestaurantDTO(String name, String address, String phoneNumber, PriceRange priceRange, String state, String zipCode, double overallScore) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.priceRange = priceRange;
        this.state = state;
        this.zipCode = zipCode;
        this.overallScore = overallScore;
    }

    public RestaurantDTO(Restaurant restaurant) {
        this.name = restaurant.getName();
        this.address = restaurant.getAddress();
        this.phoneNumber = restaurant.getPhoneNumber();
        this.priceRange = restaurant.getPriceRange();
        this.state = restaurant.getState();
        this.zipCode = restaurant.getState();
        this.overallScore = restaurant.getOverallScore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(PriceRange priceRange) {
        this.priceRange = priceRange;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(double overallScore) {
        this.overallScore = overallScore;
    }
}
