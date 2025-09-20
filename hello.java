/**
 * A simple Java program to practice with Jenkins.
 * This class prints a welcome message and a simple counter to the console.
 */
public class HelloWorld {

    /**
     * The main method is the entry point of the application.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Print a simple greeting to the console.
        System.out.println("Hello, World! This is a test for my Jenkins pipeline.");

        // Add a small loop to make the output a bit more interesting.
        for (int i = 1; i <= 5; i++) {
            System.out.println("CI/CD pipeline is running... step " + i);
        }

        System.out.println("Jenkins job has completed successfully!");
    }
}
