public class AreaCalculation {
    public static double Area (float a){
        return 3.14159 * a * a;
    }
    public static int Area (int length , int breadth){
        return length * breadth;
    }
    public static double Area (double base ,int height){
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        System.out.println (Area(10));
        System.out.println (Area(10,12));
        System.out.println (Area(10,14));
        
    }
}
