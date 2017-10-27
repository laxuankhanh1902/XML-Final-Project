/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author frankLX
 */
@Entity
@Table(name = "CurrencyRate", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CurrencyRate.findAll", query = "SELECT c FROM CurrencyRate c"),
    @NamedQuery(name = "CurrencyRate.findByCurrencyRateID", query = "SELECT c FROM CurrencyRate c WHERE c.currencyRateID = :currencyRateID"),
    @NamedQuery(name = "CurrencyRate.findByCurrencyRateDate", query = "SELECT c FROM CurrencyRate c WHERE c.currencyRateDate = :currencyRateDate"),
    @NamedQuery(name = "CurrencyRate.findByAverageRate", query = "SELECT c FROM CurrencyRate c WHERE c.averageRate = :averageRate"),
    @NamedQuery(name = "CurrencyRate.findByEndOfDayRate", query = "SELECT c FROM CurrencyRate c WHERE c.endOfDayRate = :endOfDayRate"),
    @NamedQuery(name = "CurrencyRate.findByModifiedDate", query = "SELECT c FROM CurrencyRate c WHERE c.modifiedDate = :modifiedDate")})
public class CurrencyRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CurrencyRateID")
    private Integer currencyRateID;
    @Basic(optional = false)
    @Column(name = "CurrencyRateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currencyRateDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AverageRate")
    private BigDecimal averageRate;
    @Basic(optional = false)
    @Column(name = "EndOfDayRate")
    private BigDecimal endOfDayRate;
    @Basic(optional = false)
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JoinColumn(name = "FromCurrencyCode", referencedColumnName = "CurrencyCode")
    @ManyToOne(optional = false)
    private Currency fromCurrencyCode;
    @JoinColumn(name = "ToCurrencyCode", referencedColumnName = "CurrencyCode")
    @ManyToOne(optional = false)
    private Currency toCurrencyCode;
    @OneToMany(mappedBy = "currencyRateID")
    private Collection<SalesOrderHeader> salesOrderHeaderCollection;

    public CurrencyRate() {
    }

    public CurrencyRate(Integer currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public CurrencyRate(Integer currencyRateID, Date currencyRateDate, BigDecimal averageRate, BigDecimal endOfDayRate, Date modifiedDate) {
        this.currencyRateID = currencyRateID;
        this.currencyRateDate = currencyRateDate;
        this.averageRate = averageRate;
        this.endOfDayRate = endOfDayRate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getCurrencyRateID() {
        return currencyRateID;
    }

    public void setCurrencyRateID(Integer currencyRateID) {
        this.currencyRateID = currencyRateID;
    }

    public Date getCurrencyRateDate() {
        return currencyRateDate;
    }

    public void setCurrencyRateDate(Date currencyRateDate) {
        this.currencyRateDate = currencyRateDate;
    }

    public BigDecimal getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(BigDecimal averageRate) {
        this.averageRate = averageRate;
    }

    public BigDecimal getEndOfDayRate() {
        return endOfDayRate;
    }

    public void setEndOfDayRate(BigDecimal endOfDayRate) {
        this.endOfDayRate = endOfDayRate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Currency getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(Currency fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public Currency getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(Currency toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    @XmlTransient
    public Collection<SalesOrderHeader> getSalesOrderHeaderCollection() {
        return salesOrderHeaderCollection;
    }

    public void setSalesOrderHeaderCollection(Collection<SalesOrderHeader> salesOrderHeaderCollection) {
        this.salesOrderHeaderCollection = salesOrderHeaderCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currencyRateID != null ? currencyRateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrencyRate)) {
            return false;
        }
        CurrencyRate other = (CurrencyRate) object;
        if ((this.currencyRateID == null && other.currencyRateID != null) || (this.currencyRateID != null && !this.currencyRateID.equals(other.currencyRateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CurrencyRate[ currencyRateID=" + currencyRateID + " ]";
    }
    
}
