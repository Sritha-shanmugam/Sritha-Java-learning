package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class hashSetExample {
    public void hashSetExamples(){
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("On");
        hashSet.add("in");
        hashSet.add("at");
        hashSet.add("under");
        hashSet.add("below");
        System.out.println("Preposition - " +hashSet);
        System.out.println(hashSet.contains("in"));
    }
    public void iteratorHashSetEx(){
        HashSet<String>hashSet= new HashSet<String>();
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("A");

        Iterator< String> iterator= hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println("Elements of HashSet :"+ iterator.next());
        }
        System.out.println("-------------------------------------");

    }
    public void hashSetLoopEX(){
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Tamil");
        hashSet.add("English");
        hashSet.add("Maths");
        hashSet.add("Science");
        hashSet.add("Social");
        System.out.println("Subjects - " +hashSet);
        for (String string : hashSet) {
            System.out.println("Subjects in linkedList - " +string);
        }
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args){
        hashSetExample hash=new hashSetExample();
        hash.hashSetExamples();
        hash.iteratorHashSetEx();
        hash.hashSetLoopEX();

    }
}
