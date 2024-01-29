public class FibonacciSeries2 {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(1));
        System.out.println(fibonacciSeries(2));
        System.out.println(fibonacciSeries(3));
        System.out.println(fibonacciSeries(4));
        System.out.println(fibonacciSeries(5));
        System.out.println(fibonacciSeries(6));
        System.out.println(fibonacciSeries(7));
        System.out.println(fibonacciSeries(8));
        System.out.println(fibonacciSeries(9));
        System.out.println(fibonacciSeries(10));
    }

    public static int fibonacciSeries(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);

    }
}
