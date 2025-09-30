public class Greeting {
    public static String sayHello(){
    return "Hello!";
    }
    public static String sayHello(String Name){
    return "Hello!" + Name ;
    }
    public static String sayHello(String Name , int age){
    return "Hello!" + Name + " u r "+ age + "years old!" ;
    }
    public static void main (String[]args){
        System.out.println(sayHello());
        System.out.println(sayHello("Gowri"));
        System.out.println(sayHello("Gowri",21));
    }
}
