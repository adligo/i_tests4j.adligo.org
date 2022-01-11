package org.adligo.i.tests4j.shared;

/**
 * This contains short hand versions of the classic JUnit assertions
 * @author scott
 *
 */
public interface I_ShortAsserts {

  public void equals(Object expected, Object actual);

  public void equals(String message, Object expected, Object actual);

  public void equals(String expected, String actual);

  public void equals(String message, String expected, String actual);

  public void isFalse(boolean actual);

  public void isFalse(String message, boolean actual);

  public void isNull(Object actual);

  public void isNull(String message, Object actual);

  public void notNull(Object actual);

  public void notNull(String message, Object actual);

  public void notEquals(Object expected, Object actual);

  public void notEquals(String message, Object expected, Object actual);

  public void notEquals(String expected, String actual);

  public void notEquals(String message, String expected, String actual);

  public void notSame(Object expected, Object actual);

  public void notSame(String message, Object expected, Object actual);

  public void same(Object expected, Object actual);

  public void same(String message, Object expected, Object actual);

  public void isTrue(boolean actual);

  public void isTrue(String message, boolean actual);
}
