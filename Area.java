
public class Area
{
    // Method that receives a Rectangle object
    static void calculateArea(Rectangle r)
    {
        int area = r.length * r.breadth;
        System.out.println("Area = " + area);
    }

    public static void main(String[] args)
    {
        // EXPLICIT PASSING
        Rectangle r1 = new Rectangle(10, 5);
        calculateArea(r1);


        // IMPLICIT / DIRECT PASSING
        calculateArea(new Rectangle(14, 5));
    }
}

class Rectangle
{
    int length;
    int breadth;

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
}
