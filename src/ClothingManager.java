import java.util.ArrayList;
import java.util.Scanner;

import clothing.Accessarys;
import clothing.Bags;
import clothing.Clothing;
import clothing.HeadWears;

public class ClothingManager {
	ArrayList<Clothing> clothings = new ArrayList<Clothing>();
	Scanner input;

	ClothingManager(Scanner input) {
		this.input = input;
	}

	public void addClothes() {
		int kind = 0;
		Clothing clothing;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 3 && kind != 4) {
			System.out.print("1. For Clothes");
			System.out.print("2. For Accessarys");
			System.out.print("3. For Bags");
			System.out.print("4. For HeadWears");
			System.out.print("종류가 무엇인지 고르세요 1번 ~ 4번 :");
			kind = input.nextInt();
			if (kind == 1) {
				clothing = new Clothing();
				clothing.getUserInput(input);
				clothings.add(clothing);
				break;
			}
			else if (kind == 2) {
				clothing = new Accessarys();
				clothing.getUserInput(input);
				clothings.add(clothing);
				break;
			}
			else if (kind == 3) {
				clothing = new Bags();
				clothing.getUserInput(input);
				clothings.add(clothing);
				break;
			}
			else if (kind == 4) {
				clothing = new HeadWears();
				clothing.getUserInput(input);
				clothings.add(clothing);
				break;
			}
			else {
				System.out.print("종류가 무엇인지 고르세요 1번 ~ 4번 :");
			}
			break;
		}
	}
	public void deleteClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		int index = -1;
		for (int i = 0; i < clothings.size(); i++) {
			if (clothings.get(i).getName().equals(clothName)) {
				index = i;
				break;
			}	
		}

		if (index >= 0) {
			clothings.remove(index);
			System.out.println("the cloth" + clothName + "is deleted");
		}
		else {
			System.out.println("the cloth has not been registered");
			return;

		}
	}

	public void editClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		for (int i = 0; i < clothings.size(); i++) {
			Clothing clothing = clothings.get(i);
			if (clothing.getName().equals(clothName)) {
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
						String name = input.next();
						clothing.setName(name);
					}
					else if (num == 2 /*num.equals("2")*/) {
						System.out.print("누구의 옷입니까? :");
						String whos = input.next();
						clothing.setWhos(whos);
					}
					else if (num == 3 /*num.equals("3")*/) {
						System.out.print("어느 계절에 적합한 옷 입니까? :");
						String weather = input.next();
						clothing.setWeather(weather);
					}
					else if (num == 4 /*num.equals("4")*/) {
						System.out.print("옷 관리시 주의 사항 :");
						String warning = input.next();
						clothing.setWarning(warning);
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
	}
	public void viewClothes() {
		//System.out.print("옷 종류가 무엇인가요? :");
		//String clothName = input.next();
		System.out.println("# of registered clothes" + clothings.size());
		for (int i = 0; i < clothings.size(); i++) {
			clothings.get(i).printInfo();
		}
	}
}

