package com.finops.CustomerService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {

    @GetMapping("create-account/{name}/{age}/{mobileNumber}/{emailId}/{address}/{nominee}/{aadharNumber}")
    public String createBankAccount(@PathVariable String name,
                                    @PathVariable int age,
                                    @PathVariable String mobileNumber,
                                    @PathVariable String emailId,
                                    @PathVariable String address,
                                    @PathVariable String nominee,
                                    @PathVariable String aadharNumber){

        if(name.length()==0){
            return "Name is mandatory";
        }
        if(age ==0){
            return "Age should not be zero.";
        }
        if(mobileNumber.length()==0){
            return "Please provide mobile number.";
        }
        if(emailId.length() == 0){
            return " Please provide emailId";
        }
        if(address.length()==0){
            return "Please provide address.";

        }
        if(nominee.length()==0){
            return "Please provide nominee details";
        }
        if(aadharNumber.length()==0){
            return "Please provide aadhar number.";
        }

        return "Account created succesfully for "+name;

    }
}
