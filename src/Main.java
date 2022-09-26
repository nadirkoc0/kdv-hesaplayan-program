import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //degiskenleri tanimliyoruz.
        double tutar, kdvOran=0.18;

        Scanner inp =new Scanner(System.in);
        //kullanicidan veriyi istiyoruz
        System.out.print("lutfen KDV'sini hesaplamak istediginiz tutari girin..:");
        tutar=inp.nextDouble();

        double kdvliTutar=tutar*kdvOran;
        double sonuc=kdvliTutar+tutar;
        System.out.println("KDV orani..:"+kdvOran);
        System.out.println("KDV'siz tutar(Girilen tutar)..:"+tutar);
        System.out.print("KDV'li tutar..:"+sonuc);


    }
}
