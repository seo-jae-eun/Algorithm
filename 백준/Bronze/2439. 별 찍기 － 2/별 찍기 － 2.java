import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int star = sc.nextInt();
	    
	    for(int i = 0; i < star; i++) {
	    	for(int j = 1; j < star - i; j++) {
	    		System.out.print(" ");
	    	}
	    	for(int k = star - i; k <= star; k++) {
	    		System.out.print("*");
	    	}
	    	System.out.print("\n");
	    }

	}
}
