package com.shashank.demo.Algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpressionEvaluatorTest {

    private ExpressionEvaluator cut;

    @BeforeEach
    public void setUp() {
        cut = new ExpressionEvaluator();
    }

    @Test
    void isParenthesesBalanced() {
        Assertions.assertTrue(cut.isParenthesesBalanced("{[]}"));
        Assertions.assertTrue(cut.isParenthesesBalanced("{{{}}}"));
        Assertions.assertFalse(cut.isParenthesesBalanced("{{{{}}}"));
        Assertions.assertFalse(cut.isParenthesesBalanced("{{{}}}}"));
        Assertions.assertTrue(cut.isParenthesesBalanced("{[{}]}"));
        Assertions.assertFalse(cut.isParenthesesBalanced("{{[[{}]]}"));
        Assertions.assertFalse(cut.isParenthesesBalanced("{[}]"));
    }

    @Test
    void convertInfixToPostfixTest() {
        System.out.println(cut.convertInfixToPostfix("a+b*c-d*e"));
        System.out.println(cut.convertInfixToPostfix("a+b*c"));
        System.out.println(cut.convertInfixToPostfix("(a+b+c)*d-(e+f)"));
        System.out.println(cut.convertInfixToPostfix("((a+b)*c-d)*e"));
        System.out.println(cut.convertInfixToPostfix("a*(b+c)"));

    }

    @Test
    void convertInfiToPostfixTest() {
        System.out.println("Result is:" + cut.evaluateExpression("2+3*6"));
        System.out.println("Result is:" + cut.evaluateExpression("2+3*6-5"));
        //        System.out.println(cut.convertInfixToPostfix("a+b*c"));
        //        System.out.println(cut.convertInfixToPostfix("(a+b+c)*d-(e+f)"));
        //        System.out.println(cut.convertInfixToPostfix("((a+b)*c-d)*e"));
        //        System.out.println(cut.convertInfixToPostfix("a*(b+c)"));

    }
}