import java.util.Scanner;
public class Printingnames {
public static void Names (){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ur name :  ");
    String Name = sc.nextLine();
    System.out.println("Enter ur desired number  :  ");
    int n = sc.nextInt();
    for (int i = 0 ; i < n ; i++){
        System.out.println(Name);
    }
}
public static void main(String[]args){
    Names();
}
}