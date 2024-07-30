public class Calculation {
    public int add(){
        int a=23;
        int b=30;
        int total=a+b;
        return total;
    }
    public static void main(String[] args){
        Calculation addition=new Calculation();
        addition.add();
        int add=addition.add();
        System.out.println("addition of two numbers = " +add);
    }
}
