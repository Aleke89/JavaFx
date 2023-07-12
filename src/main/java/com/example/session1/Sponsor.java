package com.example.session1;

public class Sponsor {
    private String logo;
    private String name;
    private String amount;

    public Sponsor(String logo, String name, String amount) {
        this.logo = logo;
        this.name = name;
        this.amount = amount;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
