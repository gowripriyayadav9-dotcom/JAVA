import java.util.Scanner;
class Rows_Cols{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur desired number : ");
        int n = sc.nextInt();
        System.out.println("Enter ur desired number : ");
        int m = sc.nextInt();
        int [] matrix1 = new int [n];
        int [] matrix2 = new int [m];
        System.out.println("Enter the " + n + "col values : ");
        for(int i = 0;i < matrix1.length;i++){
           matrix1[i] = sc.nextInt();
        }
        System.out.println("Enter the " + m + "col values : ");
        for(int j = 0;j < matrix2.length;j++){
           matrix2[j] = sc.nextInt();
        }
        System.out.println("col : ");
        for (int i =0;i<matrix2.length;i++){
            System.out.println(matrix2[i]);
        }
        System.out.println();
        System.out.println("rows : ");
        for (int j =0;j<matrix1.length;j++){
            System.out.println(matrix2[j]);
        }
        System.out.println();
    }
}