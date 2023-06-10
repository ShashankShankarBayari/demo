package com.shashank.demo.Algorithms;

import com.shashank.demo.DataStructures.CharacterStack;
import com.shashank.demo.DataStructures.IntegerStack;

public class ExpressionEvaluator {

  public boolean isParenthesesBalanced(String parentheses) {
    char[] parenthesisArray = parentheses.toCharArray();
    CharacterStack characterStack = new CharacterStack();
    for (int i = 0; i < parenthesisArray.length; i++) {
      if (parenthesisArray[i] == '{' || parenthesisArray[i] == '[') {
        characterStack.push(parenthesisArray[i]);
      } else if (parenthesisArray[i] == '}' || parenthesisArray[i] == ']') {
        Character poppedElement = characterStack.pop();
        if (poppedElement == null || poppedElement != getPartnerParenthesis(parenthesisArray[i]))
          return false;
      }
    }
    return characterStack.isEmpty();
  }

  public String convertInfixToPostfix(String infixExpression) {
    // a+b*c-d*e -> abc*+de*-
    // (a+b+c)*d-(e+f) -> abc+d*ef+-
    // ((a+b)*c-d)*e -> ab+c*d-e*
    char[] infixArray = infixExpression.toCharArray();
    String result = "";
    CharacterStack characterStack = new CharacterStack();
    for (int i = 0; i < infixArray.length; i++) {
      if (Character.isAlphabetic(infixArray[i]) || Character.isDigit(infixArray[i])) {
        result = result + infixArray[i];
      } else if (infixArray[i] == '+' || infixArray[i] == '-' || infixArray[i] == '*' || infixArray[i] == '/') {
        while (!characterStack.isEmpty() && doesElementInStackHaveHigherPriority(characterStack.getTop(),
          infixArray[i])) {
          result = result + characterStack.pop();
        }
        if (characterStack.getTop() == null) {
          characterStack.push(infixArray[i]);
        } else if (characterStack.getTop() != infixArray[i]) {
          characterStack.push(infixArray[i]);
        }
      } else if (infixArray[i] == '(') {
        characterStack.push('(');
      } else if (infixArray[i] == ')') {
        while (characterStack.getTop() != '(') {
          result = result + characterStack.pop();
        }
        characterStack.pop();
      } else {
        System.out.println("Invalid expression");
        return null;
      }
    }
    while (!characterStack.isEmpty()) {
      result = result + characterStack.pop();
    }
    return result;
  }

  public int evaluateExpression(String expression) {
    // ex: abc*+de*-
    IntegerStack integerStack = new IntegerStack();
    char[] postFix = convertInfixToPostfix(expression).toCharArray();
    for (int i = 0; i < postFix.length; i++) {
      if (Character.isAlphabetic(postFix[i]) || Character.isDigit(postFix[i])) {
        integerStack.push(postFix[i] - '0');
      } else if (postFix[i] == '*' || postFix[i] == '+' || postFix[i] == '-' || postFix[i] == '/') {
        int operand2 = integerStack.pop();
        int operand1 = integerStack.pop();
        integerStack.push(calculateResult(operand1, postFix[i], operand2));
      }
    }
    return integerStack.pop();
  }

  private int calculateResult(int operand1, char operator, int operand2) {
    switch (operator) {
    case '+':
      return operand1 + operand2;
    case '-':
      return operand1 - operand2;
    case '*':
      return operand1 * operand2;
    case '/':
      return operand1 / operand2;
    default:
      return '/';
    }
  }

  private boolean doesElementInStackHaveHigherPriority(Character top, char currentElement) {
    boolean answer = false;
    if (top == '*') {
      if (currentElement == '+' || currentElement == '-') {
        answer = true;
      }
    }
    if (top == '/') {
      if (currentElement == '+' || currentElement == '-' || currentElement == '*') {
        answer = true;
      }
    }
    if (top == '+' && currentElement == '-') {
      answer = true;
    }
    return answer;
  }

  private char getPartnerParenthesis(char c) {
    switch (c) {
    case '{':
      return '}';
    case '}':
      return '{';
    case '[':
      return ']';
    case ']':
      return '[';
    default:
      return '/';
    }
  }
}
