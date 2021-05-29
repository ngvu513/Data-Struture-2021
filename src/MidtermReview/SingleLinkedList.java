package MidtermReview;


import java.util.EmptyStackException;
import java.util.Stack;

public class SingleLinkedList<E> {


    public E push(E obj) {
        addFirst(obj);
        return head.data;
    }

    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();

        return head.data;
    }

    public E pop() {
        if(isEmpty())
            throw new EmptyStackException();

        E hand = head.data;
        removeFirst();
        return hand;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private static class Node<E>{

        // Data fields
        private E data;
        private Node<E> next;

        public Node (E item) {
            this.data = item;
            this.next = null;
        }
        public Node (E item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }
    }

    private Node<E> head = null;
    private int size = 0;


    // helper methods
    private void addFirst(E item){
        Node<E> temp = new Node<>(item, head);  // node creation , made it point at the head
        head = temp; // update the head
        size++;
    }

    //   head --> [Dean] --> [Zaineh]
    private void addAfter(E item, Node<E> node){     // "John" , [Dean]
        Node<E> temp = new Node<>(item, node.next);  // [John] --> [Zaineh]
        node.next = temp;                            // [Dean] --> [John] --> [Zaineh]
        size++;
    }

    private E removeAfter(Node<E> node){
        Node<E> toRemove  = node.next;

        if(toRemove != null){
            node.next = toRemove.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private E removeFirst(){
        Node<E> toRemove = head;
        if(head != null){
            head = head.next;
            size--;
            return toRemove.data;
        }
        else
            return null;

    }


    private Node<E> getNode(int index){
        Node<E> node = head;
        for(int i =0 ; i<index && node != null ; i++){
            node = node.next;
        }
        return node;
    }

    private void traverse(){
        Node<E> current = head;
        while(current != null){
            // TODO write your answer here...

            current = current.next;
        }
    }

//    private int count(){
//        Node<E> current = head;
//        int count = 0;
//        while(current != null){
//            // TODO write your answer here...
//            if() {
//                count++;
//            }
//            current = current.next;
//        }
//
//        return count;
//    }

    public int findHighGrades(){
        int count = 0;
        Node<E> current = head;
        while(current != null){

            if(current.data.equals("A") || current.data.equals("A-") || current.data.equals("A+"))
                count++;
            current = current.next;
        }
        return count;
    }

    // public methods
    public E get(int index){
        if(index < 0 || index >size)
            throw new ArrayIndexOutOfBoundsException();

        Node<E> node = getNode(index);
        return node.data;
    }

    public int size(){
        return this.size;
    }

    public void add(int index, E item){  // add(2,"f")//   [a] -> [b] -> [f] -> [c] -> null
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index == 0){
            addFirst(item);
        }
        else{
            Node<E> node = getNode(index - 1);
            addAfter(item, node);
        }
    }

    public void add(E item){
        add(size, item);
    }

    public boolean removeItem(E item){
        if(head == null){
            return false;
        }
        Node<E> current = head; // ???
        if (item.equals(current.data)){
            removeFirst();
            return true;
        }
        while(current.next != null){
            if(item.equals(current.next.data)){
                removeAfter(current);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E remove(int index){
        // TODO add implementation
        return null;
    }


    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }



    public static void main(String [] args){

        SingleLinkedList<String> list = new SingleLinkedList<>();

        list.add(0,"Dean");
        list.add(0,"Zaineh");
        list.add(1,"Yasmeen");
        list.add("Eggie");
        list.add("John");
        list.removeItem("John");
        list.removeItem("Yasmeen");
        list.removeItem("Zaineh");

//        list.removeItem("Yasmeen");
//        list.removeItem("Dean");
        System.out.println(list);






//        Node<String> node1 = new Node<>("Dean");
//        Node<String> node2 = new Node<>("John");
//        Node<String> node3 = new Node<>("Zaineh");
//        Node<String> node4 = new Node<>("Yasmeen");
//
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4; // -->

        //System.out.println(node1.next.next.data);
        //System.out.println(node4.next);
    }
}
