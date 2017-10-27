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
@Table(name = "vStoreWithContacts", catalog = "AdventureWorks2012", schema = "Sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VStoreWithContacts.findAll", query = "SELECT v FROM VStoreWithContacts v"),
    @NamedQuery(name = "VStoreWithContacts.findByBusinessEntityID", query = "SELECT v FROM VStoreWithContacts v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VStoreWithContacts.findByName", query = "SELECT v FROM VStoreWithContacts v WHERE v.name = :name"),
    @NamedQuery(name = "VStoreWithContacts.findByContactType", query = "SELECT v FROM VStoreWithContacts v WHERE v.contactType = :contactType"),
    @NamedQuery(name = "VStoreWithContacts.findByTitle", query = "SELECT v FROM VStoreWithContacts v WHERE v.title = :title"),
    @NamedQuery(name = "VStoreWithContacts.findByFirstName", query = "SELECT v FROM VStoreWithContacts v WHERE v.firstName = :firstName"),
    @NamedQuery(name = "VStoreWithContacts.findByMiddleName", query = "SELECT v FROM VStoreWithContacts v WHERE v.middleName = :middleName"),
    @NamedQuery(name = "VStoreWithContacts.findByLastName", query = "SELECT v FROM VStoreWithContacts v WHERE v.lastName = :lastName"),
    @NamedQuery(name = "VStoreWithContacts.findBySuffix", query = "SELECT v FROM VStoreWithContacts v WHERE v.suffix = :suffix"),
    @NamedQuery(name = "VStoreWithContacts.findByPhoneNumber", query = "SELECT v FROM VStoreWithContacts v WHERE v.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "VStoreWithContacts.findByPhoneNumberType", query = "SELECT v FROM VStoreWithContacts v WHERE v.phoneNumberType = :phoneNumberType"),
    @NamedQuery(name = "VStoreWithContacts.findByEmailAddress", query = "SELECT v FROM VStoreWithContacts v WHERE v.emailAddress = :emailAddress"),
    @NamedQuery(name = "VStoreWithContacts.findByEmailPromotion", query = "SELECT v FROM VStoreWithContacts v WHERE v.emailPromotion = :emailPromotion")})
public class VStoreWithContacts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "ContactType")
    private String contactType;
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

    public VStoreWithContacts() {
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

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
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
    
}
