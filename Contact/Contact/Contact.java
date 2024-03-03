
public class Contact {
    public String uniqueId;

    public String firstName;

    public String lastName;

    public String phoneNumber;

    public String address;

    public Contact(String uniqueId, String firstName, String lastName, String phoneNumber, String address) throws Exception{
        try{
            if (uniqueId == null || uniqueId.length() < 1 || uniqueId.length() > 10 ){ throw new IllegalArgumentException(); }
            if (firstName == null || firstName.length() < 1 || firstName.length() > 10 ){ throw new IllegalArgumentException(); }
            if (lastName == null || lastName.length() < 1 || lastName.length() > 10 ){ throw new IllegalArgumentException(); }
            if (phoneNumber == null || phoneNumber.length() == 10 ){ throw new IllegalArgumentException(); }
            if (address == null || address.length() < 1 || address.length() > 30) { throw new IllegalArgumentException(); }
            
            this.uniqueId = uniqueId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }
        catch( Exception e ){
            throw e;
        }
    }
    
    public String getUniqueId() { return this.uniqueId; }
    
    public String getFirstName() { return this.firstName; }
    
    public void setFirstName( String firstName ) throws Exception {
    	try {
    		if (firstName == null || firstName.length() < 1 || firstName.length() > 10 ){ throw new IllegalArgumentException(); }
    		this.firstName = firstName;
    	}
    	catch(Exception e) {
    		throw e;
    	}
    }
    
    public String getLastName() { return this.lastName; }
    
    public void setLastName( String lastName ) throws Exception {
    	try {
    		if (lastName == null || lastName.length() < 1 || lastName.length() > 10 ){ throw new IllegalArgumentException(); }
    		this.lastName = lastName;
    	}
    	catch(Exception e) {
    		throw e;
    	}
    }
    
    public String getPhoneNumber() { return this.phoneNumber; }
    
    public void setPhoneNumber( String phoneNumber ) throws Exception {
    	try {
    		if (phoneNumber == null || phoneNumber.length() == 10 ){ throw new IllegalArgumentException(); }
    		this.phoneNumber = phoneNumber;
    	}
    	catch(Exception e) {
    		throw e;
    	}
    }
    
    public String getAddress() { return this.address; }
    
    public void setAddress( String address ) throws Exception {
    	try {
    		if (address == null || address.length() < 1 || address.length() > 30 ){ throw new IllegalArgumentException(); }
    		this.address = address;
    	}
    	catch(Exception e) {
    		throw e;
    	}
    }
}
