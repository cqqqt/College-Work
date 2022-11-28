package z1;

public class Zad1 
{
    public void strGet(String str) 
    {
        System.out.println(str);
    }
    
    public static void main(String[] args) 
    {
        Zad1 s1 = new Zad1();
        String str = new String("I like Java!!!");
        System.out.println(str.length());
        s1.strGet(str);
        System.out.println(str.charAt(10));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I"));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a','o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(9,13));
        System.out.println(str.replace("=", "равно"));
    }
}

