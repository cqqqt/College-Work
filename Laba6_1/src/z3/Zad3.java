package z3;

public class Zad3 {

	public static void main(String[] args) {
		String[] slova = {"string", "code", "Practice"};
        for (String word : slova) {
        	System.out.println("Вывод");
            System.out.printf("%s --> \"%s\"%n", word, word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
	}

	}
}
