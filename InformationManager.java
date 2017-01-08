import java.util.Scanner;

public class InformationManager {
	private Student Students[] = new Student[1000];
	private Scanner sc = new Scanner(System.in);

	private int genId() {
		for (int i = 0; i < 1000; i++)
			if (Students[i] == null)
				return i;
		return -1;
	}

	public InformationManager() {
		System.out.printf("Welcome to Information Management System\n");
	}

	public void add() {
		int id = this.genId();
		Students[id] = new Student();
		Students[id].setId(id);
		System.out.printf("Input name:");
		Students[id].setName(sc.next());
		System.out.printf("Input sex:");
		Students[id].setSex(sc.next());
		System.out.printf("Input class:");
		Students[id].setClassroom(sc.next());
		System.out.printf("Input Chinese score:");
		Students[id].setChineseScore(sc.nextInt());
		System.out.printf("Input English score:");
		Students[id].setEnglishScore(sc.nextInt());
		Students[id].genTotalScore();
		this.print(id);
	}

	public void mod(int id) {
		Students[id].setId(id);
		System.out.printf("Input name:");
		Students[id].setName(sc.next());
		System.out.printf("Input sex:");
		Students[id].setSex(sc.next());
		System.out.printf("Input class:");
		Students[id].setClassroom(sc.next());
		System.out.printf("Input Chinese score:");
		Students[id].setChineseScore(sc.nextInt());
		System.out.printf("Input English score:");
		Students[id].setEnglishScore(sc.nextInt());
		Students[id].genTotalScore();
		this.print(id);
	}

	public void del(int id) {
		Students[id] = null;
	}

	public void print(int id) {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID",
				"Name", "Sex", "Class", "ChsScore", "EngScore", "TotalScore");
		Students[id].showInfo();
	}

	public void printAll() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID",
				"Name", "Sex", "Class", "ChsScore", "EngScore", "TotalScore");
		for (int i = 0; i < 1000; i++) {
			if (Students[i] == null)
				continue;
			Students[i].showInfo();
		}
	}
}
