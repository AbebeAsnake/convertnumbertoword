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
        String var="";
        String var2="";
        String var3="";
        String var4="";
        String hun = "hundred";
        int input2,input3;

        int kk = input%10;
        input = input/10;
        var = unitsArray[kk];

        var3 = var2 +"  "+var;
        if(kk==0){
            var3 = var2;
        }
        else if(input<10){
            var2 = tensArray[input];
            var3 = var2 +" "+var;
        }
        else if(input >10) {
            input3= input;
            input = input % 10;
            input2 = input3/10;
            var2 = tensArray[input];
            var4 = unitsArray[input2];
            var3 = var4 +" "+ hun + " "+var2+" "+var;
        }
        return var3;
    }
}
