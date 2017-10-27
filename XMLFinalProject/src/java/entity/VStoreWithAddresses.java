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
@Table(name = "vStoreWithAddresses", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VStoreWithAddresses.findAll", query = "SELECT v FROM VStoreWithAddresses v"),
    @NamedQuery(name = "VStoreWithAddresses.findByBusinessEntityID", query = "SELECT v FROM VStoreWithAddresses v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VStoreWithAddresses.findByName", query = "SELECT v FROM VStoreWithAddresses v WHERE v.name = :name"),
    @NamedQuery(name = "VStoreWithAddresses.findByAddressType", query = "SELECT v FROM VStoreWithAddresses v WHERE v.addressType = :addressType"),
    @NamedQuery(name = "VStoreWithAddresses.findByAddressLine1", query = "SELECT v FROM VStoreWithAddresses v WHERE v.addressLine1 = :addressLine1"),
    @NamedQuery(name = "VStoreWithAddresses.findByAddressLine2", query = "SELECT v FROM VStoreWithAddresses v WHERE v.addressLine2 = :addressLine2"),
    @NamedQuery(name = "VStoreWithAddresses.findByCity", query = "SELECT v FROM VStoreWithAddresses v WHERE v.city = :city"),
    @NamedQuery(name = "VStoreWithAddresses.findByStateProvinceName", query = "SELECT v FROM VStoreWithAddresses v WHERE v.stateProvinceName = :stateProvinceName"),
    @NamedQuery(name = "VStoreWithAddresses.findByPostalCode", query = "SELECT v FROM VStoreWithAddresses v WHERE v.postalCode = :postalCode"),
    @NamedQuery(name = "VStoreWithAddresses.findByCountryRegionName", query = "SELECT v FROM VStoreWithAddresses v WHERE v.countryRegionName = :countryRegionName")})
public class VStoreWithAddresses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
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

    public VStoreWithAddresses() {
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
