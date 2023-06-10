package com.shashank.demo.Algorithms.Stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LenghtOfLongestBalancedParenthesisTest {

  private LengthOfLongestBalancedParenthesis cut;

  @BeforeEach
  public void setup(){
    cut = new LengthOfLongestBalancedParenthesis();
  }

  @Test
  void findLength() {
    assertEquals(cut.findLength("(()())(()"), 6);
    assertEquals(cut.findLength("((()()"), 4);
    assertEquals(cut.findLength("(((("), 0);
    assertEquals(cut.findLength("()()"), 4);
  }
}