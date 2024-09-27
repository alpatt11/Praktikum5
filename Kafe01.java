import java.util.Scanner;

public class Kafe01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
       
     

        System.out.print("Masukkan menu: ");
        String menu = scanner.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        char ukuranCup = scanner.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        boolean keanggotaan = scanner.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;

                default:
                System.out.println("Menu tidak valid");
                return;
        }

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                hargaMenu += 0.25 * hargaMenu;
                break;
            case 'L':
                hargaMenu += 0.4 * hargaMenu;
                break;
            default:
                System.out.println("Ukuran cup tidak valid");
                return;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = hargaMenu - (diskon * hargaMenu);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);


    }
}