import java.util.Scanner;

public class ReversedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tempN;
        String symbol;
        System.out.print("Bir Sayı Giriniz: ");
        n = scanner.nextInt();
        System.out.print("Bir Sembol Giriniz: ");
        symbol = scanner.next();
        tempN = n;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for (int z = (tempN * 2) - 1; z >= 1; z --){
                System.out.print(symbol);
            }
            space ++;
            System.out.println();
            tempN --;
            for (int k = 1 ; k <= space ; k++){
                System.out.print(" ");
            }
        }
    }
}
