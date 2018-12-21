package com.github.delawarecoders.wififinder.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class LocationEntity {

    @Id
    private Long id;

    @Column
    private String zipcode;

    @Column
    private String addressLineOne;

    @Column
    private String addressLineTwo;

    @Column
    private String city;

    @Column
    private String state;

    //Since hibernate doesn't know how to make the constructor with below parameters
    //We need to provide a blank default constructor in order for hibernate to work with
    public LocationEntity(){

    }

    public LocationEntity(String zipcode, String addressLineOne, String addressLineTwo, String city, String state) {
        this.zipcode = zipcode;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.state = state;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
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
}
