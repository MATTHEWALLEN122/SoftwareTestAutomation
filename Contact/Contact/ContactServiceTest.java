import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	ContactService cs;
	
	@BeforeEach
	void setup() {
		cs = new ContactService();
	}
	
	@Test
	void canAddContacttest() throws Exception {
		try {
			cs.addContact("Matthew", "Allen", "1234567890", "123 madison ave");
			
			assertEquals(1, cs.contactList.length);
			assertEquals("Matthew", cs.contactList[0].getFirstName());
		}
		catch( IllegalArgumentException e ) {
			throw e;
		}
	}
	
	@Test
	void canUpdateFirstName() throws Exception{
		try {
			cs.addContact("Matthew", "Allen", "1234567890", "123 madison ave");
			
			cs.updateFirstName("0000000001", "Juniper");
			
			assertEquals(1, cs.contactList.length);
			assertEquals("Juniper", cs.contactList[0].getFirstName());
		}
		catch( IllegalArgumentException e ) {
			throw e;
		}
	}
	
	@Test
	void canUpdateLastName() throws Exception{
		try {
			cs.addContact("Matthew", "Allen", "1234567890", "123 madison ave");
			
			cs.updateFirstName("0000000001", "Brockmann");
			
			assertEquals(1, cs.contactList.length);
			assertEquals("Brockmann", cs.contactList[0].getLastName());
		}
		catch( IllegalArgumentException e ) {
			throw e;
		}
	}
	
	@Test
	void canUpdatePhoneNumber() throws Exception{
		try {
			cs.addContact("Matthew", "Allen", "1234567890", "123 madison ave");
			
			cs.updateFirstName("0000000001", "789456138");
			
			assertEquals(1, cs.contactList.length);
			assertEquals("7894561238", cs.contactList[0].getPhoneNumber());
		}
		catch( IllegalArgumentException e ) {
			throw e;
		}
	}
	
	@Test
	void canUpdateAddress() throws Exception{
		try {
			cs.addContact("Matthew", "Allen", "1234567890", "123 madison ave");
			
			cs.updateFirstName("0000000001", "321 Adison Way");
			
			assertEquals(1, cs.contactList.length);
			assertEquals("321 Adison Way", cs.contactList[0].getAddress());
		}
		catch( IllegalArgumentException e ) {
			throw e;
		}
	}

}
