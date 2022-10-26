import java.util.Scanner;

public class Circle {
    private Point center;
    private double radius;
    public static double radius_second;

    public double getRadius() {
        return radius;
    }
    
    public boolean init(Point center, double radius){
        if (center == null && radius <= 0) return false;

        this.center = center;
        this.radius = radius;

        return  true;
    }

    public boolean input(){
        Scanner scanner = new Scanner(System.in);
        Point center = new Point();
        float radius;
        if (center.input() && scanner.hasNextDouble()) 
            return this.init(center, scanner.nextDouble());

        return false;
    }

    public void output(){
        System.out.printf("\n\nRadius = %f", this.getRadius());
        System.out.printf("\nArea = %f", this.area());
    }


    public double area(){
        return (double) (this.radius * this.radius * 3.1415926535);
    }

    public void areas(Help k){
       k.param = (int)(((Math.pow(this.radius,2)) * 3.1415926535));
    }

    public static double area_ring(Circle r){
        double area;
        if (r.radius > radius_second)
               area = 3.1415926535 * (Math.pow(r.radius,2) - Math.pow(radius_second,2));
        else
               area = 3.1415926535 * (Math.pow(radius_second,2) - Math.pow(r.radius,2));
        return area;
    }




}

