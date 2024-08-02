import java.util.Scanner;

class pr_2 {

	public static void main(String a[]) {

		String[] name1 = { "a", "b", "c", "d" };
		String name;
		Scanner obj = new Scanner(System.in);
		String[] morse = { "...-", "..-.", ".-..", "-..." };
		int k;
		int choice;

		System.out.println("Enter 1-->English  to Morse");
		System.out.println("Enter 2-->Morse to English");
		System.out.print("Enter your choice :: ");
		choice = obj.nextInt();
		obj.nextLine();

		switch (choice) {
			case 1:
				System.out.print("Enter your string : ");
				name = obj.nextLine();
				for (int i = 0; i < (name.length()); i++) {
					char ch = name.charAt(i);
					k = 0;
					for (char j = 'a'; j <= 'z'; j++) {
						if (ch == j) {
							// print-->morse[k]
							System.out.print(morse[k]);
						}
						k++;
					}
				}
				break;

			case 2:
				System.out.print("Enter your string : ");
				name = obj.nextLine();
				int j = 0;
				for (int i = 0; i < (name.length()); i++) {
					String duplicate = name.substring(i * 4, (i * 4) + 4);
					// System.out.println();
					for (int x = 0; x < morse.length; x++) {

						if (duplicate.equals(morse[x])) {
							System.out.println(name1[x]);
						}
					}
				}
				System.out.println("\n23DIT066 - Vinit Saspara");
				break;

			default:
				System.out.println("Invalid choice");
		}
		System.out.println("\n23DIT066 - Vinit Saspara");
	}
}