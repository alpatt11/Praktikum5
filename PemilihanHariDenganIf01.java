import java.util.Scanner;

public class PemilihanHariDenganIf01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka (1-7): ");

        int day = sc.nextInt();
        String dayType;

        if (day >= 1 && day <= 5) {
            dayType = "Weekday";
        } else if (day == 6 || day == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }

        System.out.println("Hari tersebut adalah: " + dayType);
    }
}