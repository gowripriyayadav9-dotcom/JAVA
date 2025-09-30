public class Overloading {
    public static int sum (int a, int b){
        return a + b;
    }
    public static int sum (int a,int b, int c){
        return a + b+ c;
    }
    public static float sum (float a,float b){
        return a + b;
    }
    public static void main (String[]args){
        System.out.println(sum (1.2f , 5.3f));
        System.out.println(sum (10, 20,40));
        System.out.println(sum (100,200));
    }
}
