package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<E> {
    private Integer[] integers;
    private final int INIT_CAPACITY = 10;
    private int size = 0;
    private int capacity;





    public CustomArrayList() {
        this.integers = new Integer[INIT_CAPACITY]; // 10
        this.capacity = INIT_CAPACITY;
    }

    public CustomArrayList(int capacity) {
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

    public void clear() {
        this.size = 0;
        this.integers = new Integer[INIT_CAPACITY];
    }

    public int size(){
        return this.size;
    }

    public int get(int index) {
        if(index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.integers[index];
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
            subList[count] = this.integers[i];
            count++;
        }
        return subList;


    }

    public int set(int index, int newValue) {
        if(index < 0 || index >=size )
            throw new ArrayIndexOutOfBoundsException();
        int oldValue = this.integers[index];
        this.integers[index] = newValue;
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
