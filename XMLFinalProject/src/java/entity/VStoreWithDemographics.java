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
@Table(name = "vStoreWithDemographics", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VStoreWithDemographics.findAll", query = "SELECT v FROM VStoreWithDemographics v"),
    @NamedQuery(name = "VStoreWithDemographics.findByBusinessEntityID", query = "SELECT v FROM VStoreWithDemographics v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VStoreWithDemographics.findByName", query = "SELECT v FROM VStoreWithDemographics v WHERE v.name = :name"),
    @NamedQuery(name = "VStoreWithDemographics.findByAnnualSales", query = "SELECT v FROM VStoreWithDemographics v WHERE v.annualSales = :annualSales"),
    @NamedQuery(name = "VStoreWithDemographics.findByAnnualRevenue", query = "SELECT v FROM VStoreWithDemographics v WHERE v.annualRevenue = :annualRevenue"),
    @NamedQuery(name = "VStoreWithDemographics.findByBankName", query = "SELECT v FROM VStoreWithDemographics v WHERE v.bankName = :bankName"),
    @NamedQuery(name = "VStoreWithDemographics.findByBusinessType", query = "SELECT v FROM VStoreWithDemographics v WHERE v.businessType = :businessType"),
    @NamedQuery(name = "VStoreWithDemographics.findByYearOpened", query = "SELECT v FROM VStoreWithDemographics v WHERE v.yearOpened = :yearOpened"),
    @NamedQuery(name = "VStoreWithDemographics.findBySpecialty", query = "SELECT v FROM VStoreWithDemographics v WHERE v.specialty = :specialty"),
    @NamedQuery(name = "VStoreWithDemographics.findBySquareFeet", query = "SELECT v FROM VStoreWithDemographics v WHERE v.squareFeet = :squareFeet"),
    @NamedQuery(name = "VStoreWithDemographics.findByBrands", query = "SELECT v FROM VStoreWithDemographics v WHERE v.brands = :brands"),
    @NamedQuery(name = "VStoreWithDemographics.findByInternet", query = "SELECT v FROM VStoreWithDemographics v WHERE v.internet = :internet"),
    @NamedQuery(name = "VStoreWithDemographics.findByNumberEmployees", query = "SELECT v FROM VStoreWithDemographics v WHERE v.numberEmployees = :numberEmployees")})
public class VStoreWithDemographics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AnnualSales")
    private BigDecimal annualSales;
    @Column(name = "AnnualRevenue")
    private BigDecimal annualRevenue;
    @Column(name = "BankName")
    private String bankName;
    @Column(name = "BusinessType")
    private String businessType;
    @Column(name = "YearOpened")
    private Integer yearOpened;
    @Column(name = "Specialty")
    private String specialty;
    @Column(name = "SquareFeet")
    private Integer squareFeet;
    @Column(name = "Brands")
    private String brands;
    @Column(name = "Internet")
    private String internet;
    @Column(name = "NumberEmployees")
    private Integer numberEmployees;

    public VStoreWithDemographics() {
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

    public BigDecimal getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(BigDecimal annualSales) {
        this.annualSales = annualSales;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Integer getYearOpened() {
        return yearOpened;
    }

    public void setYearOpened(Integer yearOpened) {
        this.yearOpened = yearOpened;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    
}
