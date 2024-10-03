package ie.atu.controlflow;

public class sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            
        }
        System.out.println("Sum: "+sum);
    }
}
