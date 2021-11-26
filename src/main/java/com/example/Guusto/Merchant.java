package com.example.Guusto;

public class Merchant {

    private String name;
    private String country;


	public Merchant() {
		this.name = "";
        this.country = "";
	}

	public Merchant(String name, String country) {
		this.name = name;
        this.country = country;
	}

	public String getName() {
		return name;
	}

    public String getCountry() {
		return country;
	}

    public String toString() {
        return "Merchant Name: " + name + " ----- Merchant Country: " + country;
    }
    
}
