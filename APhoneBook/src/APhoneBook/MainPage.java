package APhoneBook;
		import java.util.*;
		public class MainPage {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				Data cache = new Data();
				Person p1 = new Person();
				
				Numbers n0 = new Numbers("5614", "6366435698", "6366435698");
				n0.addPerson("St. Louis", "114 Market St", "MO", 63403, "John Doe");
				cache.addEntry(n0);

				Numbers n2 = new Numbers("5610", "8475390126", "8475390126");
				n2.addPerson("St Charles", "324 Main St", "MO", 63303, "John E Doe");

				cache.addEntry(n2);

				Numbers n3 = new Numbers("5600", "5628592375", "5628592375");
				n3.addPerson("St. Peters", "574 Pole ave", "MO", 63333, "John Michael West Doe");

				cache.addEntry(n3);

				Numbers n4 = new Numbers("0000", "7793241532", "1111111111");
				n4.addPerson("Berry", "3624 So Fine St", "CA", 23465, "Halle Berry");

				cache.addEntry(n4);

				int menuChoice;
			do {
				menuChoice = 0;
				System.out.println("Please choose an option for the program:");
				System.out.println("1- add an entry");
				System.out.println("2- search entries by first name");
				System.out.println("3- search entries by last name");
				System.out.println("4- search entries by full name");
				System.out.println("5- search entries by phone number");
				System.out.println("6- search by city or state");
				System.out.println("7- delete a number");
				System.out.println("8- update a number");
				System.out.println("9- list all records");
				System.out.println("10- sort in Ascending order");
				System.out.println("11- Exit");
				menuChoice = input.nextInt();
				input.nextLine();
				switch (menuChoice){
				case 1:
					System.out.println("Please input your First Name: ");
					String name = input.nextLine();

					System.out.println("Please input your Address: ");
					String streetAddr = input.nextLine();

					System.out.println("Please input your City: ");
					String city = input.nextLine();

					System.out.println("Please input your State: ");
					String state = input.nextLine();

					System.out.println("Please input your zip code: ");
					int zipCode = Integer.parseInt(input.next());
					input.nextLine();


					System.out.println("Please input your primary phone number with no spaces or characters");
					String phone = input.next();
					input.nextLine();
					
					System.out.println("Please input your mobile phone number with no spaces or characters");
					String mobile = input.next();
					input.nextLine();
					
					System.out.println("Please input a emergency contact number with no spaces or characters");
					String emergency = input.next();
					input.nextLine();
					
					Numbers n5 = new Numbers(mobile, name, name);
					n5.addPerson(city, streetAddr, state, zipCode, name);
					cache.addEntry(n5);
					pressEnter();
					menuChoice = 0;
					break;
				
				case 2:
					System.out.println("enter search parameters: First Name");
					String searchValue = input.next();
					input.nextLine();
					p1.setName(searchValue);
					cache.searchFirst(searchValue);
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
			
				case 3:
					System.out.println("enter search parameters: Last Name");
					searchValue = input.next();
					input.nextLine();
					p1.setName(searchValue);
					cache.searchLast(searchValue);
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
				
				case 4:
					System.out.println("enter search parameters: Full name");
					searchValue = input.nextLine();
					p1.setName(searchValue);
					cache.fullSearch(searchValue);
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
				
				case 5:
					Numbers n6 = new Numbers();
					System.out.println("enter search parameters: Phone number");
					searchValue = input.nextLine();
					n6.setPrimaryPhone(searchValue);
					n6.setMobile(searchValue);
					n6.setEmergency(searchValue);
					cache.numberSearch(searchValue);
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
				
				case 6:
					System.out.println("enter search parameters: Location");
					searchValue = input.nextLine();
					p1.setStreetAddress(searchValue);
					p1.setState(searchValue);
					cache.searchLocation(searchValue);
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
				
				case 7:
					Numbers n7 = new Numbers();
					System.out.println("enter search parameters to delete: primary phone");
					searchValue = input.nextLine();
					n7.setPrimaryPhone(searchValue);
					cache.deleteEntry(searchValue);
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
				
				case 8:
					System.out.println("Please input a number to update");
					String choice = input.next();
					int index = cache.numberUpdate(choice);
					input.nextLine();
					System.out.println("Please input your Name: ");
					name = input.nextLine();
					System.out.println("Please input your Address: ");
					streetAddr = input.nextLine();
					System.out.println("Please input your City: ");
					city = input.nextLine();
					System.out.println("Please input your State: ");
					state = input.nextLine();
					System.out.println("Please input your zip code: ");
					zipCode = Integer.parseInt(input.next());
					input.nextLine();


					System.out.println("Please input your primary phone number with no spaces or characters");
					phone = input.next();
					input.nextLine();
					System.out.println("Please input your mobile phone number with no spaces or characters");
					mobile = input.next();
					input.nextLine();
					System.out.println("Please input an emergency contact # with no spaces or characters");
			     	emergency = input.next();
					input.nextLine();
					
					Numbers n8 = new Numbers(emergency, mobile, phone);
					n8.addPerson(city, streetAddr, state, zipCode, name);
					cache.stored[index] = n8;
					clearConsole();
					cache.printNumber();
					menuChoice = 0;
					pressEnter();
					clearConsole();
				
				case 9:
					cache.printNumber();
					pressEnter();
					clearConsole();
					menuChoice = 0;
					break;
				
				case 10:
					cache.sortArray();
					cache.printNumber();
					menuChoice = 0;
					pressEnter();
					clearConsole();
					break;
				
				case 11:
					System.exit(0);
					break;
				}
			} while (menuChoice == 0);

				input.close();

			}
			public static void clearConsole() {
				System.out.println(System.lineSeparator().repeat(10));
			}
			public static void pressEnter() {
				System.out.println("Press enter to continue");
				try {
					System.in.read();
				} catch (Exception e) {}
			}
		 }
