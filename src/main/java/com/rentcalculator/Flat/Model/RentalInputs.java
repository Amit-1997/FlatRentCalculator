package com.rentcalculator.Flat.Model;

import org.springframework.stereotype.Component;

@Component
public class RentalInputs {

    private int totalBillRoom1;
    private int totalBillRoom2;
    private int noOfPersonRoom1;
    private int noOfPersonRoom2;
    private int penalityRoom1;
    private int penalityRoom2;
    private int eachPayRoom1;
    private int eachPayRoom2;

    // no args constructor
    public RentalInputs() {
    }

    // All arguments constructor

    public RentalInputs(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2, int eachPayRoom1, int eachPayRoom2) {
        this.totalBillRoom1 = totalBillRoom1;
        this.totalBillRoom2 = totalBillRoom2;
        this.noOfPersonRoom1 = noOfPersonRoom1;
        this.noOfPersonRoom2 = noOfPersonRoom2;
        this.penalityRoom1 = penalityRoom1;
        this.penalityRoom2 = penalityRoom2;
        this.eachPayRoom1 = eachPayRoom1;
        this.eachPayRoom2 = eachPayRoom2;
    }

    // getter and setter

    public int getTotalBillRoom1() {
        return totalBillRoom1;
    }

    public void setTotalBillRoom1(int totalBillRoom1) {
        this.totalBillRoom1 = totalBillRoom1;
    }

    public int getTotalBillRoom2() {
        return totalBillRoom2;
    }

    public void setTotalBillRoom2(int totalBillRoom2) {
        this.totalBillRoom2 = totalBillRoom2;
    }

    public int getNoOfPersonRoom1() {
        return noOfPersonRoom1;
    }

    public void setNoOfPersonRoom1(int noOfPersonRoom1) {
        this.noOfPersonRoom1 = noOfPersonRoom1;
    }

    public int getNoOfPersonRoom2() {
        return noOfPersonRoom2;
    }

    public void setNoOfPersonRoom2(int noOfPersonRoom2) {
        this.noOfPersonRoom2 = noOfPersonRoom2;
    }

    public int getPenalityRoom1() {
        return penalityRoom1;
    }

    public void setPenalityRoom1(int penalityRoom1) {
        this.penalityRoom1 = penalityRoom1;
    }

    public int getPenalityRoom2() {
        return penalityRoom2;
    }

    public void setPenalityRoom2(int penalityRoom2) {
        this.penalityRoom2 = penalityRoom2;
    }

    public int getEachPayRoom1() {
        return eachPayRoom1;
    }

    public void setEachPayRoom1(int eachPayRoom1) {
        this.eachPayRoom1 = eachPayRoom1;
    }

    public int getEachPayRoom2() {
        return eachPayRoom2;
    }

    public void setEachPayRoom2(int eachPayRoom2) {
        this.eachPayRoom2 = eachPayRoom2;
    }

    // toString


    @Override
    public String toString() {
        return "RentalInputs{" +
                "totalBillRoom1=" + totalBillRoom1 +
                ", totalBillRoom2=" + totalBillRoom2 +
                ", noOfPersonRoom1=" + noOfPersonRoom1 +
                ", noOfPersonRoom2=" + noOfPersonRoom2 +
                ", penalityRoom1=" + penalityRoom1 +
                ", penalityRoom2=" + penalityRoom2 +
                ", eachPayRoom1=" + eachPayRoom1 +
                ", eachPayRoom2=" + eachPayRoom2 +
                '}';
    }
}
