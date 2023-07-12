package com.example.session1;

public class Service {
    private String image;
    private String name;
    private Boolean drinks;
    private Boolean energy;
    private Boolean toilets;
    private Boolean information;
    private Boolean medical;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String text) {
        this.name = text;
    }

    public Boolean getDrinks() {
        return drinks;
    }

    public void setDrinks(Boolean drinks) {
        this.drinks = drinks;
    }

    public Boolean getEnergy() {
        return energy;
    }

    public void setEnergy(Boolean energy) {
        this.energy = energy;
    }

    public Boolean getToilets() {
        return toilets;
    }

    public void setToilets(Boolean toilets) {
        this.toilets = toilets;
    }

    public Boolean getInformation() {
        return information;
    }

    public void setInformation(Boolean information) {
        this.information = information;
    }

    public Boolean getMedical() {
        return medical;
    }

    public void setMedical(Boolean medical) {
        this.medical = medical;
    }
}
