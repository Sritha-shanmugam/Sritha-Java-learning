package String;

public class StringBufferEx {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Dheethya");
        System.out.println("The appended string = " +sb.append("Pravin"));
        System.out.println("After appended string = " +sb);

        StringBuffer insert=new StringBuffer("Hello");
        System.out.println(insert.insert(0,"Hii.."));

        StringBuffer replaceThis=new StringBuffer("Sritha");
        System.out.println(replaceThis.replace(0,2,"Anu"));

        StringBuffer sub=new StringBuffer("Aathini ");
        System.out.println("Name : " +sub.append("P"));



    }
}
