package io.reflectoring.diningreview.dto;

import io.reflectoring.diningreview.model.User;

/*
DTO til når data om brugerens allergier er nødvendig.
 */
public class UserAllergyDTO {
    private Long id;
    private String name;
    private boolean peanutAllergic;
    private boolean eggAllergic;
    private boolean dairyAllergic;

    public UserAllergyDTO(Long id, String name, boolean peanutAllergic, boolean eggAllergic, boolean dairyAllergic) {
        this.id = id;
        this.name = name;
        this.peanutAllergic = peanutAllergic;
        this.eggAllergic = eggAllergic;
        this.dairyAllergic = dairyAllergic;
    }

    public UserAllergyDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
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
