package ie.atu.controlflow;

public class CountDown {


    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("Iteration: " + i);
            i--;
        } while (i >= 1);
    }
}
