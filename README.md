# Stacks

Making projects using stacks

1.BalancedParenthesis
A string of parentheses is considered valid if each opening parenthesis has a matching closing parenthesis and the pairs are properly nested. 

In a valid parenthesis string, every opening bracket '(' must have a corresponding closing bracket ')' that occurs after the opening bracket, and there must not be any extra or unpaired brackets.

Here are the rules for a string of parentheses to be valid:

Correct order: Each closing parenthesis must correspond to the latest unmatched opening parenthesis.

Matching pairs: For every opening parenthesis, there must be a closing parenthesis.

Let's look at some examples:

"()" - This is valid because the only pair of parentheses correctly matches and is in the right order.

"()()" - This is also valid. There are two separate but correct matches.

"(()())" - Valid as well, since the inner pair is nested within the outer pair and they all match up.

"(())" - The inner pair is nested within the outer pair, with both pairs being correctly matched.

")(" or "(" or ")" - All invalid because they contain either unmatched or improperly ordered parentheses.

The goal is to determine if parentheses (and optionally other brackets like curly braces and square brackets) in an expression are properly balanced.


2.ReversedString

You'll implement a basic stack to reverse a string using the stack's LIFO property.

Expected output

Original: Hello, World!

Reversed: !dlroW ,olleH

3. SolvingPostfix

You are given a string S consisting of N characters. Each character is either a digit from 0 to 9 or an operator out of +, -, and *.

Consider the string to be in reverse polish notation consisting of digits (from 1 to 9) as the operands and +, -, or * as the operators and evaluate the expression.

Input Format

The first line of input will contain a single integer T, denoting the number of test cases.

Each test case consists of multiple lines of input.

The first line of each test case contains a single integer N — the number of characters in the string.

The next line consists of N characters, where the i^(th) character is either a digit from 0 to 9 or an operator out of +, -, and *. Consider the string to be in reverse polish notation.

Output Format

For each test case, output on a new line, an integer denoting the evaluated expression.

Constraints

1≤T≤100

1≤N≤10^5
 
The sum of N over all test cases won't exceed 2⋅10^5

Sample 1:

Input

4

3

73-

7

04*3*0-

3

27*

7

703*-9-

OUTPUT:

4

0

14

-2

Explanation:

Test case 1: The postfix expression corresponds to 7−3 which is equal to 4.

Test case 2: The postfix expression corresponds to ((0×4)×3)−0) which is equal to 0.

Test case 3: The postfix expression corresponds to 2×7 which is equal to 14.

Test case 4: The postfix expression corresponds to (7−(0×3))−9) which is equal to −2.
