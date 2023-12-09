package Giris;
import java.util.Scanner;
public class Palindrom_Sayi_Programı {
    static boolean isPalindrom(int sayi){
        int sayi2=tersAl(sayi);
        return sayi == sayi2;

    }
    static int tersAl(int sayi){
        int kalan=sayi%10;
        int deger=kalan*10;
        sayi=sayi/10;
        while(sayi>=10){
            kalan=sayi%10;
            deger=(deger+kalan)*10;
            sayi/=10;
        }
        deger+=sayi;
        System.out.println(deger);
        return deger;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Palindrom Sayı Test Etme Programına Hoş Geldiniz...");
        System.out.print(" Test Etmek İstediğiniz Sayıyı Giriniz: ");
        int number=input.nextInt();
        if(isPalindrom(number)){
            System.out.println("Girdiğiniz Sayı ("+number+") Palindrom Bir Sayıdır***");
        }
        else {
            System.out.println("Girdiğiniz Sayı ("+number+") Palindrom Bir Sayı Değildir!!!");
        }


    }
    }






