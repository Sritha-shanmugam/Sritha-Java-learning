package polymorphism;

public class Addition {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args){
        Addition add=new Addition();
        System.out.println("The addition of two numbers = " +add.add(30,23));
        System.out.println("The addition of three numbers = " +add.add(30,23,45));
        System.out.println("The addition of four numbers = " +add.add(30,23,45,65));
    }
}
