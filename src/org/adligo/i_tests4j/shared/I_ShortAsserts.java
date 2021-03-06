package org.adligo.i_tests4j.shared;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This contains short hand versions of the classic JUnit assertions
 * @author scott
 * 
 * <pre><code>
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
public interface I_ShortAsserts {

  /**
   * @param o the optional
   * @return the actual parameter
   */
  public <O> Optional<O> empty(Optional<O> o);

  /**
   * 
   * @param message
   * @param o the optional to check
   * @return the actual parameter
   */
  public <O> Optional<O> empty(String message, Optional<O> o);
  
  /**
   * @param expected
   * @param actual<
   * @return the actual parameter
   */
  public <O> O equals(Object expected, O actual);

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O  equals(String message, Object expected, O actual);

  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public String equals(String expected, String actual);

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public String equals(String message, String expected, String actual);

  public void isFalse(boolean actual);

  public void isFalse(String message, boolean actual);

  public void isNull(Object actual);

  public void isNull(String message, Object actual);

  /**
   * 
   * @param actual
   * @return the actual parameter
   */
  public <O> O  notNull(O actual);

  /**
   * 
   * @param message
   * @param actual
   * @return the actual parameter
   */
  public <O> O  notNull(String message, O actual);

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O  notEquals(Object expected, O actual);

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O  notEquals(String message, Object expected, O actual);

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public String notEquals(String expected, String actual);

  /**
   * 
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public String notEquals(String message, String expected, String actual);

  /**
   * 
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O  notSame(Object expected, O actual);

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O notSame(String message, Object expected, O actual);

  default <T> List<T> of(T ... ts) {
    List<T> r = new ArrayList<T>();
    for (int i = 0; i < ts.length; i++) {
      r.add(ts[i]);
    }
    return r;
  }
  /**
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O same(Object expected, O actual);

  /**
   * @param message
   * @param expected
   * @param actual
   * @return the actual parameter
   */
  public <O> O same(String message, Object expected, O actual);

  /**
   * @param message
   * @param expected this is a list of instances of the Throwable
   *   type, which are compared to the Throwable thrown by the 
   *   runnable.  The Class of the Throwable MUST match, along with 
   *   the message.
   * @param actual
   * @return the actual parameter
   */
  public void thrown(List<Throwable> expected, Runnable runnable);

  /**
   * @param message
   * @param expected this is a a instances of the Throwable
   *   type, which are compared to the Throwable thrown by the 
   *   runnable.  The Class of the Throwable MUST match, along with 
   *   the message.
   * @param actual
   * @return the actual parameter
   */
  public void thrown(Throwable expected, Runnable runnable);
  
  /**
   * @param message
   * @param expected this is a list of instances of the Throwable
   *   type, which are compared to the Throwable thrown by the 
   *   runnable.  The Class of the Throwable MUST match, along with 
   *   the message.
   * @param actual
   * @return the actual parameter
   */
  public void thrown(String message, List<Throwable> expected, Runnable runnable);
  
  /**
   * @param message
   * @param expected this a of instances of the Throwable
   *   type, which are compared to the Throwable thrown by the 
   *   runnable.  The Class of the Throwable MUST match, along with 
   *   the message.
   * @param actual
   * @return the actual parameter
   */
  public void thrown(String message, Throwable expected, Runnable runnable);
  
  /**
   * assert that the actual parameter is true
   * @param actual
   */
  public void isTrue(boolean actual);
  
  /**
   * assert that the actual parameter is true
   * @param message
   * @param actual
   */
  public void isTrue(String message, boolean actual);
}
