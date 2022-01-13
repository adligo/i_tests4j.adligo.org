package org.adligo.i.tests4j.shared;

/**
 * This contains short hand versions of the classic JUnit assertions
 * @author scott
 *
 */
public interface I_ShortAsserts {

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object equals(Object expected, Object actual);

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object equals(String message, Object expected, Object actual);

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object equals(String expected, String actual);

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object equals(String message, String expected, String actual);

  public void isFalse(boolean actual);

  public void isFalse(String message, boolean actual);

  public void isNull(Object actual);

  public void isNull(String message, Object actual);

  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  public Object notNull(Object actual);

  /**
   * 
   * @param message
   * @param actual
   * @return the actual parameter
   */
  public Object notNull(String message, Object actual);

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object notEquals(Object expected, Object actual);

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object notEquals(String message, Object expected, Object actual);

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object notEquals(String expected, String actual);

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object notEquals(String message, String expected, String actual);

  /**
   * @param expected
   * @param actual the actual parameter
   */
  public void notSame(Object expected, Object actual);

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object notSame(String message, Object expected, Object actual);

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object same(Object expected, Object actual);

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public Object same(String message, Object expected, Object actual);

  public void isTrue(boolean actual);

  public void isTrue(String message, boolean actual);
}
