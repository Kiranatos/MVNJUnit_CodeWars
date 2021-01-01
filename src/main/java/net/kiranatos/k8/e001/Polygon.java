package net.kiranatos.k8.e001;

/* Circles in Polygons (Autor: Christiaanben https://www.codewars.com/users/Christiaanben)

You are the owner of a box making company.
Your company can produce any equal sided polygon box, but plenty of your 
customers want to transport circular objects in these boxes. Circles are a 
very common shape in the consumer industry. Tin cans, glasses, tyres and CD's 
are a few examples of these.

As a result you decide to add this information on your boxes: 
The largest (diameter) circular object that can fit into a given box. */

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }
    
    public double circleDiameter(){
        double r = (double)sideLength / ( 2 * Math.tan( 
               Math.toRadians( 360 / (2*(double)sides) )
        ) );

        return 2 * r;
    }
    
    public static void main(String[] args) {
        Polygon poly1 = new Polygon(4, 5); // 4 sides[square] with length=5 
        System.out.println("5.000 but " + poly1.circleDiameter());
        
        Polygon poly2 = new Polygon(8, 9); // 8 sides with length=9
        System.out.println("21.728 but " + poly2.circleDiameter());
    }
}
