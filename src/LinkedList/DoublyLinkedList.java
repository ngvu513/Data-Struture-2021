package LinkedList;

public class DoublyLinkedList<E> {
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

    private void addAfter(Node<E> node, E item) {
        if(node == null) {
            Node<E> itemNode = new Node<>(null, item, null);
            head = itemNode;
        } else {
            Node<E> itemNode = new Node<>(node, item, node.next);

            node.next = itemNode;

            if(itemNode.next != null) {
                itemNode.next.prev = itemNode;
            }
        }
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
//        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
//        Node<Integer> node1 = new Node<>(null, 2, null);
//        doublyLinkedList.head = node1;
//
//        doublyLinkedList.displayLinkedList();
//
//
//        doublyLinkedList.addAfter(node1, 5);
//        doublyLinkedList.displayLinkedList();

        DoublyLinkedList<Integer> doublyLinkedList2 = new DoublyLinkedList<>();
        doublyLinkedList2.addAfter(null, 9);
        doublyLinkedList2.displayLinkedList();


    }
}
