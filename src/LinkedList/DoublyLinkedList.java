package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class DoublyLinkedList<E> {
    // LinkedList<E> linkedList = new LinkedList<>();

    private Node<E> head;
    private int size;

    static class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> addAfter(Node<E> node, E item) {
        Node<E> itemNode;
        if(node == null) {
            itemNode = new Node<>(null, item, null);
            head = itemNode;
        } else {
            itemNode = new Node<>(node, item, node.next);

            node.next = itemNode;

            if(itemNode.next != null) {
                itemNode.next.prev = itemNode;
            }
        }
        return itemNode;
    }

    private E removeFirst() {
        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        return temp.data;
    }

    public E remove(int index) {
        Node<E> temp = head;
        int i = 0;
        while(temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return temp.data;

    }

    private E removeAfter(Node<E> node) {
        Node<E> nodeA = node.next;
        node.next = nodeA.next;
        nodeA.next.prev = node;
        return nodeA.data;
    }

    public void displayLinkedList() {
        Node<E> cur = head;
        while (cur != null ) {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.print("null" + "\n");
    }



    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        Node<Integer> node1 = new Node<>(null, 2, null);
        doublyLinkedList.head = node1;

        doublyLinkedList.addAfter(node1, 5);
        doublyLinkedList.addAfter(node1, 9);
        Node<Integer> node10 = doublyLinkedList.addAfter(node1, 10);
        doublyLinkedList.addAfter(node1, 6);
        doublyLinkedList.displayLinkedList();
        // doublyLinkedList.remove(2);
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeAfter(node10);
        doublyLinkedList.displayLinkedList();
//
//        DoublyLinkedList<Integer> doublyLinkedList2 = new DoublyLinkedList<Integer>();
//        doublyLinkedList2.addAfter(null, 9);
//        doublyLinkedList2.displayLinkedList();


    }
}
