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
