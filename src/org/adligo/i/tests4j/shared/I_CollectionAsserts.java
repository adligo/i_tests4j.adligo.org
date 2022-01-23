package org.adligo.i.tests4j.shared;

import java.util.Collection;
import java.util.Map;

/**
 * This contains short hand versions assertions vs the standard 
 * Java collection API.
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
public interface I_CollectionAsserts {

  /**
   * This method asserts that the actual parameter is contained
   * in the collection.
   * 
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public <O> O contains(Collection<O> collection, O actual);

  /**
   * This method asserts that the actual parameter is contained
   * in the collection.
   * @param message the failure message
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public <O> O contains(String message, Collection<O> collection, O actual);

  /**
   * This method asserts that the actual parameter is contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <O,V> O containsKey(Map<O,V> map, O actual);

  /**
   * This method asserts that the actual parameter is contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <O,V> O containsKey(String message, Map<O,V> map, O actual);

  /**
   * This method asserts that the actual parameter is contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <K, O> O containsValue(Map<K,O> map, O actual);

  /**
   * This method asserts that the actual parameter is contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <K, O> O containsValue(String message, Map<K,O> map, O actual);
  

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the collection.
   * 
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public <O> O notContains(Collection<O> collection, O actual);

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the collection.
   * @param message the failure message
   * @param collection
   * @param actual
   * @return the actual parameter
   */
  public <O> O notContains(String message, Collection<O> collection, O actual);

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <O,V> O notContainsKey(Map<O,V> map, O actual);

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <O,V> O notContainsKey(String message, Map<O,V> map, O actual);

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map.
   * 
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <K, O> O notContainsValue(Map<K,O> map, O actual);

  /**
   * This method asserts that the actual parameter is NOT contained
   * in the map as a key.
   * @param message the failure message
   * @param map
   * @param actual
   * @return the actual parameter
   */
  public <K, O> O notContainsValue(String message, Map<K,O> map, O actual);
  
}
