package z4;
 
import java.util.Formatter;
public class Zad4 {

	public static void main(String[] args) {
		print("������",10,"�����������");


	}
	private static void print(String fullName,int mark,String subject)
	{
		Formatter formatter=new Formatter();
		formatter.format("������� %15s ������� %3s �� %10s",fullName,mark,subject);
		System.out.println(formatter);
	}

}
