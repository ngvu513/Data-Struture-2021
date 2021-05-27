package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        GenderComparator genderComparator = new GenderComparator();
        Queue<Person> personQueue = new PriorityQueue<Person>(ageComparator);
        Queue<Person> personQueueByGender = new PriorityQueue<Person>(genderComparator);

        Person person1 = new Person("person1", "male", 20);
        Person person2 = new Person("person2", "female", 70);
        Person person3 = new Person("person3", "male", 30);
        Person person4 = new Person("person4", "female", 45);
        Person person5 = new Person("person5", "male", 19);

        // 20 -> 70 -> 30 -> 45 -> 19

        // 20
        personQueue.add(person1);

        // 70 -> 20
        personQueue.add(person2);

        // 70 -> 30 -> 20
        personQueue.add(person3);


        personQueue.add(person4);

        // 70 -> 45 -> 30 -> 20 -> 19
        personQueue.add(person5);

        System.out.println(personQueue.peek().toString());
        System.out.println(personQueue.size());

        while(!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }





    }

}
