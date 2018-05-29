package service;

import org.springframework.stereotype.Component;

@Component
public class StringOperationService {

    public boolean isCharacterArray(char[] c) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (!Character.isLetter(c[i])) {
                count++;
            }
        }

        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String caseReversal(String input) {
        if (input != null && !input.isEmpty()) {
            char[] charArray = input.toCharArray();

            if (isCharacterArray(charArray)) {
                for (int i = 0; i < charArray.length; i++) {
                    if (Character.isLowerCase(charArray[i])) {
                        charArray[i] = Character.toUpperCase(charArray[i]);
                    } else {
                        charArray[i] = Character.toLowerCase(charArray[i]);
                    }
                }
            }
            return new String(charArray);
        } else {
            return "Invalid character in input string";
        }
    }
}
