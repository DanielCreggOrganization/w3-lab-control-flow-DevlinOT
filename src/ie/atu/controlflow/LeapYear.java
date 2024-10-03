package ie.atu.controlflow;

public class LeapYear {
    
    public static void main(String[] args) {
        int number = 2020;

        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("This is a leap year.");
                } else {
                    System.out.println("This is not a leap year.");
                }
            } else {
                System.out.println("This is a leap year.");
            }
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}

