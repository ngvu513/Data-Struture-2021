package SetColection;

import java.util.*;

public class Assignment10 {

    public static Map<String, Integer> removeDuplicates(List<String> list) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String string: list) {
            hashMap.put(string, hashMap.size());
        }
//        hashMap.get()
        return hashMap;
    }


    public int countDistinctValue(List<String> strings) {
        Set<String> set = new HashSet<>();
        set.addAll(strings);
        return set.size();
    }


    public HashMap<String, Integer> mergeTwoArray(List<String> strings, List<Integer> integers) {
        HashMap<String, Integer> hashMapOutput = new LinkedHashMap<>();
        int size = 0;
        if(strings.size() < integers.size()){
            size = strings.size();
        } else {
            size = integers.size();
        }
        for(int i = 0; i < size; i++) {
            hashMapOutput.put(strings.get(i), integers.get(i));
        }
        return hashMapOutput;
    }

    // {("CS221", {}), ("g", 69), ("u", 8)}

    public HashMap<String, Course> addToMap(List<Course> courses) {
        HashMap<String, Course> courseHashMap = new HashMap<>();

        for (Course course: courses) {
            courseHashMap.put(course.getcID(), course);
        }
        return courseHashMap;
    }




    public static void main(String[] args) {
//        Set<String> set = new LinkedHashSet<String>();
//
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        hashMap.put(1,7);
//        hashMap.put(2,26);
//        System.out.println(hashMap.get(7));
//        hashMap.entrySet();

        List<String> strings = Arrays.asList("Dean", "Dave", "Dave", "Zaineh", "Zaineh" , "Yasmeen");
//
//        // System.out.println(SetCollection.removeDuplicates(strings));
        Assignment10 assignment10 = new Assignment10();


        System.out.println(Assignment10.removeDuplicates(strings));
//
//        System.out.println(assignment10.countDistinctValue(strings));


//        List<String> list1 = Arrays.asList("Dean", "Dave", "Zaineh");
//        List<Integer> list2 = Arrays.asList(90 , 80 , 94);

        // Output [“Dean” =>90, “Dave” =>80, “Zaineh”=>94) ]
        // System.out.println(assignment10.mergeTwoArray(list1, list2));



//        List<String> listA = Arrays.asList("Ann", "Sally", "Jill");
//        Set<String> setA = new HashSet<>();
//        setA.addAll(listA);
//        System.out.println(setA);
//
//
//        List<String> listB = Arrays.asList("Bob", "Ann", "Jill", "Bill");
//        Set<String> setB = new HashSet<>();
//        setB.addAll(listB);
//        System.out.println(setB);
//
//        // intersection : Ann, Jill
//
//        System.out.println(setA.retainAll(setB));
//        System.out.println(setA);

//        List<Integer> integers1 = Arrays.asList(1,2,3,4);
//        List<Integer> integers2 = Arrays.asList(7,8,9,11);
//        List<Integer> integers3 = Arrays.asList(3,4,5,6);
//
//        integers1.addAll(integers2);


        //[2,3,6,7]
        // arr[0]
        // {("a", 5), ("g", 69), ("u", 8)}

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("a", 5);
        stringIntegerHashMap.put("g", 69);
        stringIntegerHashMap.put("u", 8);

        for (Map.Entry<String, Integer> item: stringIntegerHashMap.entrySet()) {
            if(item.getValue() == 8)
                System.out.println(item.getKey() + " : " + item.getValue());
        }

        System.out.println(stringIntegerHashMap.get("u"));


//        Course course1 = new Course("C289", "Data Structure", 100);
//        Course course2 = new Course("C203", "OOP", 200);
//        Course course3 = new Course("C205", "Math", 500);
//
//        List<Course> courseList = Arrays.asList(course1, course2, course3);
//
//        System.out.println(assignment10.addToMap(courseList));


        HashMap<Integer,String> smartphones = new HashMap<Integer,String>();
        smartphones.put(1, "iPhone");
        smartphones.put(4, "Samsung");
        smartphones.put(3, "Huawei");
        smartphones.put(7, "Nokia");
        smartphones.put(7, "Pixel");

        for (Integer k : smartphones.keySet()){
            System.out.println(k);
        }

        HashSet<String> set = new HashSet();
        set.add("Java");
        set.add("Swing");
        set.add("Spring");
        set.add("Java");
        set.remove("Java");
        System.out.println(set);
        System.out.println(set.contains("Swing"));


    }
}
