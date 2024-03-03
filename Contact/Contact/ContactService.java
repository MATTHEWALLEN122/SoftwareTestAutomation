

public class ContactService {
	Contact[] contactList = new Contact[] {};
	long nextGameId = 0000000001;
	
    public void addContact(String firstName, String lastName, String phoneNumber, String address) throws Exception{
        try{
            if (firstName == null || firstName.length() < 1 || firstName.length() > 10 ){ throw new IllegalArgumentException(); }
            if (lastName == null || lastName.length() < 1 || lastName.length() > 10 ){ throw new IllegalArgumentException(); }
            if (phoneNumber == null || phoneNumber.length() == 10 ){ throw new IllegalArgumentException(); }
            if (address == null || address.length() < 1 || address.length() > 30 ){ throw new IllegalArgumentException(); }
            
            contactList[contactList.length - 1] = ( new Contact(String.valueOf(nextGameId), firstName, lastName, phoneNumber, address) );
            nextGameId++;
        }
        catch( Exception e ){
            throw e;
        }
    }
    
    public void updateFirstName(String contactId, String firstName ) throws Exception {
    	
    	Contact contact = null;
    	for (Contact c : contactList) {
    		if (c.uniqueId == contactId) {
    			contact = c;
    		}	
    	}
    	
    	contact.setFirstName(firstName);
    }
    
    public void updateLastName(String contactId, String lastName ) throws Exception {
    	
    	Contact contact = null;
    	for (Contact c : contactList) {
    		if (c.uniqueId == contactId) {
    			contact = c;
    		}	
    	}
    	
    	contact.setLastName(lastName);
    }
    
    public void updatePhoneNumber(String contactId, String phoneNumber ) throws Exception {
    	
    	Contact contact = null;
    	for (Contact c : contactList) {
    		if (c.uniqueId == contactId) {
    			contact = c;
    		}	
    	}
    	
    	contact.setPhoneNumber(phoneNumber);
    }
    
    public void updateAddress(String contactId, String address ) throws Exception {
    	
    	Contact contact = null;
    	for (Contact c : contactList) {
    		if (c.uniqueId == contactId) {
    			contact = c;
    		}	
    	}
    	
    	contact.setAddress(address);
    }
}
