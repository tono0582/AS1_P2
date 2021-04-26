package parcial_2.model;

import java.util.*;


public class EnterpriseEntity {


    public EnterpriseEntity() {
    }


    private int id;


    private String comercialName;


    private String legalName;


    private String contactPerson;

  
    private String email;


    private String fiscalAddress;

 
    private int phoneNumber;


    private int nit;

  
    private int event;


    public int getId() {
        // TODO implement here
        return id;
    }

    public void setId(int id) {
        // TODO implement here
        this.id=id;
    }

    public String getComercialName() {
        // TODO implement here
        return comercialName;
    }

    public void setComercialName(String comercialName) {
        // TODO implement here
        this.comercialName=comercialName;
    }

    public String getLegalName() {
        // TODO implement here
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName=legalName;
        
    }

    public String getContactPerson() {
        // TODO implement here
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        // TODO implement here
        this.contactPerson=contactPerson ;
    }

    public String getEmail() {
        // TODO implement here
        return email;
    }

    public void setEmail(String email) {
        // TODO implement here
        this.email=email ;
    }

    public String getFiscalAddress() {
        // TODO implement here
        return fiscalAddress;
    }

    public void setFiscalAddress(String fiscalAddress) {
        // TODO implement here
        this.fiscalAddress=fiscalAddress ;
    }

    public int getPhoneNumber() {
        // TODO implement here
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        // TODO implement here
        this.phoneNumber=phoneNumber ;
    }

    public int getNit() {
        // TODO implement here
        return nit;
    }

    public void setNit(int nit) {
        // TODO implement here
        this.nit=nit ;
    }

    public int getEvent() {
        // TODO implement here
        return event;
    }

    public void setEvent(int event) {
        // TODO implement here
        this.event=event;
    }

}