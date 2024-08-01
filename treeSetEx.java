package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetEx {
    public void treeSetEX(){
        TreeSet<Integer> treeSet=new TreeSet<Integer>();
        treeSet.add(63);
        treeSet.add(5);
        treeSet.add(23);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(78);
        System.out.println("Sorting Numbers - " +treeSet);
        //greater than given number
        System.out.println("Values lesser than given number - " +treeSet.headSet(23));
        System.out.println("Values equal to or higher than given number - " +treeSet.tailSet(23));
        System.out.println("Subset values - " +treeSet.subSet(2,23));
        System.out.println("Comparator - " +treeSet.comparator());
        System.out.println("The next Higher = " +treeSet.higher(5));
        System.out.println("The next lower = " +treeSet.lower(5));
        System.out.println("Poll first = " +treeSet.pollFirst());
        System.out.println("Poll last = " +treeSet.pollLast());
        //Normal Iterator
        Iterator<Integer> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println("Normal Iterator : " +iterator.next());
        }
        System.out.println("*************************************");
        Iterator<Integer> desendingIterator=treeSet.descendingIterator();
        while(desendingIterator.hasNext()){
            System.out.println("Desending Numbers : " +desendingIterator.next());
        }
    }

    public static void main(String[] args){
        treeSetEx example=new treeSetEx();
        example.treeSetEX();
    }
}
