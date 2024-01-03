package final_kodlar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BomBom {
    public static void main(String[] args) {
        char[][] harita = new char[10][10];
//haritayi txt dosyasindan programa alma
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\FATMANUR\\Documents\\algoritma final projesi\\final_kodlar\\harita.txt"));
            String satir;
            int satirNo = 0;

            while ((satir = br.readLine()) != null && satirNo < 10) {
                for (int i = 0; i < satir.length() && i < 10; i++) {
                    harita[satirNo][i] = satir.charAt(i);
                }
                satirNo++;
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        oyunuBaslat(harita);
    }
//oyunu baslatan metod
    private static void oyunuBaslat(char[][] harita) {
        Scanner scanner = new Scanner(System.in);
//kullanıcıdan kooordinat alıp islem yapma
        while (true) {
            haritayiEkranaBas(harita);
            System.out.print("satir sutun seklinde koordinat girin veya oyunu sonlandirmak için 0 0 girin: ");
            int satir = scanner.nextInt();
            int sutun = scanner.nextInt();

            if (satir == 0 && sutun == 0) {
                System.out.println("oyun sonlandirildi.");
                break;
            }
//kullanıcının yanlıs koordinat girmesi ihtimalina karsılık;
            if (gecerliKoordinat(satir, sutun)) {
                char sayi = harita[satir][sutun];
                kontrolVeIslemYap(harita, satir, sutun, sayi);
            } else {
                System.out.println("gecersiz koordinat. lutfen tekrar girin.");
            }
        }

        scanner.close();
    }
//gecerli koordinat kontrolu yapan metod 
    private static boolean gecerliKoordinat(int satir, int sutun) {
        return satir >= 0 && satir < 10 && sutun >= 0 && sutun < 10;
    }
//secilen koordinattaki sayı ile komsu hucreleri kontrol etme
    private static void kontrolVeIslemYap(char[][] harita, int satir, int sutun, char sayi) {
        for (int i = satir - 1; i <= satir + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                //komsu hucrelerde aynı sayı varsa x ile degistirme
                if (gecerliKoordinat(i, j) && harita[i][j] == sayi) {
                    harita[i][j] = 'X';
                }
            }
        }
    }
//degistirilmis yeni haritayı ekrana yazdırma
    private static void haritayiEkranaBas(char[][] harita) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(harita[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
