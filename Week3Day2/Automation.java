package Week3.day2;
//Assignment on Abstraction
public class Automation extends MultipleLangauge {

	

	public void Java() {
		System.out.println("Java is displayed");
		
	}

	public void Selenium() {
		System.out.println("Selenium is displayed");
		
	}

	public void python() {
		System.out.println("python is displayed");
		
	}

	public void ruby() {
		System.out.println("ruby is displayed");
		
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();

	}

}
