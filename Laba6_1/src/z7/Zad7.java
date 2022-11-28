package z7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad7 {

	public static void main(String[] args) {
		String s="Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
		String paternString="Java\\s+\\d[1,2]";
		Pattern pattern=Pattern.compile(paternString);
		Matcher matcher=pattern.matcher(s);
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}

	}

}
