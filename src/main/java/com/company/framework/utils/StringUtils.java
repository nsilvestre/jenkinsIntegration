package com.company.framework.utils;

import java.util.Random;

public class StringUtils {
    public static String getRandomEmail(){
        Random random = new Random();
        int randomInt = ((9000)*random.nextInt());
        if(randomInt<0){
            randomInt = randomInt*(-1);
        }
        return "myemail"+randomInt+"@myemail.com";
    }
}
