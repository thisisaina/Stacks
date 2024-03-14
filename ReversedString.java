import java.util.Scanner;

class Stack {
    int MAX_SIZE = 101;
    char[] a = new char[MAX_SIZE];
    int top = -1;

    void push(char ele) {
       if(top <= MAX_SIZE-1) {
           top++;
           a[top]=ele;
       }
       else{
          System.out.print("Stack is full. Cannot push"+ele);
       }
    }

    char pop() {
        if(top>=0){
            char ele=a[top];
            top--;
            return ele;
        }
        else{
            System.out.print("Stack is empty. Cannot pop.");
            return '-';
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top >= MAX_SIZE;
    }
}

class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int stringLength = originalString.length();

        Stack stack = new Stack();

        // Push each character onto the stack
        for (int i = 0; i < stringLength; i++) {
            char c = originalString.charAt(i);
            stack.push(c);
        }

        // Pop the characters from the stack to construct the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        System.out.println(reversedString.toString());
    }
}
