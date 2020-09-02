package com.ma.springdependencyinjection.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.ma.springdependencyinjection.service.GreetingService;
import com.ma.springdependencyinjection.service.impl.ConstructorInjectedServiceImpl;

/**
 * The class <code>ConstructorInjectionControllerTest</code> contains tests for the class <code>{@link ConstructorInjectionController}</code>.
 *
 * @generatedBy CodePro at 8/27/20 4:02 PM
 * @author manojkumara
 * @version $Revision: 1.0 $
 */
public class ConstructorInjectionControllerTest {
	/**
	 * Run the ConstructorInjectionController(GreetingService) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/20 4:02 PM
	 */
	@Test
	public void testConstructorInjectionController_1()
		throws Exception {
		GreetingService greetingService = new ConstructorInjectedServiceImpl();

		ConstructorInjectionController result = new ConstructorInjectionController(greetingService);

		assertNotNull(result);
	}

	/**
	 * Run the void printGretting() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/20 4:02 PM
	 */
	@Test
	public void testPrintGretting_1()
		throws Exception {
		ConstructorInjectionController fixture = new ConstructorInjectionController(new ConstructorInjectedServiceImpl());

		fixture.printGretting();

	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 8/27/20 4:02 PM
	 */
	@Before
	public void setUp()
		throws Exception {
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 8/27/20 4:02 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 8/27/20 4:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConstructorInjectionControllerTest.class);
	}
}