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
			System.out.println("the cloth to be edited is " + clothName);
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
