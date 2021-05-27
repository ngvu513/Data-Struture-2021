package quiz;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Given the following skeleton class,
// make a LinkedList stack by writing the implementation for the push() and pop() methods.
public class QuizLinkedStack<E> {

    private static class Node<E> {

        private E data;
        private Node<E> next;

        private Node(E item) {
            data = item;
            next = null;
        }

        private Node(E item, Node<E> ref) {
            this.data = item;
            this.next = ref;
        }

    }


    Node<E> head = null;
    int size = 0;

    public E push(E obj) {
        // TODO answer here...
        Node<E> temp = new Node<>(obj, head);
        head = temp;
        return obj;
    }

    public E pop() {
        // TODO answer here...
        if(head == null) return null;
        Node<E> temp = head;
        head = head.next;
        return temp.data;
    }

    public void display() {
        Node<E> curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        QuizLinkedStack<Integer> quizLinkedStack = new QuizLinkedStack<>();
        quizLinkedStack.push(2);
        quizLinkedStack.push(6);
        quizLinkedStack.push(9);

        quizLinkedStack.display();
        quizLinkedStack.pop();
        quizLinkedStack.display();

        Stack<Integer> integerStack = new Stack<>();
        Queue<Integer> integerQueue = new LinkedList<>();

    }
}
