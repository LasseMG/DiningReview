package io.reflectoring.diningreview.model;

import jakarta.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String zipcode;
    private String state;
    private String country;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private PriceRange priceRange;
    private int capacity;
    private int numberOfReviews;
    private String cuisineType;
    private double peanutAllergyScore;
    private double eggAllergyScore;
    private double dairyAllergyScore;
    private double overallScore;

    public Restaurant(String name, String address, String zipcode, String state, String country, String phoneNumber, PriceRange priceRange, int capacity, int numberOfReviews, String cuisineType, double peanutAllergyScore, double eggAllergyScore, double dairyAllergyScore, double overallScore) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.state = state;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.priceRange = priceRange;
        this.capacity = capacity;
        this.numberOfReviews = numberOfReviews;
        this.cuisineType = cuisineType;
        this.peanutAllergyScore = peanutAllergyScore;
        this.eggAllergyScore = eggAllergyScore;
        this.dairyAllergyScore = dairyAllergyScore;
        this.overallScore = overallScore;
    }

    public Restaurant() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public double getPeanutAllergyScore() {
        return peanutAllergyScore;
    }

    public void setPeanutAllergyScore(double peanutAllergyScore) {
        this.peanutAllergyScore = peanutAllergyScore;
    }

    public double getEggAllergyScore() {
        return eggAllergyScore;
    }

    public void setEggAllergyScore(double eggAllergyScore) {
        this.eggAllergyScore = eggAllergyScore;
    }

    public double getDairyAllergyScore() {
        return dairyAllergyScore;
    }

    public void setDairyAllergyScore(double dairyAllergyScore) {
        this.dairyAllergyScore = dairyAllergyScore;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(double overallScore) {
        this.overallScore = overallScore;
    }
}
