package BankBBF;

import java.util.Scanner;

//MENU
public class Tiga {
    private static boolean flag = true;
    private static Scanner input = new Scanner(System.in);
    private static String pilihan;
    public static void menu(){
        flag = true;
        while (flag){
        System.out.println("======== Main Menu =========");
        System.out.println("1. Setoran Tunai");
        System.out.println("2. Transfer");
        System.out.println("3. Exit");
        System.out.print("Pilihan = ");
        pilihan = input.nextLine();
        if (Validation.isNumeric(pilihan)) {
            switch (pilihan) {
                case "1":
                    EmpatSatu.setorTunai();
                    flag = false;
                    break;
                case "2":
                    EmpatDua.transfer();
                    flag = false;
                    break;
                case "3":
                    System.out.println("Terimakasih Telah melakukan Transaksi");
                    flag = false;
                    break;
                default:
                    System.out.println("Mohon pilih yang ada di Menu !!");
                    flag = false;;
                    break;
            }
        }
        }
    }
}
