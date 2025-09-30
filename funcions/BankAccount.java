public class BankAccount {
    public static int deposit(int rupees){
        return rupees;
    }
    public static double deposit (double rupees , double paisa){
        return rupees + paisa;
    }
    public static int deposit (String num){
        return Integer.parseInt(num);
    }
    public static void main (String[]args){
        System.out.println (deposit(100));
        System.out.println (deposit(100 , 5));
        System.out.println (deposit(1000));
    }
}
