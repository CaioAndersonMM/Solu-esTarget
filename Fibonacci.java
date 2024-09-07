import java.util.Scanner;

public class Fibonacci{

    public static boolean isFibonacci(int num){
        if(num == 0 || num == 1){
            return true;
        }

        int a = 0, b = 1;
        int fib = a + b;

        while (fib <= num) {
            if (fib == num) {
                return true;
            }
            a = b;
            b = fib;
            fib = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
   

}