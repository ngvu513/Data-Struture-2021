package FinalReview;

import java.util.NoSuchElementException;

public class ExamLinkedQueue<E> implements MyQueue<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size;

    // NODE CLASS
    private static class Node<E>{
        private E data;
        private Node<E> next;

        private Node (E data){
            this.data = data;
            this.next = null;
        }
        private Node (E data, Node<E> ref){
            this.data = data;
            this.next = ref;
        }
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<E> (e);
        if(front == null){              // In this case update both front and rear
            rear = newNode;
            front = rear;
        }else{
            rear.next = newNode;        // Add to rear/tail
            rear = rear.next;           // Update rear/tail
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(E e) {
        Node<E> newNode = new Node<E>(e);
        if(front == null){              // In this case update both front and rear
            rear = newNode;
            front = rear;
        }else{
            rear.next = newNode;        // Add to rear/tail
            rear = rear.next;           // Update rear/tail
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        if(front == null) {
            throw new NullPointerException();
        }
        Node<E> temp = front;
        front = front.next;
        size--;
        return temp.data;
    }

    @Override
    public E poll() {
        // write your answer here...
        if(front == null) {
            return null;
        }
        Node<E> temp = front;
        front = front.next;
        size--;
        return temp.data;
    }

    @Override
    public E element() {
        if(size == 0){
            throw new NoSuchElementException();
        } else {
            return front.data;
        }
    }

    @Override
    public E peek() {
        if(size == 0){
            return null;
        } else {
            return front.data;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    public String[] flushtoArray(){
        // write your answer here...
        String[] stringArray = new String[size];
        int index = 0;

        Node<E> current = front;
        while(current != null) {
            stringArray[index++] = (String) current.data;

            current = current.next;
        }
        return stringArray;
    }

    public static void main (String[] args){

        ExamLinkedQueue<String> q = new ExamLinkedQueue<>();
        q.offer("John");
        q.offer("Dave");
        q.offer("Bob");

        String[] names = q.flushtoArray();
        for(String n : names){
            System.out.println(n);
        }
        /**************
         Expected answer:

         John
         Dave
         Bob
         **************/



    }
}