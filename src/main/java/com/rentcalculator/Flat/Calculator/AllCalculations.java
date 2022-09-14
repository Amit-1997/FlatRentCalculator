package com.rentcalculator.Flat.Calculator;

import com.rentcalculator.Flat.Model.RentalInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AllCalculations {

    @Autowired
    RentalInputs rentalInputs;



    // caseI when both penality is 0
    public List<Integer> calculateRentWhenBothPenalityZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {


        List<Integer> al=new ArrayList<Integer>();

            rentalInputs.setEachPayRoom1((totalBillRoom1/noOfPersonRoom1) + (totalBillRoom2-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2));
            rentalInputs.setEachPayRoom2((totalBillRoom1/noOfPersonRoom2) + (totalBillRoom2-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2));

            al.add(rentalInputs.getEachPayRoom1());
            al.add(rentalInputs.getEachPayRoom2());
            return al;


    }

   //  caseII when room 2 penality is 0

    public List<Integer> calculateRentWhenRoomTwoPenalityZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {

        List<Integer> al=new ArrayList<Integer>();
            rentalInputs.setEachPayRoom1((penalityRoom1/noOfPersonRoom1)+ (totalBillRoom1-penalityRoom1)/noOfPersonRoom1 + (totalBillRoom2-(totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2) );
            rentalInputs.setEachPayRoom2((totalBillRoom1-penalityRoom1)/noOfPersonRoom2 + (totalBillRoom2-(totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2));



        al.add(rentalInputs.getEachPayRoom1());
        al.add(rentalInputs.getEachPayRoom2());
        return al;




    }

    //  caseIII when room 1 penality is 0

    public List<Integer> calculateRentWhenRoomOnePenalityZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {


        List<Integer> al=new ArrayList<Integer>();
            rentalInputs.setEachPayRoom1((totalBillRoom1/noOfPersonRoom1) + ((totalBillRoom2-penalityRoom2)-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2) );
            rentalInputs.setEachPayRoom2((penalityRoom2/noOfPersonRoom2)+(totalBillRoom1/noOfPersonRoom1) + ((totalBillRoom2-penalityRoom2)-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2) );


        al.add(rentalInputs.getEachPayRoom1());
        al.add(rentalInputs.getEachPayRoom2());
        return al;


    }

    // caseIV when room2 penality is greater than o and room1 penality is greater than 0

    public List<Integer> calculateRentWhenBothPenalityGreaterThanZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {

        List<Integer> al=new ArrayList<Integer>();
            rentalInputs.setEachPayRoom1((penalityRoom1/noOfPersonRoom1) + (totalBillRoom1-penalityRoom1)/noOfPersonRoom1 + ((totalBillRoom2-penalityRoom2)- (totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2) );
            rentalInputs.setEachPayRoom2((penalityRoom2/noOfPersonRoom2) + (totalBillRoom1-penalityRoom1)/noOfPersonRoom2 + ((totalBillRoom2-penalityRoom2)-(totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2) );

        al.add(rentalInputs.getEachPayRoom1());
        al.add(rentalInputs.getEachPayRoom2());
        return al;

    }
}
