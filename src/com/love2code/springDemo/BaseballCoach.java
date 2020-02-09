package com.love2code.springDemo;

public class BaseballCoach implements Coach {

    //define private constructor
    private FortuneService fortuneService;

    //define a constructor
    public BaseballCoach(FortuneService fortuneService){
        fortuneService = this.fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
