/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "vSalesPerson", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VSalesPerson.findAll", query = "SELECT v FROM VSalesPerson v"),
    @NamedQuery(name = "VSalesPerson.findByBusinessEntityID", query = "SELECT v FROM VSalesPerson v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VSalesPerson.findByTitle", query = "SELECT v FROM VSalesPerson v WHERE v.title = :title"),
    @NamedQuery(name = "VSalesPerson.findByFirstName", query = "SELECT v FROM VSalesPerson v WHERE v.firstName = :firstName"),
    @NamedQuery(name = "VSalesPerson.findByMiddleName", query = "SELECT v FROM VSalesPerson v WHERE v.middleName = :middleName"),
    @NamedQuery(name = "VSalesPerson.findByLastName", query = "SELECT v FROM VSalesPerson v WHERE v.lastName = :lastName"),
    @NamedQuery(name = "VSalesPerson.findBySuffix", query = "SELECT v FROM VSalesPerson v WHERE v.suffix = :suffix"),
    @NamedQuery(name = "VSalesPerson.findByJobTitle", query = "SELECT v FROM VSalesPerson v WHERE v.jobTitle = :jobTitle"),
    @NamedQuery(name = "VSalesPerson.findByPhoneNumber", query = "SELECT v FROM VSalesPerson v WHERE v.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "VSalesPerson.findByPhoneNumberType", query = "SELECT v FROM VSalesPerson v WHERE v.phoneNumberType = :phoneNumberType"),
    @NamedQuery(name = "VSalesPerson.findByEmailAddress", query = "SELECT v FROM VSalesPerson v WHERE v.emailAddress = :emailAddress"),
    @NamedQuery(name = "VSalesPerson.findByEmailPromotion", query = "SELECT v FROM VSalesPerson v WHERE v.emailPromotion = :emailPromotion"),
    @NamedQuery(name = "VSalesPerson.findByAddressLine1", query = "SELECT v FROM VSalesPerson v WHERE v.addressLine1 = :addressLine1"),
    @NamedQuery(name = "VSalesPerson.findByAddressLine2", query = "SELECT v FROM VSalesPerson v WHERE v.addressLine2 = :addressLine2"),
    @NamedQuery(name = "VSalesPerson.findByCity", query = "SELECT v FROM VSalesPerson v WHERE v.city = :city"),
    @NamedQuery(name = "VSalesPerson.findByStateProvinceName", query = "SELECT v FROM VSalesPerson v WHERE v.stateProvinceName = :stateProvinceName"),
    @NamedQuery(name = "VSalesPerson.findByPostalCode", query = "SELECT v FROM VSalesPerson v WHERE v.postalCode = :postalCode"),
    @NamedQuery(name = "VSalesPerson.findByCountryRegionName", query = "SELECT v FROM VSalesPerson v WHERE v.countryRegionName = :countryRegionName"),
    @NamedQuery(name = "VSalesPerson.findByTerritoryName", query = "SELECT v FROM VSalesPerson v WHERE v.territoryName = :territoryName"),
    @NamedQuery(name = "VSalesPerson.findByTerritoryGroup", query = "SELECT v FROM VSalesPerson v WHERE v.territoryGroup = :territoryGroup"),
    @NamedQuery(name = "VSalesPerson.findBySalesQuota", query = "SELECT v FROM VSalesPerson v WHERE v.salesQuota = :salesQuota"),
    @NamedQuery(name = "VSalesPerson.findBySalesYTD", query = "SELECT v FROM VSalesPerson v WHERE v.salesYTD = :salesYTD"),
    @NamedQuery(name = "VSalesPerson.findBySalesLastYear", query = "SELECT v FROM VSalesPerson v WHERE v.salesLastYear = :salesLastYear")})
public class VSalesPerson implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "JobTitle")
    private String jobTitle;
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
    @Column(name = "TerritoryName")
    private String territoryName;
    @Column(name = "TerritoryGroup")
    private String territoryGroup;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SalesQuota")
    private BigDecimal salesQuota;
    @Basic(optional = false)
    @Column(name = "SalesYTD")
    private BigDecimal salesYTD;
    @Basic(optional = false)
    @Column(name = "SalesLastYear")
    private BigDecimal salesLastYear;

    public VSalesPerson() {
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public String getTerritoryName() {
        return territoryName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
    }

    public String getTerritoryGroup() {
        return territoryGroup;
    }

    public void setTerritoryGroup(String territoryGroup) {
        this.territoryGroup = territoryGroup;
    }

    public BigDecimal getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(BigDecimal salesQuota) {
        this.salesQuota = salesQuota;
    }

    public BigDecimal getSalesYTD() {
        return salesYTD;
    }

    public void setSalesYTD(BigDecimal salesYTD) {
        this.salesYTD = salesYTD;
    }

    public BigDecimal getSalesLastYear() {
        return salesLastYear;
    }

    public void setSalesLastYear(BigDecimal salesLastYear) {
        this.salesLastYear = salesLastYear;
    }
    
}
