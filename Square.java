package Abstraction;

public class Square implements Drawing,Coloring{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void color() {
        System.out.println("Coloring a object blue color");
    }

    @Override
    public void sketch() {
        System.out.println("Sketch outline with black color");

    }
}
