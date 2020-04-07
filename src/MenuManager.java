
import java.util.Scanner;


public class MenuManager {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		ClothingManager clothingManager = new ClothingManager(input); // 왜 위의 문장이랑 자리를 바꾸는거지 굳이?
		int num = 0;
		while (num != 5 /*!num.equals("5")*/) {
			System.out.println("*** Cloth Management System Menu ***");
			System.out.println("	1. Add Clothes");
			System.out.println("	2. Delete Clothes");
			System.out.println("	3. Edit Clothes");
			System.out.println("	4. View Clothes");
			System.out.println("	5. Exit");
			System.out.println("Select one number between 1-6 :");
			num = input.nextInt();
			if (num == 1 /*num.equals("1")*/) {
				clothingManager.addClothes();
			}
			else if (num == 2 /*num.equals("2")*/) {
				clothingManager.deleteClothes();
			}
			else if (num == 3 /*num.equals("3")*/) {
				clothingManager.editClothes();
			}
			else if (num == 4 /*num.equals("4")*/) {
				clothingManager.viewClothes();
			}
			else {
				continue;
			}
		}
		
	}
}