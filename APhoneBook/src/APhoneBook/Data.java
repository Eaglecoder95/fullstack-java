package APhoneBook;

public class Data {

		Numbers[] stored = new Numbers[0];

		public void addEntry(Numbers newNumbers) {
			Numbers temp[] = new Numbers[stored.length + 1];
			for (int i = 0; i < stored.length; i++) {
				temp[i] = stored[i];
			}
			temp[temp.length - 1] = newNumbers;
			stored = temp;
		}
		
		public void deleteEntry(String input) {
			Numbers temp[] = new Numbers[stored.length - 1];
		int count = 0;
		 int k = 0;
			for (Numbers element : stored) {
				if (element.getPrimaryPhone().equals(input)) {
					continue;
				}
				temp[k++] = element;
			}
			stored = temp;

		}

		public void printNumber() {
			int k = 0;
			for (Numbers element : stored) {
				k++;
				System.out.print(k +".)");
				element.printNumber();
			}
		}

		public void searchLast(String input) {
			boolean check = false;
			for (Numbers element : stored) {
				if (element.getPerson().getLastName().toLowerCase().equals(input.toLowerCase())) {
					element.printNumber();
					check = true;
				} else {
				}
			}
			if (!check) {

				System.out.println("Invalid searh result");
			}
		}

		public void searchFirst(String input) {
			boolean check = false;
			for (Numbers element : stored) {
				if (element.getPerson().getFirstName().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					element.printNumber();
				} else {
				}
			}
			if (!check) {
				System.out.println("Invalid searh result");
			}
		}
		
		public void fullSearch(String input) {
			boolean check = false;
			for (Numbers element : stored) {
				if (element.getPerson().getName().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					element.printNumber();
				}
			}
			if (!check) {
				System.out.println("Invalid full name");
			}
		}
		
		public void numberSearch (String input) {
			boolean check = false;
			for (Numbers element : stored) {
				if (!element.getPrimaryPhone().equals(input)) {
					if (!element.getMobile().equals(input)) {
						if (element.getEmergency().equals(input)) {
							check = true;
							element.printNumber();
						}
					}
					else {
						check = true;
						element.printNumber();
					}
				}
				else {
					check = true;
					element.printNumber();
				}
			}
			if (!check) {
				System.out.println("Invalid number");
			}
		}
		
		public void searchLocation(String input) {
			boolean check = false;
			for (Numbers element : stored) {
				if (!element.getPerson().getStreetAddress().toLowerCase().equals(input.toLowerCase())) {
					if(element.getPerson().getState().toLowerCase().equals(input.toLowerCase())) {
						check = true;
						element.printNumber();
					}
				} else {
					check = true;
					element.printNumber();
				}
			}
			if (!check) {
				System.out.println("Invalid searh result");
			}
		}
		
		public void sortArray() {
			for (int i = 0; i < stored.length; i++) {
				for (int j = i + 1; j < stored.length; j++) {
					//if(stored[i].getPerson().getLastName().compareTo(stored[j].getPerson().getLastName()) < 0) {
						// swapper
					//	Numbers tempNumber = stored[i];
					//	stored[i] = stored[j];
					//	stored[j] = tempNumber;
					System.out.print ( "should be entire list");
					}

				}

			}


		public int numberUpdate (String input) {
			boolean check = false;
			int index = 0;
			for (int i = 0; i < stored.length; i++) {
				if (stored[i].getPrimaryPhone().equals(input)) {
					check = true;
					index = i;
					stored[i].printNumber();
				}
			}
			if (!check) {
				System.out.println("Invalid number");
			}
			return index;
		}
	}

