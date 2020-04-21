package clothing;

import java.util.Scanner;

public class Clothing {

	protected ClothingKind kind = ClothingKind.Cloth;
	protected String name;
	protected String whos;
	protected String weather;
	protected String warning;
//	protected�� �ڽ� Ŭ���� �ܿ� �ٸ� Ŭ���� Ȥ�� ��Ű�������� ������ �Ұ����� ���� ����
	
	public Clothing() { // �ٵ� �� �̷��� �����ڸ� ��� ����°���? -> �ϳ��� ���� �ȴ� �ٸ� �Ķ���͸� ��� ���� �� ���� ���� ���� ������ó�� ����� �ȴ�.
	}
	
	public Clothing(String name, String whos) {
		this.name = name;
		this.whos = whos; //this(���� ��ü�� ��� �ǹ̸� ����)�ǹ� �ʵ��� name�� �������� name�� �����ϱ� ����
	}
	
	public Clothing(String name, String whos, String weather, String warning) {
		this.name = name;
		this.whos = whos;
		this.weather = weather;
		this.warning = warning;
	}

//	Getters/Setters�� ������ �ؿ� �����ִ� ���� ����
	public ClothingKind getKind() {
		return kind;
	}


	public void setKind(ClothingKind kind) {
		this.kind = kind;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWhos() {
		return whos;
	}


	public void setWhos(String whos) {
		this.whos = whos;
	}


	public String getWeather() {
		return weather;
	}


	public void setWeather(String weather) {
		this.weather = weather;
	}


	public String getWarning() {
		return warning;
	}


	public void setWarning(String warning) {
		this.warning = warning;
	}
	
	public void printInfo() {
		System.out.println("name:" + this.name + "whos" + this.whos + "weather:" + this.weather + "warning:" + this.warning);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("�� ������ �����ΰ���? :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("������ ���Դϱ�? :");
		String whos = input.next();
		this.setWhos(whos);
		
		System.out.print("��� ������ ������ �� �Դϱ�? :");
		String weather = input.next();
		this.setWeather(weather);
		
		System.out.print("�� ������ ���� ���� :");
		String warning = input.next();
		this.setWarning(warning);
	}
	
	/*public void getName(String name){
		this.name = name;
		this.name -> �ʵ� / name -> �Ķ���� / �ʵ�� �Ķ������ ������ ���� ���ƾ� �Ѵ�.
	}*/
	
	
}
// ���� �̰����δ� clothingmanagement�� ��������� ���� ������ class �ϳ��� �� �����. -> ��������� ���� �� � �������� �������ұ�?

	