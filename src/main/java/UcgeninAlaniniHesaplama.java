import java.util.Scanner;

public class UcgeninAlaniHesapla {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        double alan;
        Scanner girdi=new Scanner(System.in);
        System.out.print("1.Kenar:");
        kenar1=girdi.nextInt();
        System.out.print("2.Kenar:");
        kenar2=girdi.nextInt();
        System.out.print("3.Kenar:");
        kenar3=girdi.nextInt();
        int u=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("\nAlan: "+alan);


    }
}
