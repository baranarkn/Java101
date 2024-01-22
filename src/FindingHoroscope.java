import java.util.Scanner;

public class FindingHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dateOfBirth, monthOfBirth;

        System.out.println("Please input date of birth: ");
        dateOfBirth = input.nextInt();
        System.out.println("Please input month of birth: ");
        monthOfBirth = input.nextInt();
            if (monthOfBirth == 1) {
                if (dateOfBirth < 22) {
                    System.out.println("Capricorn");
                } else {
                    System.out.println("Aquarius");
                }
            } else if (monthOfBirth == 2) {
                if (dateOfBirth < 20) {
                    System.out.println("Aquarius");
                } else {
                    System.out.println("Pisces");
                }
            } else if (monthOfBirth == 3) {
                if (dateOfBirth < 20) {
                    System.out.println("Pisces");
                } else {
                    System.out.println("Aries");
                }
            } else if (monthOfBirth == 4) {
                if (dateOfBirth < 21) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Taurus");
                }
            } else if (monthOfBirth == 5) {
                if (dateOfBirth < 22) {
                    System.out.println("Taurus");
                } else {
                    System.out.println("Gemini");
                }
            } else if (monthOfBirth == 6) {
                if (dateOfBirth < 23) {
                    System.out.println("Gemini");
                } else {
                    System.out.println("Cancer");
                }
            } else if (monthOfBirth == 7) {
                if (dateOfBirth < 23) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Leo");
                }
            } else if (monthOfBirth == 8) {
                if (dateOfBirth < 23) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Virgo");
                }
            } else if (monthOfBirth == 9) {
                if (dateOfBirth < 23) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Libra");
                }
            } else if (monthOfBirth == 10) {
                if (dateOfBirth < 23) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Scorpio");
                }
            } else if (monthOfBirth == 11) {
                if (dateOfBirth < 22) {
                    System.out.println("Scorpio");
                } else {
                    System.out.println("Sagittarius");
                }
            } else if (monthOfBirth == 12) {
                if (dateOfBirth < 22) {
                    System.out.println("Sagittarius");
                } else {
                    System.out.println("Capricorn");
                }
            }
        }
    }
