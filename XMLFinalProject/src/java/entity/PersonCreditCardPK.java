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

/**
 *
 * @author frankLX
 */
@Embeddable
public class PersonCreditCardPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "CreditCardID")
    private int creditCardID;

    public PersonCreditCardPK() {
    }

    public PersonCreditCardPK(int businessEntityID, int creditCardID) {
        this.businessEntityID = businessEntityID;
        this.creditCardID = creditCardID;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(int creditCardID) {
        this.creditCardID = creditCardID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (int) creditCardID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonCreditCardPK)) {
            return false;
        }
        PersonCreditCardPK other = (PersonCreditCardPK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if (this.creditCardID != other.creditCardID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PersonCreditCardPK[ businessEntityID=" + businessEntityID + ", creditCardID=" + creditCardID + " ]";
    }
    
}
