import java.util.Scanner;

public class Combination {
    //Program to calculate combinations.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 'N' for which you want to calculate the combination value: ");
        int n = input.nextInt();
        System.out.print("Please enter 'R' for which you want to calculate the combination value: ");
        int r = input.nextInt();
        int ntotal = 1;
        int rtotal = 1;
        int nrtotal = 1;

        for (int i=1;i<=n;i++){
            ntotal *= i;
        }
        for (int i=1;i<=r;i++){
            rtotal *= i;
        }
        for (int i=1;i <= (n-r);i++){
            nrtotal *= i;
        }

        System.out.print("Combination value: " + (ntotal)/(rtotal*nrtotal));
    }
}
