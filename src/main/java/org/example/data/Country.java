package org.example.data;

public enum Country {
    RU("Россия"), CN("Китай"), US("США");

    String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
