package z4;
 
import java.util.Formatter;
public class Zad4 {

	public static void main(String[] args) {
		print("Иванов",10,"Физкультуре");


	}
	private static void print(String fullName,int mark,String subject)
	{
		Formatter formatter=new Formatter();
		formatter.format("Студент %15s получил %3s по %10s",fullName,mark,subject);
		System.out.println(formatter);
	}

}
