import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	Contact contact = null;
	
	@BeforeEach
	void setup() throws Exception {
		contact = new Contact("0000000001", "Matthew", "Allen", "1234567890", "123 Madison Ave");
	}
	@Test
	void CorrectValuesInContactObjecttest() {
		assertEquals("0000000001", contact.getUniqueId());
		assertEquals("Matthew", contact.getFirstName());
		assertEquals("Allen", contact.getLastName());
		assertEquals("1234567890", contact.getPhoneNumber());
		assertEquals("123 Madison Ave", contact.getAddress());
	}
	
	@Test
	void CanSetValidValuesTest() throws Exception {
		try {
			contact.setFirstName("Juniper");
			contact.setLastName("Rockmann");
			contact.setPhoneNumber("7418529638");
			contact.setAddress("456 madison ave");
			
			assertEquals("Juniper", contact.getFirstName());
			assertEquals("Rockmann", contact.getLastName());
			assertEquals("7418529638", contact.getPhoneNumber());
			assertEquals("456 madison ave", contact.getAddress());
		}
		catch (IllegalArgumentException e) {
			throw e;
		}

	}
	
	@Test
	void CannotSetInvalidValuesTest() {
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("MatthewAllen"));
		assertThrows(IllegalArgumentException.class,() -> contact.setLastName("MatthewAllen"));
		assertThrows(IllegalArgumentException.class,() -> contact.setPhoneNumber("123"));
		assertThrows(IllegalArgumentException.class,() -> contact.setAddress("thirty characters feels like a lot of characters. I hope this is enough."));
	}
}
