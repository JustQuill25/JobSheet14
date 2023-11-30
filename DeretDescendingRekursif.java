import java.util.Scanner;

public class DeretDescendingRekursif{
    static void tampilDeretRekursif(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            tampilDeretRekursif(n - 1);
        }
    }

    static void tampilDeretIteratif(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        System.out.print("Deret dengan fungsi rekursif: ");
        tampilDeretRekursif(n);

        System.out.print("\nDeret dengan fungsi iteratif: ");
        tampilDeretIteratif(n);
    }
}