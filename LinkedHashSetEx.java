package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {



    public void linkedHashSetExample(){
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cake");
        linkedHashSet.add("10");

        System.out.println("Insertion Order  :"+ linkedHashSet);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashSetEx example= new LinkedHashSetEx();
        example.linkedHashSetExample();
    }

}
