package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayList {
    public void arrayList(){
        //<String>-generics-only add string datatypes
        List<String> arrayList=new ArrayList<String>();
        //arrayList-maintain insertion order
        //Allows duplicates
        arrayList.add("Biology");
        arrayList.add("Chemistry");
        arrayList.add("Physics");
        arrayList.add("Maths");
        arrayList.add("Geomentry");
        arrayList.add("Maths");

        System.out.println("Subject - " +arrayList);
        System.out.println("Favorite subject - " +arrayList.get(3));
        System.out.println(arrayList.indexOf("Physics"));
        System.out.println(arrayList.lastIndexOf("Maths"));

        List<String> newList=new ArrayList<String>();
        newList.addAll(arrayList);
        System.out.println(newList);
        arrayList.remove(2);
        arrayList.remove("Maths");
        System.out.println(arrayList);
        arrayList.add("Accountant");
        arrayList.add("History");
        System.out.println(arrayList);

        arrayList.set(1,"Zoology");
        System.out.println("List after updating - " +arrayList);
        System.out.println(arrayList.isEmpty());

        System.out.println("---------------------------------------");
        for(String string:arrayList){
            System.out.println("Using for each - " +string);
        }
        System.out.println("---------------------------------------");
        for(int i=0;i<arrayList.size();i++){
            System.out.println("Using for loop - " +arrayList.get(i));
        }
        System.out.println("---------------------------------------");

        //both forward & backward iteration done
        ListIterator<String> List_iterator= arrayList.listIterator();
        while (List_iterator.hasNext()){
            System.out.println(List_iterator.next());
        }
        System.out.println("---------------------------------------");

        while (List_iterator.hasPrevious()){
            System.out.println(List_iterator.previous());
            System.out.println("************");
        }

        //iterator traverse only forward
        Iterator<String> iterator=arrayList.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }

    public static void main(String[] args){
        arrayList example=new arrayList();
        example.arrayList();


    }
}
