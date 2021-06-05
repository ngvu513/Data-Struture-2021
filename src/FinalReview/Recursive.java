package FinalReview;

import java.util.ArrayList;
import java.util.List;

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

//    public boolean hasDuplicate(int[] arr){
//        return hasDuplicate(arr[0], arr, 0);
//    }
//
//    public boolean hasDuplicate(int number, int[] arr, int index) {
//
//        if(index == arr.length - 1) {
//            return false;
//        }
//
//        for(int i = index + 1; i < arr.length; i++) {
//            if(number == arr[i]) {
//                return true;
//            }
//        }
//        index++;
//        return hasDuplicate(arr[index], arr, index);
//
//    }


    public List<Integer> countDuplicate(int[] arr){
        return countDuplicate(arr[0], arr, 0);
    }

    public List<Integer> countDuplicate(int number, int[] arr, int index) {

        if(index == arr.length - 1) {
            return new ArrayList<>();
        }
        List<Integer> integers = new ArrayList<>();
        for(int i = index + 1; i < arr.length; i++) {
            if(number == arr[i]) {
                integers.add(number);
            }
        }
        index++;
        integers.addAll(countDuplicate(arr[index], arr, index));
        return integers;
    }


    public static void main(String[] args) {
        // System.out.println(Recursive.convert(30));
        // System.out.println(Recursive.countVowels("Evening sessions"));

        //
        int [] nums1 = {1, 2, 1, 2, 5};


        Recursive recursive = new Recursive();
        System.out.println(recursive.countDuplicate(nums1));

        // [1, 2, 1, 2, 5]
        // 1 compare [2, 1, 2, 5] , add [1]
        // 2 compare [1, 2, 5], add [1,2]
        // 1 compare [2, 5], add [1,2]


    }
}
