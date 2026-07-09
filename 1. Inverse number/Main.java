import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int inv = 0; //inv : inverted
		int op = 1; // original position
		
		while(n != 0){
		    int od = n % 10; //original digit
		    int ip = od; // inverted 
		    int id = op; // inverted digit
		    
		    //make change to inv using ip and id
		    inv = inv + id * (int)Math.pow(10 , ip - 1);
		    
		    n /= 10;
		    op++;
		}
		
		System.out.println(inv);
	}
}