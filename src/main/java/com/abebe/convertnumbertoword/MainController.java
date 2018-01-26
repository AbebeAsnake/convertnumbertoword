package com.abebe.convertnumbertoword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    public String WordToNumberConverter(){

        Scanner scn = new Scanner(System.in);
        int input= scn.nextInt();
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

             int kk = input%10;
             input = input/10;
        String var = unitsArray[kk];
        String var2 = tensArray[input];
        String var3 = var2 +" "+var;
        if(kk==0){
            var3 = var2;
        }
        return var3;
    }
}
