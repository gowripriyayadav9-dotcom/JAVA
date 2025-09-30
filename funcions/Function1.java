import java.util.Scanner;
public class Function1{
    public static int fun (int r,int m, int [] arr){
        int mul = r * m;
        if (arr == null){
            return -1;
        }
        int res = 0;
      for (int  i = 0;i < arr.length;i++){
      res += arr[i];
    if (res >= mul){
        return i + 1;
    }
}
return 0;
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the positive number : ");
int r = sc.nextInt();
System.out.println("Enter a number for units : ");
int m = sc.nextInt();
System.out.println("Enter ur desire no.of group of food : ");
int n = sc.nextInt();
int [] arr = new int [n];
System.out.println("enter the numbers to store food : ");
for (int i = 0; i < arr.length ; i++){
    arr[i] = sc.nextInt();
}
int res = fun(r,m,arr);
if (res == -1){
System.out.println("array is null");
}
else if (res == 0){
    System.out.println("food is not sufficient;");
}
else {
    System.out.println("minimum index required : " + res); 
}
sc.close();
}
    }
