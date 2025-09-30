public class Displaymethod {
    public static String display(String word ){
    return word;
    }
    public static String display(int a , int b){
        return a + " " + b;
    }
    public static String display (String  words , int a){
        return words + a;
    }
    public static void main (String[] args){
        System.out.println(display("Gowri"));
        System.out.println(display(10,20));
        System.out.println("Priya" + 9);
    }
}
