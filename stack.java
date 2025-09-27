//Write a program to check for balanced parentheses using Stack
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> sta = new Stack<>();

        System.out.println("Enter the number of characters to be pushed:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Enter the values in left side:");
            for (int i = 0; i < a / 2; i++) {
                char b = sc.next().charAt(0);
                if (b == '{' || b == '[' || b == '(') {
                    sta.push(b);
                } else {
                    System.out.println("Invalid input on left side");
                    return;
                }
            }

            System.out.println("Left side printed");
            System.out.println("Enter the values in right side:");

            for (int i = 0; i < a / 2; i++) {
                char b = sc.next().charAt(0);

                if (!sta.isEmpty()) {
                    char top = sta.peek();

                    if ((top == '{' && b == '}') ||
                        (top == '[' && b == ']') ||
                        (top == '(' && b == ')')) {
                        sta.pop(); 
                    } else {
                        System.out.println("Imbalanced");
                        return;
                    }
                } else {
                    System.out.println("Imbalanced");
                    return;
                }
            }
            if (sta.isEmpty()) {
                System.out.println("Balanced");
            } else {
                System.out.println("Imbalanced");
            }

        } else {
            System.out.println("Please enter an even number of characters");
        }
    }
}
