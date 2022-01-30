package org.adligo.i_tests4j.shared;

/**
 * This interface matches the legacy JUnit assertions.
 * 
 * @author scott
 *<pre><code>
 *         ---------------- Apache ICENSE-2.0 --------------------------
 *
 *         Copyright 2022 Adligo Inc
 * 
 *         Licensed under the Apache License, Version 2.0 (the "License"); you
 *         may not use this file except in compliance with the License. You may
 *         obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *         implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *         </code></pre>
 */
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
