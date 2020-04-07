import java.util.Scanner;

public class ClothingManager {
	Clothing clothing;
	Scanner input;

	ClothingManager(Scanner input) {
		this.input = input;
	}

	public void addClothes() {
		clothing = new Clothing();
		System.out.print("옷 종류가 무엇인가요? :");
		clothing.name = input.next();
		System.out.print("누구의 옷입니까? :");
		clothing.whos = input.next();
		System.out.print("어느 계절에 적합한 옷 입니까? :");
		clothing.weather = input.next();
		System.out.print("옷 관리시 주의 사항 :");
		clothing.warning = input.next();
	}
	public void deleteClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		if (clothing == null) {
			System.out.println("the cloth has not been registered");
			return;
		}
		if (clothing.name.equals(clothName)) {
			clothing = null;
			System.out.println("the cloth is deleted.");
		}
	}
	public void editClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		if (clothing.name.equals(clothName)) {
			int num = 0;
			while (num != 5 /*!num.equals("5")*/) {
				System.out.println("** Cloth Info Edit Menu **");
				System.out.println("	1. Edit Clothes");
				System.out.println("	2. Edit Who's");
				System.out.println("	3. Edit Weather");
				System.out.println("	4. Edit Warning");
				System.out.println("	5. Exit");
				System.out.println("Select one number between 1-6 :");
				num = input.nextInt();
				if (num == 1 /*num.equals("1")*/) {
					System.out.print("옷 종류가 무엇인가요? :");
					clothing.name = input.next();
				}
				else if (num == 2 /*num.equals("2")*/) {
					System.out.print("누구의 옷입니까? :");
					clothing.whos = input.next();
				}
				else if (num == 3 /*num.equals("3")*/) {
					System.out.print("어느 계절에 적합한 옷 입니까? :");
					clothing.weather = input.next();
				}
				else if (num == 4 /*num.equals("4")*/) {
					System.out.print("옷 관리시 주의 사항 :");
					clothing.warning = input.next();
				}
				else {
					continue;
				}
			}
		}
	}
	public void viewClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		if (clothing.name.equals(clothName)) {
			clothing.printInfo();
		}
	}
}
