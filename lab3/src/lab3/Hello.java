package lab3;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat ourcat = new Cat();
		ourcat.eat();
		ourcat.sleep();
		String say = ourcat.speak("Play with me");
		System.out.println(say);
	}
}
