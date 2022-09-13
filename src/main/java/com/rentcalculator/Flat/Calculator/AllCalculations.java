package com.rentcalculator.Flat.Calculator;

import com.rentcalculator.Flat.Model.RentalInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllCalculations {

    @Autowired
    RentalInputs rentalInputs;

    // caseI when both penality is 0
    public void calculateRentWhenBothPenalityZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {

        if(totalBillRoom1<totalBillRoom2)
        {

            rentalInputs.setEachPayRoom1((totalBillRoom1/noOfPersonRoom1) + (totalBillRoom2-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2));
            rentalInputs.setEachPayRoom2((totalBillRoom1/noOfPersonRoom2) + (totalBillRoom2-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2));

            System.out.println("Each person of Room1 has to pay the amount of "+rentalInputs.getEachPayRoom1());
            System.out.println("Each person of Room2 has to pay the amount of "+rentalInputs.getEachPayRoom2());
        }
        else
            System.out.println("Can you please give Room1 Total bill less than Room2 Total bill *Note (For easy calculations) ");

    }

   //  caseII when room 2 penality is 0

    public void calculateRentWhenRoomTwoPenalityZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {
        if(totalBillRoom1<totalBillRoom2)
        {
            rentalInputs.setEachPayRoom1((penalityRoom1/noOfPersonRoom1)+ (totalBillRoom1-penalityRoom1)/noOfPersonRoom1 + (totalBillRoom2-(totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2) );
            rentalInputs.setEachPayRoom2((totalBillRoom1-penalityRoom1)/noOfPersonRoom2 + (totalBillRoom2-(totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2));

            System.out.println("Each person of Room1 has to pay the amount of "+rentalInputs.getEachPayRoom1());
            System.out.println("Each person of Room2 has to pay the amount of "+rentalInputs.getEachPayRoom2());

        }
        else
            System.out.println("Can you please give Room1 Total bill less than Room2 Total bill *Note (For easy calculations) ");
    }

    //  caseIII when room 1 penality is 0

    public void calculateRentWhenRoomOnePenalityZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {


        if(totalBillRoom1<totalBillRoom2) {
            rentalInputs.setEachPayRoom1((totalBillRoom1/noOfPersonRoom1) + ((totalBillRoom2-penalityRoom2)-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2) );
            rentalInputs.setEachPayRoom2((penalityRoom2/noOfPersonRoom2)+(totalBillRoom1/noOfPersonRoom1) + ((totalBillRoom2-penalityRoom2)-totalBillRoom1)/(noOfPersonRoom1+noOfPersonRoom2) );

            System.out.println("Each person of Room1 has to pay the amount of "+rentalInputs.getEachPayRoom1());
            System.out.println("Each person of Room2 has to pay the amount of "+rentalInputs.getEachPayRoom2());
        }

        else
            System.out.println("Can you please give Room1 Total bill less than Room2 Total bill *Note (For easy calculations) ");
    }

    // caseIV when room2 penality is greater than o and room1 penality is greater than 0

    public void calculateRentWhenBothPenalityGreaterThanZero(int totalBillRoom1, int totalBillRoom2, int noOfPersonRoom1, int noOfPersonRoom2, int penalityRoom1, int penalityRoom2) {

        if(totalBillRoom1<totalBillRoom2) {
            rentalInputs.setEachPayRoom1((penalityRoom1/noOfPersonRoom1) + (totalBillRoom1-penalityRoom1)/noOfPersonRoom1 + ((totalBillRoom2-penalityRoom2)- (totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2) );
            rentalInputs.setEachPayRoom2((penalityRoom2/noOfPersonRoom2) + (totalBillRoom1-penalityRoom1)/noOfPersonRoom2 + ((totalBillRoom2-penalityRoom2)-(totalBillRoom1-penalityRoom1))/(noOfPersonRoom1+noOfPersonRoom2) );

            System.out.println("Each person of Room1 has to pay the amount of "+rentalInputs.getEachPayRoom1());
            System.out.println("Each person of Room2 has to pay the amount of "+rentalInputs.getEachPayRoom2());
        }

        else
            System.out.println("Can you please give Room1 Total bill less than Room2 Total bill *Note (For easy calculations) ");

    }
}
