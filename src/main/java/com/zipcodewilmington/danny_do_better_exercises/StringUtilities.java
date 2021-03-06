package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String returnString = "";
        for(int i = 0; i < 3; i++){
            returnString = returnString + input.charAt(i);
        }
        return returnString;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String returnString = "";
        for(int i = input.length() - 3; i < input.length(); i++){
            returnString = returnString + input.charAt(i);
        }
        return returnString;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if(inputValue.equals(comparableValue)){
            return true;
        }
        return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int x = inputValue.length() / 2;
        if(x % 2 == 0){
            x--;
        }
        return inputValue.charAt(x);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String returnString = "";
        for(int i = 0; i < spaceDelimitedString.length(); i++){
            if(spaceDelimitedString.charAt(i) != ' '){
                returnString = returnString + spaceDelimitedString.charAt(i);
                continue;
            }
        break;
        }
        return returnString;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String returnString = "";
        for(int i = 0; i < spaceDelimitedString.length(); i++){
            if(spaceDelimitedString.charAt(i) == ' '){
                for(int j = i + 1; j < spaceDelimitedString.length(); j++){
                    returnString = returnString + spaceDelimitedString.charAt(j);
                }
            }
        }
        return returnString;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String returnString = "";
        for(int i = 1; i <= stringToReverse.length(); i++){
            returnString = returnString + stringToReverse.charAt(stringToReverse.length() - i);
        }
        return returnString;
    }
}
