package org.adligo.i.tests4j.shared;

import java.util.Collection;

public interface I_Asserts extends I_LegacyAsserts {
	public void assertContains(Collection<?> p, Object a);
	public void assertContains(String message, Collection<?> p, Object a);	
	
	public void assertGreaterThanOrEquals(double p, double a);
	public void assertGreaterThanOrEquals(String message, double p, double a);	
	public void assertGreaterThanOrEquals(double p, float a);
	public void assertGreaterThanOrEquals(String message, double p, float a);	
	public void assertGreaterThanOrEquals(double p, int a);
	public void assertGreaterThanOrEquals(String message, double p, int a);	
	public void assertGreaterThanOrEquals(double p, long a);
	public void assertGreaterThanOrEquals(String message, double p, long a);	
	public void assertGreaterThanOrEquals(double p, short a);
	public void assertGreaterThanOrEquals(String message, double p, short a);	
	

	public void assertNotUniform(Object p, Object a);
	public void assertNotUniform(String message, Object p, Object a);	
	
	/**
	 To do improve these with the functional style O/ recursion
	public void assertThrown(I_ExpectedThrowable p, I_Thrower thrower);
	public void assertThrown(String message, I_ExpectedThrowable p, I_Thrower thrower);	
	
	public void assertThrownUniform(I_ExpectedThrowable p, I_Thrower thrower);
	public void assertThrownUniform(String message, I_ExpectedThrowable p, I_Thrower thrower);	
	*/
	
	/**
	 * This method is may be backed by a custom implementation.
	 * The default for String's is {@link StringUniformEvaluator#isUniform(I_CompareAssertionData)}
	 * which compares the text of two strings, normalizing new lines
	 * (dos and unix line seperators will match).
	 * @param p
	 * @param a
	 */
	public void assertUniform(Object p, Object a);
	/**
	 * This method is may be backed by a custom implementation.
   * The default for String's is {@link ThrownUniformEvaluator#isUniform(I_CompareAssertionData)}
   * which compares the text of the Throwable messages, normalizing new lines 
   * (dos and unix line seperators will match).
	 * @param message
	 * @param p
	 * @param a
	 */
	public void assertUniform(String message, Object p, Object a);	

	
}
