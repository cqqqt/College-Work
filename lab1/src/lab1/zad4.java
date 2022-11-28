package lab1;
import java.util.Scanner;
import java.util.Random;

		public class zad4 {
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        Random rnd = new Random();
		        System.out.println("Задание 1");
		        System.out.println("Введите число для проверки делится ли оно на 2");
		        int num = in.nextInt();
		        if (num % 2 == 0) {
		            System.out.println("Число " + num + " делится на 2");
		        } else {
		            System.out.println("Число " + num + " не делится на 2");
		        }
		        System.out.println();
		        System.out.println("Задание 2");
		        System.out.println("Введите число от 1 до 9, что бы увидеть его пропись");
		        int num2 = in.nextInt();
		        switch (num2) {
		            case 1:
		                System.out.println("Один");
		                break;
		            case 2:
		                System.out.println("Два");
		                break;
		            case 3:
		                System.out.println("Три");
		                break;
		            case 4:
		                System.out.println("Четыре");
		                break;
		            case 5:
		                System.out.println("Пять");
		                break;
		            case 6:
		                System.out.println("Шесть");
		                break;
		            case 7:
		                System.out.println("Семь");
		                break;
		            case 8:
		                System.out.println("Восемь");
		                break;
		            case 9:
		                System.out.println("Девять");
		                break;
		            default:
		                System.out.println("Неверное число");
		                break;
		        }
		        System.out.println();
		        System.out.println("Задание 3");
		        System.out.println("Напишите число от 1 до 12, что бы узнать что за месяц");
		        int num3 = in.nextInt();
		        switch (num3) {
		            case 1:
		                System.out.println("Январь");
		                break;
		            case 2:
		                System.out.println("Февраль");
		                break;
		            case 3:
		                System.out.println("Март");
		                break;
		            case 4:
		                System.out.println("Апрель");
		                break;
		            case 5:
		                System.out.println("Май");
		                break;
		            case 6:
		                System.out.println("Июнь");
		                break;
		            case 7:
		                System.out.println("Июль");
		                break;
		            case 8:
		                System.out.println("Август");
		                break;
		            case 9:
		                System.out.println("Сентябрь");
		                break;
		            case 10:
		                System.out.println("Октябрь");
		                break;
		            case 11:
		                System.out.println("Ноябрь");
		                break;
		            case 12:
		                System.out.println("Декабрь");
		                break;
		            default:
		                System.out.println("Нет такого месяца");
		                break;
		        }
		        System.out.println();
		        System.out.println("Задание 4");
		        System.out.println("Введите столицу страны, что бы узнать страну");
		        String num4 = in.next();
		        num4 = num4.substring(0, 1).toUpperCase() + num4.substring(1).toLowerCase();
		        switch (num4) {
		            case "Сеул":
		                System.out.println("Южная Корея");
		                break;
		            case "Минск":
		                System.out.println("Беларусь");
		                break;
		            case "Токио":
		                System.out.println("Япония");
		                break;
		            case "Осло":
		                System.out.println("Норвегия");
		                break;
		            case "Вашингтон":
		                System.out.println("США");
		                break;
		            case "Лондон":
		                System.out.println("Англия");
		                break;
		            case "Берлин":
		                System.out.println("Германия");
		                break;
		            case "Сидней":
		                System.out.println("Австралия");
		                break;
		            case "Пекин":
		                System.out.println("Китай");
		                break;
		            case "Веллингтон":
		                System.out.println("Новая Зеландия");
		                break;
		            case "Бразилиа":
		                System.out.println("Бразилия");
		                break;
		            case "Оттава":
		                System.out.println("Канада");
		                break;
		            default:
		                System.out.println("Нет страны в базе");
		                break;
		        }
		        System.out.println();
		        System.out.println("Задание 5");
		        System.out.print("Вычесление суммы всех нечетных чисел от 1 до ");
		        int num5 = in.nextInt();
		        int sum = 0, a = 1;
		        while (a <= num5) {
		            if (a % 2 != 0) {
		                sum += a;
		            }
		            a++;
		        }
		        System.out.println();
		        System.out.println("Сумма не четных чисел:\t" + sum);
		        System.out.println("Задание 6");
		        System.out.print("Вычесление произведения всех четных чисел от 1 до ");
		        int num6 = in.nextInt();
		        int proiz = 1;
		        while (a <= num6) {
		            if (a % 2 == 0) {
		                proiz *= a;
		            }
		            a++;
		        }
		        System.out.println("Произведение четных чисел:\t" + proiz);
		        System.out.println();
		        System.out.println("Задание 7");
		        System.out.println("Подсчет ИМТ");
		        System.out.println("Рост (м)");
		        double height = in.nextDouble();
		        System.out.println("Вес (кг)");
		        double weight = in.nextDouble();
		        double IMT = weight / (height * height);
		        System.out.println("ИМТ:\t" + IMT);
		        IMT = Math.round(IMT * 100);
		        IMT = IMT / 100;
		        System.out.println("ИМТ:\t" + IMT);
		        if (IMT <= 15.99) {
		            System.out.println("Выраженный дефицит массы тела");
		        } else if (IMT >= 16.00 && IMT <= 18.49) {
		            System.out.println("Недостаточная (дефицит) масса тела");
		        } else if (IMT >= 18.50 && IMT <= 24.99) {
		            System.out.println("Норма");
		        } else if (IMT >= 25.00 && IMT <= 29.99) {
		            System.out.println("Избыточная масса тела (предожирение)");
		        } else if (IMT >= 30.00 && IMT <= 34.99) {
		            System.out.println("Ожирение первой степени");
		        } else if (IMT >= 35.00 && IMT <= 39.99) {
		            System.out.println("Ожирение второй степени");
		        } else if (IMT >= 40.00) {
		            System.out.println("Ожирение третьей степени (морбидное)");
		        }
		    }

	}
