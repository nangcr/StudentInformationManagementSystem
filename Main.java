import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InformationManager test = new InformationManager();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out
					.printf("1.Add student\n2.Modify student\n3.Delete student\n4.Print student\n5.Print all students\n6.Exit\nPlease Input:");
			switch (sc.nextInt()) {
			case 1:
				test.add();
				System.out.printf("Add succeed!\n");
				break;
			case 2:
				System.out.printf("Input ID:");
				test.mod(sc.nextInt());
				System.out.printf("Modify succeed!\n");
				break;
			case 3:
				System.out.printf("Input ID:");
				test.del(sc.nextInt());
				System.out.printf("Delete succeed!\n");
				break;
			case 4:
				System.out.printf("Input ID:");
				test.print(sc.nextInt());
				break;
			case 5:
				test.printAll();
				break;
			case 6:
				System.out.printf("Program exit!\n");
				return;
			default:
				System.out.printf("Error!\n");
			}
		}
	}
}
