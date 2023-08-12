package conditionals_loops_03;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        x1=1; y1=2; x2=5;y2=5;
        float distance= (float) SquareRoot((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("%.2f",distance);

    }
    static double SquareRoot(double value){
        double num;
        double half =  value / 2;
        do {
            num = half;
            half = (num + (value / num)) / 2;
        } while ((num - half) != 0);
        return half;
    }
}
