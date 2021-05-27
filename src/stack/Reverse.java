package stack;

// Write a method that reads a line and reverses the words in the line (not the characters)  using a Stack API.
// For example, given the following input: "The quick brown fox jumps over the lazy dog"
// you should get the following output:
// "dog lazy the over jumps fox brown quick The

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static String reverse(String strInput) {
        String result = "";
        Stack<String> stringStack = new Stack<>();
        // strInput = "The quick brown fox jumps over the lazy dog"

        String[] strings = strInput.split(" ");
        // strings = [The,quick,brown,fox,jumps,over,the,lazy,dog]


        for (String word: strings) {
            stringStack.push(word);
        }

        for(int i = 0; i < strings.length; i++) {
            result +=  stringStack.pop() +  " ";
        }
        return result;
    }


    // push each elements to the stack
    // before push the next one
    //     check with previous element match with next one or not
    //     if it match remove from the top of stack
    //     if it not match continue push to the stack

    // s = "()[]{}"
    public static boolean isValid(String s) {
        Stack<Character> strStack = new Stack<>();
        char[] chars = s.toCharArray();

//        System.out.println(Arrays.toString(chars));

        for (char element: chars) {
            if(strStack.isEmpty()) {
                strStack.push(element);
            } else {
                char top = strStack.peek();
//                System.out.println(top);
//                System.out.println(element);
//                System.out.println(Reverse.checkMatch(top, element));
                if(Reverse.checkMatch(top, element)) {
                    strStack.pop();
                } else {
                    strStack.push(element);
                }
            }
        }

//        System.out.println(strStack);

        if(strStack.isEmpty())
            return true;

        return false;
    }

    public static boolean checkMatch(Character char1, Character char2) {
        if((char1.equals('(') &&  char2.equals(')')) ||
                (char1.equals('{') &&  char2.equals('}')) ||
                (char1.equals('[') &&  char2.equals(']'))) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        // System.out.println(Reverse.reverse("The quick brown fox jumps over the lazy dog"));
        String s = "{{}[][[[]]]}";
        System.out.println(Reverse.isValid(s));
        // System.out.println(Reverse.checkMatch('(', ')'));

    }

}
