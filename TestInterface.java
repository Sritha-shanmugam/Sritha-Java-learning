package Abstraction;

public class TestInterface {
    public static void main(String[] args){
        Drawing d=new Circle();
        d.draw();
        Coloring c=new Square();
        c.color();
        c.sketch();


    }
}
