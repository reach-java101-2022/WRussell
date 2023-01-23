package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // calculate and display a total
        String productCode = "java";
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        String message = 
            "Code:     " + productCode + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n";
        System.out.println(message);

        // display your name        
        String firstName = "William";
        String lastName = "Russell";
        System.out.println("Name: " + lastName + "," + firstName);
        
        
        // calculate and display an average        
        double sum = 301.75;
        int count = 6;
        double avg = sum/count;
        System.out.println("Average: " + avg);
        
        // display a goodbye message
        System.out.println("Bye!");
    }
}
