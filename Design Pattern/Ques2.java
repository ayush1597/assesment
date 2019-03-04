//Implement Factory Pattern to get the Polygon of differnt type.
interface Shape{
void show();
}
class Quadrilateral implements Shape{
    @Override
    public void show() {
System.out.println("Quadilateral has 4 sides");
    }
}
class Pentagon implements Shape{

    @Override
    public void show() {
System.out.println("Pentagon has 5 sides");
    }
}

class Hexagon implements Shape{

    @Override
    public void show() {
System.out.println("Hexagon has 6 sides");
    }
}

class Heptagon implements Shape{

    @Override
    public void show() {
System.out.println("Heptagon has 7 Sides");
    }
}
class DifferentShape {
    Shape GetPolygonType(String polygontype) {
        if (polygontype == null) {
            return null;
        }
        else if(polygontype.equalsIgnoreCase("Quadrilateral")){
            return new Quadrilateral();
        }
        else if(polygontype.equalsIgnoreCase("pentagon")){
            return new Pentagon();
        }
        else if(polygontype.equalsIgnoreCase("Hexagon")){
        return new Hexagon();
        }
        else if(polygontype.equalsIgnoreCase("heptagon")) {
            return new Heptagon();
        }
         return null;
    }

  }
  class GetDifferentShape{

      public static void main(String[] args) {
          DifferentShape differentShape=new DifferentShape();

          Shape Quadrilateral=differentShape.GetPolygonType("Quadrilateral");
          Quadrilateral.show();
          Shape pentagon=differentShape.GetPolygonType("pentagon");
          pentagon.show();

          Shape hexagon=differentShape.GetPolygonType("hexagon");
          hexagon.show();

          Shape heptagon=differentShape.GetPolygonType("heptagon");
          heptagon.show();

      }

  }
