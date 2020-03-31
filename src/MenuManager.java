import java.util.Scanner;

public class MenuManager {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String num = "5";
		while (!num.equals("6")) {
			System.out.println("*** Cloth Management System Menu ***");
			System.out.println("	1. Add Clothes");
			System.out.println("	2. Delete Clothes");
			System.out.println("	3. Edit Clothes");
			System.out.println("	4. View Clothes");
			System.out.println("	5. Show a Menu");
			System.out.println("	6. Exit");
			System.out.println("Select one number between 1-6 :");
			num = input.next();
			if (num.equals("1")) {
				addClothes();
			}
			else if (num.equals("2")) {
				deleteClothes();
			}
			else if (num.equals("3")) {
				editClothes();
			}
			else if (num.equals("4")) {
				viewClothes();
			}
			else {
				continue;
			}
		}
	}
	public static void addClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		System.out.println(clothName);

		System.out.print("누구의 옷입니까? :");
		String whosCloth = input.next();
		System.out.println(whosCloth);

		System.out.print("어느 계절에 적합한 옷 입니까? :");
		String clothWeather = input.next();
		System.out.println(clothWeather);

		System.out.print("옷 관리시 주의 사항 :");
		String clothWarning = input.next();
		System.out.println(clothWarning);
	}
	public static void deleteClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		System.out.println(clothName);
	}
	public static void editClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		System.out.println(clothName);
	}
	public static void viewClothes() {
		
		Scanner input = new Scanner(System.in); //
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		System.out.println(clothName);
	}
}