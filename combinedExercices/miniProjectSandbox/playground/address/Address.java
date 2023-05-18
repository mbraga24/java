package com.havefunwith.combinedExercices.miniProjectSandbox.playground.address;

import com.havefunwith.combinedExercices.miniProjectSandbox.playground.enums.Country;

public class Address {

    private String fieldOne;
    private String complement;
    private String zip;
    private Country country;

    public Address(String fieldOne, String complement, String zip, Country country) {
        this.fieldOne = fieldOne;
        this.complement = complement;
        this.zip = zip;
        this.country = country;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "fieldOne='" + fieldOne + '\'' +
                ", complement='" + complement + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
