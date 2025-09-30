import java.util.Scanner; 
class Duplicate {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the"+ n +"number : ");
        int arr [] = new int[n];
        for (int i = 0;i <n; i++){
            arr[i] = sc.nextInt();
        }
        boolean has_duplicate = false;
        for (int i = 0;i<n;i++){
            for (int j = i+1;j < n;j++){
                arr[i] = arr[j];
                has_duplicate = true;
                break;
            }
        }
        if(has_duplicate){
            System.out.println("yes, it has a duplicates");
        }
        else {
            System.out.println("no, it has no duplicates");
        }
        
    }
}
