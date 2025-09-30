public class Multiplication {
    public static int mul(int a, int b){
        return a * b;
    }
    public static int mul(int a, int b,int c){
        return a * b * c;
    }
     public static double mul(double a, double b){
        return a * b;
     }
     public static void main(String[]args){
        System.out.println(mul(10,20));
        System.out.println(mul(10,20,40));
        System.out.println(mul(10.5,5.6));
     }
}
