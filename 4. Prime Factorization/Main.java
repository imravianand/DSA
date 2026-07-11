import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int div = 2;

        while(div * div <= temp){
            if(temp % div == 0){
                System.out.print(div + " ");
                temp /= div;
            } else {
                div++;
            }
        }
        if(temp != 1){
            System.out.print(temp);
        }
    }
}
