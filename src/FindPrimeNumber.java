public class FindPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100: ");
        int i,j;

        for (i = 2; i <= 100; i++){
            boolean prime = true;

            for (j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print(i + " ");
            }
        }
    }
}
