import java.util.*;

public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take max size from user
        System.out.print("Enter the max size of stack: ");
        int max = sc.nextInt();
        int[] stack = new int[max];
        int tos = -1;  // top of stack index

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Push
                    if (tos == max - 1) {
                        System.out.println("Stack is overflowed");
                    } else {
                        System.out.print("Enter value to push: ");
                        int value = sc.nextInt();
                        tos++;
                        stack[tos] = value;
                        System.out.println("Pushed = " + value);
                    }
                    break;

                case 2: // Pop
                    if (tos == -1) {
                        System.out.println("Stack is underflowed");
                    } else {
                        System.out.println("Popped = " + stack[tos]);
                        tos--;
                    }
                    break;

                case 3: // Peek
                    if (tos == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top element = " + stack[tos]);
                    }
                    break;

                case 4: // Display
                    if (tos == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.print("Stack elements: ");
                        for (int i = 0; i <= tos; i++) {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}