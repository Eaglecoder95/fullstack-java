package APhoneBook;

	import java.util.*;
	public class Person {
		private String city;
		private String streetAddress;
		private String state;
		private int zipCode;
		private String firstName;
		private String lastName;
		private String name;
		

		public Person() {
			
		}

		public Person(String city, String streetAddress, String state, int zipCode, String name) {
			this.city = city;
			this.streetAddress = streetAddress;
			this.state = state;
			this.zipCode = zipCode;
			this.name = name;
		}
		public void printPerson() {
			
			System.out.println("Owner: "+ name +"\nAddress: "+ streetAddress +", "+ city +", "+ state +" "+ zipCode);
		}
		
		public String getCity() {
			return city;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getStreetAddress() {
			return streetAddress;
		}
		
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}
		
		public String getState() {
			return state;
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		public int getZipCode() {
			return zipCode;
		}
		
		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getFirstName() {
			String[] arr = name.split(" "); // splits array  to capture first name
			return firstName = arr[0]; // index location of item desired
		}


		public String getLastName() {
			String[] arr = name.split(" ");
			return lastName = arr[arr.length - 1];
		}
	}
