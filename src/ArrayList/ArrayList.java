package ArrayList;

import java.util.Arrays;
import java.util.Random;

public class ArrayList {
    private Integer[] integers;
    private final int INIT_CAPACITY = 10;
    private int size = 0;
    private int capacity;





    public ArrayList() {
        this.integers = new Integer[INIT_CAPACITY]; // 10
        this.capacity = INIT_CAPACITY;
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.integers = new Integer[capacity];
    }

    public void insert(int element)  {
        // size == capacity
        // size more than capacity
        if(this.size == this.capacity) {
            // increase size
            this.reAllocate();
        }

        integers[size] = element;
        size++;
    }



    // define an empty array
    // loop through integers
    // if does not contain add to the new array
    //



    // 1,3,,5,2,1,1,5
    public boolean contains(Integer[] tempIntegers, int tepmSize, int num) {
        // System.out.println(num);
        for(int i = 0; i < tepmSize; i++) {
            if(tempIntegers[i] == num) {
                return true;
            }
        }
        return false;
    }

    public void removeDuplicates() {
        Integer[] tempIntegers = new Integer[this.capacity]; // [1,3,5, 2]
        int tempSize = 0;
        for(int i = 0; i < this.size; i++) {
            if(!this.contains(tempIntegers, tempSize, this.integers[i])) {

                tempIntegers[tempSize] = this.integers[i];
                tempSize++;
            }
        }

        this.integers = Arrays.copyOf(tempIntegers, this.capacity);
        this.size = tempSize;
    }

    public void reAllocate() {
        this.capacity = this.capacity * 2; // 40
        // copy from the old array to the new array with the new capacity
        this.integers = Arrays.copyOf(this.integers, this.capacity);
    }


    // [234
    // ,4342,7535,2324,5]
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = 0; i < this.size - 1; i++) {
            stringBuilder.append(this.integers[i].toString());
            stringBuilder.append(",");
        }
        stringBuilder.append(this.integers[this.size - 1].toString());
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
        ArrayList arrayList1 = new ArrayList(20);

        arrayList1.insert(2);
        arrayList1.insert(3);
        arrayList1.insert(2);
        arrayList1.insert(4);
        arrayList1.insert(3);
        arrayList1.insert(2);


        // arrayList1.insert(2);

        System.out.println(arrayList1.toString());

        arrayList1.removeDuplicates();

       System.out.println(arrayList1.toString());


    }
}
