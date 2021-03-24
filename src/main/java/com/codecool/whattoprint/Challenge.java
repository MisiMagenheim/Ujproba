package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        String res = "";
        for( int i = 0; i < words.length; i++ ) {
            if (number % 21 == 0 ) {
                res = words[0] + words[1];
            }
            else if (number % 3 == 0 && number % 7 != 0) {
                res = words[0];
            }
            else if (number % 3 != 0 && number % 7 == 0) {
                res = words[1];
            }
            else {
                res = "";
            }
        }
        return res;
    }
}
