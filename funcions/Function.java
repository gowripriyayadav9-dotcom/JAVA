import java.util.Scanner;
public class Function {
public static int fun (int n,int m){
    int nval = 0;
    int mval = 0;
for (int i = 0 ; i < 10 ; i++){
    String  a = n + " X " + i + n*i;
    nval += n*i;
    if (m == n*i){

        break;
    }
}
    for (int j = 0; j <= m;j++){
    if (j % n != 0){
       mval += j;
    }
}
    int result = mval-nval;
    return result;
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur desire number : ");
        int ni = sc.nextInt();
        System.out.println("Enter where u want to sto the value : ");
        int mi = sc.nextInt();
    int res = fun(ni,mi);
    System.out.println(res);
    sc.close ();
}
}
