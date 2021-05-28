package MidtermReview;

import java.util.Arrays;

public class CustomArrayList<E> {
    private E[] items;
    private final int INIT_CAPACITY = 10;
    private int size = 0;
    private int capacity;





    public CustomArrayList() {
        this.items = (E[]) new Object[INIT_CAPACITY]; // 10
        this.capacity = INIT_CAPACITY;
    }

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        this.items = (E[]) new Object[capacity];
    }

    public void insert(E element)  {
        // size == capacity
        // size more than capacity
        if(this.size == this.capacity) {
            // increase size
            this.reAllocate();
        }

        items[size] = element;
        size++;
    }

    public void clear() {
        this.size = 0;
        this.items = (E[]) new Object[INIT_CAPACITY];
    }

    public int size(){
        return this.size;
    }

    public int get(int index) {
        if(index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (int) this.items[index];
    }


    public int[] subList(int start, int end){
        //  0,1,2,3,4,5,6
        // [1,3,5,2,1,1,5]
        //  subList from index 2 to 5
        // [5,2,1,1]
        if (start < 0 || start >=size || end <= 0 || end > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // Integer[] integers = Arrays.copyOfRange(this.integers, start, end);
        int[] subList = new int[end - start + 1];
        int count = 0;
        for(int i = start; i <= end; i++) {
            subList[count] = (int) this.items[i];
            count++;
        }
        return subList;


    }

    public int set(int index, E newValue) {
        if(index < 0 || index >=size )
            throw new ArrayIndexOutOfBoundsException();
        int oldValue = (int) this.items[index];
        this.items[index] = newValue;
        return oldValue;
    }

    // define an empty array
    // loop through integers
    // if does not contain add to the new array
    //


    //  0,1,2,3,4,5
    // [2,3,2,4,3,2]

    //  0,1,2
    // [2,3,4]
    // [2,3,4]

    public boolean contains(E[] tempIntegers, int tepmSize, E num) {
        // System.out.println(num);
        for(int i = 0; i < tepmSize; i++) {
            if(tempIntegers[i] == num) {
                return true;
            }
        }
        return false;
    }

    public void removeDuplicates() {
        E[] tempIntegers = (E[]) new Object[this.capacity]; // [1,3,5, 2]
        int tempSize = 0;
        for(int i = 0; i < this.size; i++) {
            if(!this.contains(tempIntegers, tempSize, this.items[i])) {

                tempIntegers[tempSize] = this.items[i];
                tempSize++;
            }
        }

        this.items = Arrays.copyOf(tempIntegers, this.capacity);
        this.size = tempSize;
    }

    public void removeAllOf(E target) {
        E[] tempItems = (E[]) new Object[capacity];
        int j = 0;
        for(int i = 0; i < size; i++) { // O(n)
            if(!items[i].equals(target)) {
                tempItems[j] = items[i];
                j++;
            }
        }
        size = j;
        items = tempItems;
    }
    // O(n)
    // O(n^2)

    public void reAllocate() {
        this.capacity = this.capacity * 2; // 40
        // copy from the old array to the new array with the new capacity
        this.items = Arrays.copyOf(this.items, this.capacity);
    }


    // [234
    // ,4342,7535,2324,5]
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = 0; i < this.size - 1; i++) {
            stringBuilder.append(this.items[i].toString());
            stringBuilder.append(",");
        }
        stringBuilder.append(this.items[this.size - 1].toString());
        stringBuilder.append("]");
        stringBuilder.append("size : " + this.size );
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//
//        for(int i = 0; i < 10; i++) {
//            Random random = new Random();
//            int num = random.nextInt(100);
//            arrayList.insert(num);
//        }
//
//        System.out.println(arrayList.toString());


        // Integer[] integers   [1,34,23,6,2]

        // int[] ints = new int[20];


        // ArrayList arrayList  [24,6,2,8,2]
        CustomArrayList arrayList1 = new CustomArrayList(20);

        arrayList1.insert(2);
        arrayList1.insert(3);
        arrayList1.insert(2);
        arrayList1.insert(4);
        arrayList1.insert(3);
        arrayList1.insert(2);
        System.out.println(arrayList1.toString());


        System.out.println(arrayList1.set(2, 8));
        System.out.println(arrayList1.toString());

//        int[] subList = arrayList1.subList(2,5);
//
//
//        System.out.println(Arrays.toString(subList));
        // arrayList1.insert(2);

//
//        arrayList1.removeDuplicates();
//
//       System.out.println(arrayList1.toString());

        // ArrayList

    }
}
