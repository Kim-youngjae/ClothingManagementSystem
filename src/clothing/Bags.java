package clothing;

import java.util.Scanner;

public class Bags extends Clothing {
	public Bags(ClothingKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {

		System.out.print("가방 종류가 무엇인가요? :");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("정말 본인의 가방 입니까? (Y/N) :");
			answer =input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("누구의 가방입니까? :");
				String whos = input.next();
				this.setWhos(whos);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setWhos("");
				break;
			}
			else {
			}
		}

		System.out.print("어느 계절에 적합한 가방입니까? :");
		String weather = input.next();
		this.setWeather(weather);

		System.out.print("가방 관리시 주의 사항 :");
		String warning = input.next();
		this.setWarning(warning);
	}
}
