import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Bilangan : ");
        int pangkat = sc.nextInt();
        System.out.print("Pangkat : " );
        for ( int i = 1; i <= pangkat; i++) {
            System.out.print(bilangan + " x " );
        }
        System.out.print("1 = " + hitungPangkat(bilangan, pangkat));

    }
    public static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return(x * hitungPangkat(x, y - 1));
        }
    }
}