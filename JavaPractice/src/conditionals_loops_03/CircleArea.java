package conditionals_loops_03;
import java.util.Scanner;
//Area of circle
public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle: ");
        int radius = in.nextInt();
        float ans= areaOfCircle(radius) ;
        System.out.println("The area of the circle is: "+ ans);

    }

    static float areaOfCircle(int radius) {
        return (float) (3.14*(radius*radius));
    }
}
