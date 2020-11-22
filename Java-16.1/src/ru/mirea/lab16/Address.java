package ru.mirea.lab16;

public class Address {
    private final String cityName;
    private final int zipCode;
    private final int buildingNumber;
    private final char buildingLetter;
    private final int apartmentNumber;

    public static final Address EMPTY_ADDRESS = null;

    public Address(String cityName, int zipCode, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
