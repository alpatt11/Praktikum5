import java.util.Scanner;

public class PemilihanHari01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType;
        System.out.println("Input day name: ");

        dayName = sc.nextLine();

        dayType = switch (dayName.toLowerCase()) {
            case "sunday" -> "weekend";
            case "monday" -> "weekday";
            case "tuesday" -> "weekday";
            case "wednesday" -> "weekday";
            case "thursday" -> "weekday";
            case "friday" -> "weekday";
            case "saturday" -> "weekend";
            default -> "invalid day name";
        };
        
        System.out.println(dayName + " is a " + dayType);
    }
}