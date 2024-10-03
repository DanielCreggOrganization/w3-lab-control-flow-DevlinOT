package ie.atu.controlflow;

public class Skip3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue; // Skip this iteration when i is 3
            }
            System.out.println("Iteration: " + i);
        }
    }
}
    
