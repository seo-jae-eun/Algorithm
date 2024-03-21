import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int h = sc.nextInt();
	    int m = sc.nextInt();
	    int oven = sc.nextInt();
	    
	    m = m + oven;
	    if(m > 59) {
	    	h = h + (m / 60);
	    	m = m % 60;
		    if(h > 23) {
		    	h = h % 24;
		    }
	    }
	    
	    System.out.println(h + " " + m);
	    
	}
}
