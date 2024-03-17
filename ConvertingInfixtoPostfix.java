
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int getPrecendence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    static String convertingItoP(String infix) {
        Stack < Character > operatorStack = new Stack < > ();
        StringBuilder postfix = new StringBuilder();

        for (char ch: infix.toCharArray()) {
            int precedence = getPrecendence(ch);

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop();
            } else {
                while (!operatorStack.isEmpty() && precedence <= getPrecendence(operatorStack.peek())) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }

        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String inFixE = scanner.nextLine();
            String postFixE = convertingItoP(inFixE);
            System.out.println(postFixE);
        }
    }
}
