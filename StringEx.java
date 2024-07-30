package String;

public class StringEx {
    public static void main(String[] args){
        String name="Sritha";
        int number=3;

        System.out.println(name.charAt(2));

        System.out.println(name.length());

        System.out.println(name.equalsIgnoreCase("SRI"));

        System.out.println(name.isEmpty());

        System.out.println(name.contains("a"));

        System.out.println(name.substring(1));

        System.out.println(name.substring(2,6));

        System.out.println(name.concat(".pravin"));

        System.out.println(name.indexOf("a",4));
    }
}
