import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	
	        int N = sc.nextInt();
	        int[] sum = new int[N];
	
	        for(int i = 0; i < N; i++) {
	        	int A = sc.nextInt();
	        	int B = sc.nextInt();
	        	
	        	sum[i] = A + B;
	        }
	        for(int n : sum) {
	        	System.out.println(n);
        	}
	}
}
