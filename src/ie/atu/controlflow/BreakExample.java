package ie.atu.controlflow;

public class BreakExample {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 30; i++) {
            sum += i;
            if (sum >= 20) {
                break; // Exit the loop when i is 20
            }
            System.out.println("Final Sum " + sum);
        }
    }
}
