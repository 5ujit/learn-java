import java.util.Scanner;

public class ZodiacSignWithTernaryOp {

    public static void determineZodiacSign(int month, int day) {
        String zodiacSign = "";
        switch (month) {
            case 1:
                zodiacSign = (day >= 20) ? "Aquarius" : "Capricorn";
                break;
            case 2:
                zodiacSign = (day >= 19) ? "Pisces" : "Aquarius";
                break;
            case 3:
                zodiacSign = (day >= 21) ? "Aries" : "Pisces";
                break;
            case 4:
                zodiacSign = (day >= 20) ? "Taurus" : "Aries";
                break;
            case 5:
                zodiacSign = (day >= 21) ? "Gemini" : "Taurus";
                break;
            case 6:
                zodiacSign = (day >= 21) ? "Cancer" : "Gemini";
                break;
            case 7:
                zodiacSign = (day >= 23) ? "Leo" : "Cancer";
                break;
            case 8:
                zodiacSign = (day >= 23) ? "Virgo" : "Leo";
                break;
            case 9:
                zodiacSign = (day >= 23) ? "Libra" : "Virgo";
                break;
            case 10:
                zodiacSign = (day >= 23) ? "Scorpio" : "Libra";
                break;
            case 11:
                zodiacSign = (day >= 22) ? "Sagittarius" : "Scorpio";
                break;
            case 12:
                zodiacSign = (day >= 22) ? "Capricorn" : "Sagittarius";
                break;
            default:
                System.out.println("Invalid month.");
                return;
        }
        System.out.println("Your zodiac sign is " + zodiacSign);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the birth month (1 to 12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the birth day: ");
        int day = scanner.nextInt();

        determineZodiacSign(month, day);
    }
}
