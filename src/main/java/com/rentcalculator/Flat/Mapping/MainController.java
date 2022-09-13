package com.rentcalculator.Flat.Mapping;


import com.rentcalculator.Flat.Calculator.AllCalculations;
import com.rentcalculator.Flat.Model.RentalInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

    @Autowired
    RentalInputs rentalInputs;

    @Autowired
    AllCalculations allCalculations;


    @RequestMapping("/home")
    public String HomePage()
    {
        return "Home";
    }

    @RequestMapping("/calculate")
    public String Calculator(@ModelAttribute RentalInputs rentalInputs)
    {


        // caseI when both penality is 0
        if(rentalInputs.getPenalityRoom1()==0 && rentalInputs.getPenalityRoom2()==0) {
            allCalculations.calculateRentWhenBothPenalityZero(rentalInputs.getTotalBillRoom1(), rentalInputs.getTotalBillRoom2(), rentalInputs.getNoOfPersonRoom1(), rentalInputs.getNoOfPersonRoom2(), rentalInputs.getPenalityRoom1(), rentalInputs.getPenalityRoom2());

        }

        // caseII when room1 penality is greater than o and room2 penality is 0
        if(rentalInputs.getPenalityRoom1()>0 && rentalInputs.getPenalityRoom2()==0)
        {
            allCalculations.calculateRentWhenRoomTwoPenalityZero(rentalInputs.getTotalBillRoom1(),rentalInputs.getTotalBillRoom2(),rentalInputs.getNoOfPersonRoom1(),rentalInputs.getNoOfPersonRoom2(),rentalInputs.getPenalityRoom1(),rentalInputs.getPenalityRoom2());
        }

        // caseIII when room2 penality is greater than o and room1 penality is 0

        if(rentalInputs.getPenalityRoom1()==0 && rentalInputs.getPenalityRoom2()>0)
        {
            allCalculations.calculateRentWhenRoomOnePenalityZero(rentalInputs.getTotalBillRoom1(),rentalInputs.getTotalBillRoom2(),rentalInputs.getNoOfPersonRoom1(),rentalInputs.getNoOfPersonRoom2(),rentalInputs.getPenalityRoom1(),rentalInputs.getPenalityRoom2());
        }

        // caseIV when room2 penality is greater than o and room1 penality is greater than 0
        if(rentalInputs.getPenalityRoom1()>0 && rentalInputs.getPenalityRoom2()>0)
        {
            allCalculations.calculateRentWhenBothPenalityZero(rentalInputs.getTotalBillRoom1(),rentalInputs.getTotalBillRoom2(),rentalInputs.getNoOfPersonRoom1(),rentalInputs.getNoOfPersonRoom2(),rentalInputs.getPenalityRoom1(),rentalInputs.getPenalityRoom2());
        }

        return "Hello";
    }
}
