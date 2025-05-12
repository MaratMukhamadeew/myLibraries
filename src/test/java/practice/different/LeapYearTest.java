package practice.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LeapYearTest {
  @Test
    public void testTellMeWhatYear() {
      boolean result1 = LeapYear.tellMeWhatYear(1999);
      boolean result2 = LeapYear.tellMeWhatYear(2000);
      boolean result3 = LeapYear.tellMeWhatYear(2100);
      boolean result4 = LeapYear.tellMeWhatYear(2024);
      boolean result5 = LeapYear.tellMeWhatYear(2400);
      assertFalse(result1);
      assertTrue(result2);
      assertFalse(result3);
      assertTrue(result4);
      assertTrue(result5);
  }

  @Test
  public void testPrintYear() {
    String result1 = LeapYear.printYear(1999);
    String result2 = LeapYear.printYear(2000);
    String result3 = LeapYear.printYear(2100);
    String result4 = LeapYear.printYear(2024);
    String result5 = LeapYear.printYear(2400);
    assertEquals("Год 1999 невисокосный", result1);
    assertEquals("Год 2000 високосный", result2);
    assertEquals("Год 2100 невисокосный", result3);
    assertEquals("Год 2024 високосный", result4);
    assertEquals("Год 2400 високосный", result5);
  }
}