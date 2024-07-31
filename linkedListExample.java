import java.util.LinkedList;

public static class linkedListExample {

    public void linkedListOperationsExample(){
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(11);
        linkedList.add(13);
        linkedList.add(17);
        linkedList.add(19);
        linkedList.addFirst(0);
        System.out.println("LinkedList - " +linkedList);
        linkedList.addLast(23);
        System.out.println("LinkedList after adding - " +linkedList);

        //Remove
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after Remove Operation - " +linkedList);
        System.out.println("*****************************************");

        linkedList.poll();
        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println("After polling - " +linkedList);
        System.out.println("-----------------------------------------");
        linkedList.removeFirstOccurrence(3);
        System.out.println(linkedList);
        System.out.println("-----------------------------------------");
    }
    public void iterateLinkedListWithSimpleForLoop(){
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("e");
        linkedList.add("i");
        linkedList.add("o");
        linkedList.add("u");
        System.out.println("Simple for loop - " +linkedList);
        for (int index=0;index<linkedList.size();index++){
            System.out.println("Vowels - " +linkedList.get(index));
        }
        System.out.println("---------------------------------------");
    }
    public void linkedListWithAdvancedForLoop(){
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Tamil");
        linkedList.add("English");
        linkedList.add("Maths");
        linkedList.add("Science");
        linkedList.add("Social");
        System.out.println("Subjects - " +linkedList);
        for (String string : linkedList) {
            System.out.println("Subjects in linkedList - " +string);
        }
        System.out.println("-------------------------------------");

    }
}
public void main(String[] args){
    linkedListExample example= new linkedListExample();
    example.linkedListOperationsExample();
    example.iterateLinkedListWithSimpleForLoop();
    example.linkedListWithAdvancedForLoop();

}



