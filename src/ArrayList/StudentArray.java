package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentArray {
    private Student[] a; // reference to array
    private int nElems; // number of data items


    public boolean delete(int id) { // delete student from array
        // Student deleteStudent;

        // [2,4,6,3,1]
        //  0,1,2,3,4
        // [2,4,3,1

        boolean exist = false;
        for(int i = 0; i < this.a.length; i++) {
            if(this.a[i].getId() == id) {
                exist = true;
                this.a[i] = this.a[i+1];
                this.nElems--;
            }
        }
        return exist;
    }
}
