package com.myCodeTest.demo;

import org.springframework.stereotype.Component;

@Component
public class StringService {

    public String caseReversal(String input) {
        if ((input != null && !input.isEmpty()) && input.matches("[^a-zA-Z]+")) {
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isLowerCase(charArray[i])) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                } else {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
            }
            return new String(charArray);
        } else {
            return "Invalid character in input string";
        }
    }

}
