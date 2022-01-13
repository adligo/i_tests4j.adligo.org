package org.adligo.i.tests4j.shared;

public interface I_LegacyAsserts {

  public void assertEquals(Object expected, Object actual);

  public void assertEquals(String message, Object expected, Object actual);


  /**
   * JUnit is in this order
   * @param p
   * @param a
   * @param message
   */
  public void assertEquals(Object expected, Object actual, String message);

  public void assertEquals(String expected, String actual);

  public void assertEquals(String message, String expected, String actual);

  
  public void assertFalse(boolean actual);

  public void assertFalse(String message, boolean actual);

  /**
   * This method is inthe order of the classic junit api
   * @param actual
   * @param message
   */
  public void assertFalse(boolean actual, String message);
  
  public void assertNull(Object actual);

  /**
   * This method is inthe order of the classic junit api
   * @param actual
   * @param message
   */
  public void assertNull(Object actual, String message);
  
  public void assertNotNull(Object actual);
  
  /**
   * This method is inthe order of the classic junit api
   * @param actual
   * @param message
   */
  public void assertNotNull(Object actual, String message);

  public void assertNotEquals(Object expected, Object actual);

  public void assertNotEquals(String message, Object expected, Object actual);


  /**
   * These parameters are in the order of JUnit
   * @param expected
   * @param actual
   * @param message
   */
  public void assertNotEquals(Object expected, Object actual, String message);
  
  public void assertNotEquals(String expected, String actual);

  public void assertNotEquals(String message, String expected, String actual);

  public void assertNotSame(Object expected, Object actual);

  public void assertNotSame(String message, Object expected, Object actual);
  
  /**
   * These parameters are in the order of JUnit
   * @param expected
   * @param actual
   * @param message
   */
  public void assertNotSame(Object expected, Object actual, String message);
  
  public void assertSame(Object expected, Object actual);

  public void assertSame(String message, Object expected, Object actual);
  
  /**
   * These parameters are in the order of JUnit
   * @param expected
   * @param actual
   * @param message
   */
  public void assertSame(Object expected, Object actual, String message);
  
  public void assertTrue(boolean actual);

  public void assertTrue(String message, boolean actual);

  /**
   * These parameters are in the order of JUnit
   * @param expected
   * @param actual
   * @param message
   */
  public void assertTrue(boolean actual, String message);
}
