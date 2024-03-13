import java.util.Scanner;

class BalancedParentheses {
    static final int MAX_SIZE = 101;
    static char[] a = new char[MAX_SIZE];
    static int top = -1;

    static void push(char ele) {
        if (top <= MAX_SIZE - 1) {
            a[++top] = ele;
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    static char pop() {
        if (top >= 0) {
            char ele = a[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '-';
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top >= MAX_SIZE;
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')');
    }

    static boolean isBalanced(String expression) {
        char[] charArray = expression.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch == '(') {
                push (ch);
            }
            else if (ch==')'){
                if (isEmpty()){
                    return false;
                }
                char topChar = pop();
                if(!isMatchingPair(topChar,ch)){
                return false;
                }
            }
        }
        return isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str = scanner.next();
            System.out.println(str + " : " + isBalanced(str));
        }
    }
}
