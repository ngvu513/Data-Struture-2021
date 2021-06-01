package Recursive;

public class Recursive {
    public static String convert(int decimal) {

        if(decimal >= 1) {
            decimal = decimal/2;
            int remainder = decimal%2;
            return remainder + Recursive.convert(decimal);
        } else {
            return "";
        }
    }

//    public  String convert(int decimal) {
//        if(decimal >= 1 ) {
//            decimal = decimal/2;
//            int remainder = decimal % 2;
//            return remainder + convert(decimal);
//        } else {
//            return "";
//        }
//    }


    // "Evening sessions"
    // 1 + "vening sessions"
    // 1 + 0 + "ening sessions"




    public static int countVowels(String givenStr) {
        if(givenStr.length()==0) return 0;
        return checkVowels(givenStr.charAt(0)) + Recursive.countVowels(givenStr.substring(1));
    }

    public static int checkVowels(char ch) {
        if(ch == 'o' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'a' ||
        ch == 'O' || ch == 'I' || ch == 'U' || ch == 'E' || ch == 'A') {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        // System.out.println(Recursive.convert(30));
        System.out.println(Recursive.countVowels("Evening sessions"));



    }
}
