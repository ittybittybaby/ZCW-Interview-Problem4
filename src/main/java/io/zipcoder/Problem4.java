package io.zipcoder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

    public String canBePalindrome(String input) {

        String returnValue = "NO";

        String[] splitInput = input.split("");
        List<String> letters = Arrays.stream(splitInput).distinct().collect(Collectors.toList());
        Integer[] letterCount = new Integer[letters.size()];

        for(int i = 0; i < letters.size(); i++) {
            letterCount[i] = 0;
            for(int j = 0; j < splitInput.length; j++) {
                if(splitInput[j].equals(letters.get(i))) {
                    letterCount[i]++;
                }
            }
        }

        int odds = 0;

        for(int i = 0; i < letterCount.length; i++) {
            if(letterCount[i] % 2 != 0) {
                odds++;
            }
        }

        if(odds <= 1) {
            returnValue = "YES";
        }

        return returnValue;
    }

}
