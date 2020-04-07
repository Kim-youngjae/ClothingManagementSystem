
public class Clothing {
	
	String name;
	String whos;
	String weather;
	String warning;
	
	public Clothing() { // 근데 왜 이렇게 생성자를 몇개를 만드는거지? -> 하나만 만들어도 된다 다만 파라미터를 몇개를 받을 지 정할 때는 밑의 생성자처럼 만들면 된다.
	}
	
	
	/*public Clothing(String name, String whos) {
		this.name = name;
		this.whos = whos; //this(나의 객체의 라는 의미를 가짐)의미 필드의 name과 생성자의 name과 구분하기 위해
	}
	
	public Clothing(String name, String whos, String weather, String warning) {
		this.name = name;
		this.whos = whos;
		this.weather = weather;
		this.warning = warning;
	}*/
	
	public void printInfo() { //static은 메모리에 바로 올라가서 지금 만들 필요가 없어서 뺌
		System.out.println("name:" + this.name + "whos" + this.whos + "weather:" + this.weather + "warning:" + this.warning);
	}
	
	/*public void getName(String name){
		this.name = name;
		this.name -> 필드 / name -> 파라미터 / 필드와 파라미터의 데이터 형은 같아야 한다.
	}*/
	
	
}
// 지금 이것으로는 clothingmanagement와 연결고리가 없기 때문에 class 하나를 더 만든다. -> 연결고리를 만들 때 어떤 생각으로 만들어야할까?

	