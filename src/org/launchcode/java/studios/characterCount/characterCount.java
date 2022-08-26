package org.launchcode.java.studios.characterCount;

import java.util.HashMap;

public class characterCount {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();
        for(int x=0; x<charactersInString.length; x++){
            char letter = charactersInString[x];
            int count =1;
            letterCount.put(letter, count);
        }

    }
}
