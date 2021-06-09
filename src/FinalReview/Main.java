package FinalReview;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int mystery(int n)
    {
        if (n == 0)
            return 1;
        else
            return 3 * mystery (n - 1);
    }

    // n = 3
    // 3 * 3 * 3 * 1 = 27

    // n = 2
    // 3 * 3 * 1

    // n = 1
    // 3 * 1

    // n = 0
    // 1


    // 3 * 3 * 3 * 1 = 27



    public static void main(String[] args) {
//        Queue<String> qs = new LinkedList<>();
//
//        qs.offer("John"); //
//        qs.offer("Dave");
//        qs.offer("Bob");
//
////        System.out.println(qs.peek());
//
//
//        qs.offer(qs.peek()); // John, Dave, Bob, John
//        System.out.println(qs);
//
//        qs.offer(qs.poll()); // Dave, Bob, John, John
//        System.out.println(qs);
        System.out.println(Main.mystery(3));



    }
}
