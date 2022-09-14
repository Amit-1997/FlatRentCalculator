package com.rentcalculator.Flat.Mapping;


import com.rentcalculator.Flat.Calculator.AllCalculations;
import com.rentcalculator.Flat.Model.RentalInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.Service;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    @Autowired
    RentalInputs rentalInputs;

    @Autowired
    AllCalculations allCalculations;


    @RequestMapping("/home")
    public String HomePage()
    {

        return "Hello";
    }

    @RequestMapping("/calculate")
    public ModelAndView Calculator(@ModelAttribute RentalInputs rentalInputs)
    {

        ModelAndView modelAndView=new ModelAndView();
        List<Integer> a=new ArrayList<>();
        // caseI when both penality is 0
        if(rentalInputs.getPenalityRoom1()==0 && rentalInputs.getPenalityRoom2()==0) {

        System.out.println("Inside case 1");
          a = allCalculations.calculateRentWhenBothPenalityZero(rentalInputs.getTotalBillRoom1(), rentalInputs.getTotalBillRoom2(), rentalInputs.getNoOfPersonRoom1(), rentalInputs.getNoOfPersonRoom2(), rentalInputs.getPenalityRoom1(), rentalInputs.getPenalityRoom2());

        }

        // caseII when room1 penality is greater than o and room2 penality is 0
        if(rentalInputs.getPenalityRoom1()>0 && rentalInputs.getPenalityRoom2()==0)
        {
            System.out.println("Inside case 2");
             a = allCalculations.calculateRentWhenRoomTwoPenalityZero(rentalInputs.getTotalBillRoom1(), rentalInputs.getTotalBillRoom2(), rentalInputs.getNoOfPersonRoom1(), rentalInputs.getNoOfPersonRoom2(), rentalInputs.getPenalityRoom1(), rentalInputs.getPenalityRoom2());

        }

        // caseIII when room2 penality is greater than o and room1 penality is 0

        if(rentalInputs.getPenalityRoom1()==0 && rentalInputs.getPenalityRoom2()>0)
        {
            System.out.println("Inside case 3");
            a = allCalculations.calculateRentWhenRoomOnePenalityZero(rentalInputs.getTotalBillRoom1(), rentalInputs.getTotalBillRoom2(), rentalInputs.getNoOfPersonRoom1(), rentalInputs.getNoOfPersonRoom2(), rentalInputs.getPenalityRoom1(), rentalInputs.getPenalityRoom2());

        }

        // caseIV when room2 penality is greater than o and room1 penality is greater than 0
        if(rentalInputs.getPenalityRoom1()>0 && rentalInputs.getPenalityRoom2()>0)
        {
            System.out.println("Inside case 4");
             a = allCalculations.calculateRentWhenBothPenalityGreaterThanZero(rentalInputs.getTotalBillRoom1(), rentalInputs.getTotalBillRoom2(), rentalInputs.getNoOfPersonRoom1(), rentalInputs.getNoOfPersonRoom2(), rentalInputs.getPenalityRoom1(), rentalInputs.getPenalityRoom2());

        }

        modelAndView.addObject("room1",a.get(0));
        modelAndView.addObject("room2",a.get(1));
        modelAndView.setViewName("Home");
        return modelAndView;
    }
}
