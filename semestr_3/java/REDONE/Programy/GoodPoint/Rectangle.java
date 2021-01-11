public class Rectangle {

  public Rectangle(Point topLeft, Point bottomRight, String name) {
    this.name = name;
    if (topLeft.getX() <= bottomRight.getX() && topLeft.getY() <= bottomRight.getY()) {
      this.topLeft = topLeft;
      this.bottomRight = bottomRight;
    }
  }
  
  public Point getTopLeft() {
    return new Point(topLeft.getX(), topLeft.getY());
  }
  
  public Point getBottomRight() {
    return new Point(bottomRight.getX(), bottomRight.getY());
  }

  public String getName() {
    return name;
  }

  public void setTopLeft(Point topLeft) {
    if (topLeft.getX() <= bottomRight.getX() && topLeft.getY() <= bottomRight.getY()) {
      this.topLeft = topLeft;
    }
  }
  
  public void setBottomRight(Point bottomRight) {
    if (topLeft.getX() <= bottomRight.getX() && topLeft.getY() <= bottomRight.getY()) {
      this.bottomRight = bottomRight;
    }
  }

  void show() {
    System.out.print(name + ": ");
    System.out.print("<" + "<" + topLeft.getX() + ", " + topLeft.getY() + ">, ");
    System.out.print("<" + bottomRight.getX() + ", " + bottomRight.getY() + ">" + ">");
    System.out.println();
  }
  
  private Point topLeft;
  private Point bottomRight;
  private String name = "";

  {
    topLeft = new Point(0, 0);
    bottomRight = new Point(0, 0);
  }
}

