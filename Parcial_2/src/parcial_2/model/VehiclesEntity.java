package parcial_2.model;

import java.util.*;


public class VehiclesEntity {


    public VehiclesEntity() {
    }


    private int id;

    private String vin;


    private String licensePlate;

    private String brand;

    private String line;

    private int model;


    private String color;

    private double price;

    private String comercialNameEnteprise;


    public int getId() {
        // TODO implement here
        return id;
    }


    public void setId(int id) {
        // TODO implement here
        this.id=id ;
    }


    public String getVin() {
        // TODO implement here
        return vin;
    }


    public void setVin(String vin) {
        // TODO implement here
        this.vin=vin ;
    }


    public String getLicensePlate() {
        // TODO implement here
        return licensePlate;
    }


    public void setLicensePlate(String licensePlate) {
        // TODO implement here
        this.licensePlate=licensePlate ;
    }


    public String getBrand() {
        // TODO implement here
        return brand;
    }


    public void setBrand(String brand) {
        // TODO implement here
        this.brand=brand ;
    }


    public String getLine() {
        // TODO implement here
        return line;
    }


    public void setLine(String line) {
        // TODO implement here
        this.line=line ;
    }


    public int getModel() {
        // TODO implement here
        return model;
    }


    public void setModel(int model) {
        // TODO implement here
        this.model=model ;
    }


    public String getColor() {
        // TODO implement here
        return color;
    }

    public void setColor(String color) {
        // TODO implement here
        this.color=color ;
    }

    public double getPrice() {
        // TODO implement here
        return price;
    }


    public void setPrice(double price) {
        // TODO implement here
        this.price=price ;
    }


    public String getComercialNameEnterprise() {
        // TODO implement here
        return comercialNameEnteprise;
    }

    public void setComercialNameEnterprise(String comercialNameEnterprise) {
        // TODO implement here
        this.comercialNameEnteprise=comercialNameEnteprise ;
    }

}