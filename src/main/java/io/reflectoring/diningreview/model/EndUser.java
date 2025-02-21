package io.reflectoring.diningreview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EndUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Skal være en long!
    private String username;
    private String city;
    private String state;
    private String zipcode;
    private boolean peanutAllergic;
    private boolean eggAllergic;
    private boolean dairyAllergic;

    public EndUser(String username, String city, String state, String zipcode, boolean peanutAllergic, boolean eggAllergic, boolean dairyAllergic) {
        this.username = username;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.peanutAllergic = peanutAllergic;
        this.eggAllergic = eggAllergic;
        this.dairyAllergic = dairyAllergic;
    }

    /**
     * No-argument constructor: ofte nødvendig for JPA for at skabe objekter gennem reflection
     */
    public EndUser() {
    }

    /**
     * Copy-constructor, når der skal foretages kopier af en eksisterende uden at røre den originale.
     * @param endUser objekt som skal kopieres.
     */
    public EndUser(EndUser endUser) {
        this.id = endUser.getId();
        this.username = endUser.getUsername();
        this.city = endUser.getCity();
        this.state = endUser.getState();
        this.zipcode = endUser.getZipcode();
        this.peanutAllergic = endUser.isPeanutAllergic();
        this.eggAllergic = endUser.isEggAllergic();
        this.dairyAllergic = endUser.isDairyAllergic();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
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

    public boolean isPeanutAllergic() {
        return peanutAllergic;
    }

    public void setPeanutAllergic(boolean peanutAllergic) {
        this.peanutAllergic = peanutAllergic;
    }

    public boolean isEggAllergic() {
        return eggAllergic;
    }

    public void setEggAllergic(boolean eggAllergic) {
        this.eggAllergic = eggAllergic;
    }

    public boolean isDairyAllergic() {
        return dairyAllergic;
    }

    public void setDairyAllergic(boolean dairyAllergic) {
        this.dairyAllergic = dairyAllergic;
    }
}
