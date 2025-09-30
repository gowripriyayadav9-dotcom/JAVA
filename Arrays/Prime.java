import java.util.Scanner;
class Prime{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur desired number : ");
		int num = sc.nextInt();
		boolean is_prime = true;
		if (num <= 1){
			is_prime = false;
		}
		else {
			for(int i = 2; i < num/2 ; i++){
				if (num % i == 0){
					is_prime = false;
				}
			}
		}
			if (is_prime){
				System.out.println("it is a prime number");
			}
				else {
				System.out.println("it is not a prime number");
			}
		}
	}
