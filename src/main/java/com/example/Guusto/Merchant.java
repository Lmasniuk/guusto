package com.example.Guusto;

public class Merchant {

    private final long id;
    private String name;
    private String country;


	public Merchant() {
		this.id = -1;
		this.name = "";
        this.country = "";
	}

	public Merchant(long id, String name, String country) {
		this.id = id;
		this.name = name;
        this.country = country;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

    public String getCountry() {
		return country;
	}
    
}
