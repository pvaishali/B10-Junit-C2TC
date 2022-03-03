package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class assert2 {
	@Test
	public void b() {
	    // Test not completed
	    fail("FAIL - test not completed");
	}
	@Test
	public void a() {
	    Integer value = 5; // result of an algorithm
	    
	    assertNotEquals(0, value, "The result cannot be 0");
	}
	@Test
	void AssertingException_thenThrown() {
	    Throwable exception = assertThrows(
	      IllegalArgumentException.class, 
	      () -> {
	          throw new IllegalArgumentException("Exception message");
	      }
	    );
	    assertEquals("Exception message", exception.getMessage());
	}
	
	}

