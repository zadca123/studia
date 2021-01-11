package pl.imiajd.Salwowski;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int width, int height, int x, int y){
        super(width,height,x,y);
        setSize(this.width, this.height);
        setLocation(this.x, this.y);
    }

    public void getPerimeter(){
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + getArea());
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }

    public double getArea(){
        return this.width * this.height;
    }
}
