
//Implement Bridge Design Pattern for Color and
// Shape such that Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.

import javax.print.attribute.standard.Sides;

interface Color{
    void colorInfo();
}

//concrete implementation
class Pink implements Color{

    @Override
    public void colorInfo() {
        System.out.println("using color pink ");
    }
}
class Blue implements Color{

    @Override
    public void colorInfo() {
        System.out.println("using color Blue ");
    }
}
class Red implements Color{

    @Override
    public void colorInfo() {
        System.out.println("using color Red ");
    }
}
//Abstraction
abstract class Shapes{
    Color color;
    String shapeType;

    public Shapes(Color color, String shapeType) {
        this.color = color;
        this.shapeType = shapeType;
    }
}
//refined Abstraction
class Square extends Shapes{
    int NoOfSides;

    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", NoOfSides=" + NoOfSides +
                '}';
    }
    public Square(Color color, int NoOfSides) {
        super(color, "Square");
        this.NoOfSides=NoOfSides;
    }

}
class Circle extends Shapes{
    int NoOfSides;
    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", NoOfSides=" + NoOfSides +
                '}';
    }

    public Circle(Color color,int NoOfSides) {
        super(color, "Circle");
        this.NoOfSides=NoOfSides;
    }
}
class Triangle extends Shapes{
    int NoOfSides;

    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", NoOfSides=" + NoOfSides +
                '}';
    }
    public Triangle(Color color,int NoOfSides) {
        super(color, "Triangle");
        this.NoOfSides=NoOfSides;
    }
}

class BridgePattern {
    public static void main(String[] args) {
        Shapes shape1= new Triangle(new Blue(),4);
        Shapes shape2= new Square(new Blue(),4);
        Shapes shape3= new Square(new Blue(),4);
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);

    }
}
