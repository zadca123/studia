package pl.imiajd.Salwowski;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height){
        super(x,y,width,height);
        this.setLocation(this.x, this.y);
        this.setSize(this.width, this.height);
    }

    public void getPerimeter(){
        System.out.println("Width: " + this.width + "\tHeigth: " + this.height +
                           "\tArea: " + this.getArea() +
                           "\nx: " + this.x + "\ty: " + this.y);
    }
    public int getArea(){
        return this.width * this.height;
    }
}
