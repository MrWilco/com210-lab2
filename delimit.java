import java.util.Scanner;

public class delimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a delimiter: ");
        String string = input.nextLine();
        String[] chars = string.split("");
        String[] stack = new String[chars.length];
        boolean error = false;
        for (int m = 0; m < stack.length; m++) {
            stack[m] = "";
        };
        for (int n = 0; n < string.length(); n++) {
            // System.out.println(string.charAt(n));
            if (string.charAt(n) == '(') {
                for (int m = 0; m < stack.length; m++) {
                    // System.out.println(stack[m]);
                    if (stack[m].equals("") || stack[m].equals(null)) {
                        stack[m] = String.valueOf(string.charAt(n));
                        break;
                    };
                };
            } else if (string.charAt(n) == ')') {
                for (int m = 0; m < stack.length; m++) {
                    if (stack[m].equals("(")) {
                        stack[m] = "";
                        break;
                    };
                };
            };
        }
        for (int num = 0; num < stack.length; num++) {
            if (stack[num].equals("(")) {
                error = true;
            }
        }
        if (error) {
            System.out.println("Error: Delimiter doesn't have complete matching brackets");
        }
        else {
            System.out.println("Good Delimiter");
        }
    };
};
