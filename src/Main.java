import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Partea 1: Afișarea numerelor prime dintr-un șir
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // sau orice alt șir de numere
        System.out.println("Numere prime din sir:");
        printPrimeNumbers(numbers);

        // Partea 2: Afișarea șirului Fibonacci până la un număr N
        System.out.print("\nIntroduceti un numar N pentru sirul Fibonacci: ");
        int n = scanner.nextInt();
        System.out.println("\nSirul Fibonacci pana la " + n + ":");
        printFibonacciSequence(n);
    }

    // Metoda pentru a verifica dacă un număr este prim
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Metoda pentru a afișa numerele prime dintr-un șir
    private static void printPrimeNumbers(int[] numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Metoda pentru a afișa șirul Fibonacci până la un număr N
    private static void printFibonacciSequence(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
