import java.util.Scanner;

public class ucakbiletFiyati {

    public static void main(String[] args) {
        int km,yas,yolculukTipi;
        double birimFiyat=0.10,toplamTutar;


        Scanner input =new Scanner(System.in);
        System.out.print("Uçuş mesafesini km cinsinden giriniz :");
        km=input.nextInt();
        System.out.print("Yolcu yaşını giriniz :");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz : \n1->Tek Yön\n2->Gidiş-Dönüş");
        yolculukTipi=input.nextInt();



        // girdi kontrolleri
        if (km<=0 || yas<=0 || (yolculukTipi !=1 && yolculukTipi !=2)){
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        toplamTutar=km*birimFiyat;
         //indirim hesaplama
        if (yas<12){
            toplamTutar*=0.5;
        } else if (12<=yas && yas<24) {
            toplamTutar*=0.9;
        } else if (yas>65) {
            toplamTutar*=0.7;
        }


        if (yolculukTipi==2) {
            toplamTutar*=1.6;
        }

        System.out.println("Toplam tutar ="+toplamTutar+"TL");
    }
}
