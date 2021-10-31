package APhoneBook;
	import java.util.*;
	public class Numbers {
		//private String emergency;
		private String mobile;
		private String primaryPhone;
		private Person person;
		private String emergency;
		
		public Numbers() {
			
		}
		
		public Numbers(String emergency, String mobile, String primaryPhone) {
			this.emergency = emergency;
			this.mobile = mobile;
			this.primaryPhone = primaryPhone;
		}
		
		public void addPerson(String city, String streetAddress, String state, int zipCode, String name) {
			Person temp = new Person(city, streetAddress, state, zipCode, name);
			this.person = temp;
		}
		
		public Person getPerson() {
			return person;
		}
		
		public String getEmergency() {
		return emergency;
		}
		
		public void setEmergency(String emergency) {
			this.emergency = emergency;
		}
		
		public String getMobile() {
			return mobile;
		}
		
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		
		public String getPrimaryPhone() {
			return primaryPhone;
		}
		
		public void setPrimaryPhone(String primaryPhone) {
			this.primaryPhone = primaryPhone;
		}
		
		public void printNumber() {
			person.printPerson();
			java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}-{3}");
	        //presumes a grouping of 4-3-4
	   
		String[] phoneNumArr={primaryPhone.substring(0, 3),
	    		primaryPhone.substring(3,6),
	    		primaryPhone.substring(6)};
	    
		String[] mobileNumArr={mobile.substring(0, 3),
	    		mobile.substring(3,6),
	    		mobile.substring(6)};

			System.out.println("Primary: "+ phoneMsgFmt.format(phoneNumArr) +"\nMobile: "+ phoneMsgFmt.format(mobileNumArr));
			System.out.println("--------------------------------------------------------");
		}

		//public Object getEmergency() {
	    // TODO Auto-generated method stub
	   //	return null;
		}
	
