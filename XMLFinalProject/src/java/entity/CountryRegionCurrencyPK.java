/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author frankLX
 */
@Embeddable
public class CountryRegionCurrencyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CountryRegionCode")
    private String countryRegionCode;
    @Basic(optional = false)
    @Column(name = "CurrencyCode")
    private String currencyCode;

    public CountryRegionCurrencyPK() {
    }

    public CountryRegionCurrencyPK(String countryRegionCode, String currencyCode) {
        this.countryRegionCode = countryRegionCode;
        this.currencyCode = currencyCode;
    }

    public String getCountryRegionCode() {
        return countryRegionCode;
    }
    @XmlAttribute
    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    @XmlAttribute
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryRegionCode != null ? countryRegionCode.hashCode() : 0);
        hash += (currencyCode != null ? currencyCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryRegionCurrencyPK)) {
            return false;
        }
        CountryRegionCurrencyPK other = (CountryRegionCurrencyPK) object;
        if ((this.countryRegionCode == null && other.countryRegionCode != null) || (this.countryRegionCode != null && !this.countryRegionCode.equals(other.countryRegionCode))) {
            return false;
        }
        if ((this.currencyCode == null && other.currencyCode != null) || (this.currencyCode != null && !this.currencyCode.equals(other.currencyCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CountryRegionCurrencyPK[ countryRegionCode=" + countryRegionCode + ", currencyCode=" + currencyCode + " ]";
    }
    
}
