package io.reflectoring.diningreview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EndUser {
    @Id
    @GeneratedValue
    private Long id; //Skal være en long!
    private String name;
    private String city;
    private String state;
    private String zipcode;
    private boolean peanutAllergic;
    private boolean eggAllergic;
    private boolean dairyAllergic;

    public EndUser(String name, String city, String state, String zipcode, boolean peanutAllergic, boolean eggAllergic, boolean dairyAllergic) {
        this.name = name;
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
     * @param user objekt som skal kopieres.
     */
    public EndUser(EndUser user) {
        this.id = user.getId();
        this.name = user.getName();
        this.city = user.getCity();
        this.state = user.getState();
        this.zipcode = user.getZipcode();
        this.peanutAllergic = user.isPeanutAllergic();
        this.eggAllergic = user.isEggAllergic();
        this.dairyAllergic = user.isDairyAllergic();

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
