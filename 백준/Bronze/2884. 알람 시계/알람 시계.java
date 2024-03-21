import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int h = sc.nextInt();
	    int m = sc.nextInt();
	    
	    if(h == 0) h = 24;
	    
	    m = h * 60 + m - 45;
	    
	    h = (m / 60) % 24;
	    m = m % 60;
 
	    
	    System.out.println(h + " " + m);
	    
	}
}
