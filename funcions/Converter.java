public class Converter {
    public static double Change(int kilometer,String type){
        return (kilometer * 1000);
    }
    public static int Change(int hours){
        return (hours * 60);
    }
    public static double Change(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static void main(String[]args){
        System.out.println(Change(3,"km"));
        System.out.println(Change(4));
        System.out.println(Change(100));
    }
    }