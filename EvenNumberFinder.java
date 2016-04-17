import java.util.Scanner;


public class EvenNumberFinder{
	
	public static void main (String[] args){
		
		Scanner in= new Scanner(System.in);
		
		int num=0;
		
		while(num!=-999){
			
			System.out.println("Enter an even number");
			
			num=in.nextInt();
			
			if(num%2==0){
				
				System.out.println("Even");
			}
			
			else{
				
				System.out.println("Not even");
			}
		}
		
		System.out.println("User has exited the program ");
	}
	
}