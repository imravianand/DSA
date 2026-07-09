import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n; 
        int nod = 0; // number of digits

        while(temp > 0){
            temp /= 10;
            nod++;
        }
        k = k % nod; // in case k is greater than number of digits
        if(k < 0){
            k = k + nod; // in case k is negative
        }

        int div = 1;
        int mult = 1;
        for(int i = 1; i <= nod; i++){  
            if(i <= k){
                div *= 10;
            } else {
                mult *= 10;
            }
        }
        int q = n / div; // quotient
        int r = n % div; // remainder

        int rot = r * mult + q; // rotated number
        System.out.println(rot);
    }
}
