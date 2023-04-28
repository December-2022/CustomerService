package com.finops.CustomerService.controller;


import com.finops.CustomerService.model.Voter;
import org.springframework.web.bind.annotation.*;

@RestController
public class VoterController {

    @GetMapping("/create-vote/{name}/{age}")
    public String createVoter(@PathVariable String name, @PathVariable int age){

        if(age > 18){
            return name + " is eligible for voting, and added to voter list successfully.";
        }else{
            return name + " is not eligible for voting, coud not add to the voter list.";
        }


    }


    @GetMapping("/create-vote-v2")
    public String createVoterV2(@RequestParam String name, @RequestParam int age){
        if(age > 18){
            return name + " is eligible for voting, and added to voter list successfully.";
        }else{
            return name + " is not eligible for voting, coud not add to the voter list.";
        }
    }

    @PostMapping("/create-vote-v3")
    public String createVoteV3(@RequestBody Voter voter){

        if(voter.getAge() > 18){
            return voter.getName() + " is eligible for voting, and added to voter list successfully.";
        }else{
            return voter.getName() + " is not eligible for voting, coud not add to the voter list.";
        }

    }
}
