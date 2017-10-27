/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author frankLX
 */
@Entity
@Table(name = "vIndividualCustomer", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VIndividualCustomer.findAll", query = "SELECT v FROM VIndividualCustomer v"),
    @NamedQuery(name = "VIndividualCustomer.findByBusinessEntityID", query = "SELECT v FROM VIndividualCustomer v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VIndividualCustomer.findByTitle", query = "SELECT v FROM VIndividualCustomer v WHERE v.title = :title"),
    @NamedQuery(name = "VIndividualCustomer.findByFirstName", query = "SELECT v FROM VIndividualCustomer v WHERE v.firstName = :firstName"),
    @NamedQuery(name = "VIndividualCustomer.findByMiddleName", query = "SELECT v FROM VIndividualCustomer v WHERE v.middleName = :middleName"),
    @NamedQuery(name = "VIndividualCustomer.findByLastName", query = "SELECT v FROM VIndividualCustomer v WHERE v.lastName = :lastName"),
    @NamedQuery(name = "VIndividualCustomer.findBySuffix", query = "SELECT v FROM VIndividualCustomer v WHERE v.suffix = :suffix"),
    @NamedQuery(name = "VIndividualCustomer.findByPhoneNumber", query = "SELECT v FROM VIndividualCustomer v WHERE v.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "VIndividualCustomer.findByPhoneNumberType", query = "SELECT v FROM VIndividualCustomer v WHERE v.phoneNumberType = :phoneNumberType"),
    @NamedQuery(name = "VIndividualCustomer.findByEmailAddress", query = "SELECT v FROM VIndividualCustomer v WHERE v.emailAddress = :emailAddress"),
    @NamedQuery(name = "VIndividualCustomer.findByEmailPromotion", query = "SELECT v FROM VIndividualCustomer v WHERE v.emailPromotion = :emailPromotion"),
    @NamedQuery(name = "VIndividualCustomer.findByAddressType", query = "SELECT v FROM VIndividualCustomer v WHERE v.addressType = :addressType"),
    @NamedQuery(name = "VIndividualCustomer.findByAddressLine1", query = "SELECT v FROM VIndividualCustomer v WHERE v.addressLine1 = :addressLine1"),
    @NamedQuery(name = "VIndividualCustomer.findByAddressLine2", query = "SELECT v FROM VIndividualCustomer v WHERE v.addressLine2 = :addressLine2"),
    @NamedQuery(name = "VIndividualCustomer.findByCity", query = "SELECT v FROM VIndividualCustomer v WHERE v.city = :city"),
    @NamedQuery(name = "VIndividualCustomer.findByStateProvinceName", query = "SELECT v FROM VIndividualCustomer v WHERE v.stateProvinceName = :stateProvinceName"),
    @NamedQuery(name = "VIndividualCustomer.findByPostalCode", query = "SELECT v FROM VIndividualCustomer v WHERE v.postalCode = :postalCode"),
    @NamedQuery(name = "VIndividualCustomer.findByCountryRegionName", query = "SELECT v FROM VIndividualCustomer v WHERE v.countryRegionName = :countryRegionName"),
    @NamedQuery(name = "VIndividualCustomer.findByDemographics", query = "SELECT v FROM VIndividualCustomer v WHERE v.demographics = :demographics")})
public class VIndividualCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "MiddleName")
    private String middleName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Suffix")
    private String suffix;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "PhoneNumberType")
    private String phoneNumberType;
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "EmailPromotion")
    private int emailPromotion;
    @Basic(optional = false)
    @Column(name = "AddressType")
    private String addressType;
    @Basic(optional = false)
    @Column(name = "AddressLine1")
    private String addressLine1;
    @Column(name = "AddressLine2")
    private String addressLine2;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "StateProvinceName")
    private String stateProvinceName;
    @Basic(optional = false)
    @Column(name = "PostalCode")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "CountryRegionName")
    private String countryRegionName;
    @Column(name = "Demographics")
    private String demographics;

    public VIndividualCustomer() {
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(int emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvinceName() {
        return stateProvinceName;
    }

    public void setStateProvinceName(String stateProvinceName) {
        this.stateProvinceName = stateProvinceName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryRegionName() {
        return countryRegionName;
    }

    public void setCountryRegionName(String countryRegionName) {
        this.countryRegionName = countryRegionName;
    }

    public String getDemographics() {
        return demographics;
    }

    public void setDemographics(String demographics) {
        this.demographics = demographics;
    }
    
}
