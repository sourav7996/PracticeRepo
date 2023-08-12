package conditionals_loops_03;
import java.util.Scanner;
//Area of triangle
public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height and base of the triangle: ");
        float height = in.nextFloat();
        float base = in.nextFloat();
        float area = areaOfTriangle(height,base);
        System.out.println("The area of the triangle is: "+area);
    }

    static float areaOfTriangle(float height, float base) {
        float area = (float) 1 /2*(height*base);
        return area;
    }
}
