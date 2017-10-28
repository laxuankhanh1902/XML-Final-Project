/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author frankLX
 */
@Entity
@Table(name = "Store", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Store.findAll", query = "SELECT s FROM Store s"),
    @NamedQuery(name = "Store.findByBusinessEntityID", query = "SELECT s FROM Store s WHERE s.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "Store.findByName", query = "SELECT s FROM Store s WHERE s.name = :name"),
    @NamedQuery(name = "Store.findByDemographics", query = "SELECT s FROM Store s WHERE s.demographics = :demographics"),
    @NamedQuery(name = "Store.findByRowguid", query = "SELECT s FROM Store s WHERE s.rowguid = :rowguid"),
    @NamedQuery(name = "Store.findByModifiedDate", query = "SELECT s FROM Store s WHERE s.modifiedDate = :modifiedDate")})
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "Demographics")
    private String demographics;
    @Basic(optional = false)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToMany(mappedBy = "storeID")
    private Collection<Customer> customerCollection;
    @JoinColumn(name = "SalesPersonID", referencedColumnName = "BusinessEntityID")
    @ManyToOne
    private SalesPerson salesPersonID;

    public Store() {
    }

    public Store(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Store(Integer businessEntityID, String name, String rowguid, Date modifiedDate) {
        this.businessEntityID = businessEntityID;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }
    @XmlAttribute
    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getName() {
        return name;
    }
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getDemographics() {
        return demographics;
    }
    @XmlAttribute
    public void setDemographics(String demographics) {
        this.demographics = demographics;
    }

    public String getRowguid() {
        return rowguid;
    }
    @XmlAttribute
    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }
    @XmlAttribute
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @XmlTransient
    public Collection<Customer> getCustomerCollection() {
        return customerCollection;
    }

    public void setCustomerCollection(Collection<Customer> customerCollection) {
        this.customerCollection = customerCollection;
    }

    public SalesPerson getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(SalesPerson salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessEntityID != null ? businessEntityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Store[ businessEntityID=" + businessEntityID + " ]";
    }
    
}
