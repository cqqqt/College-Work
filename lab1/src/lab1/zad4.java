package lab1;
import java.util.Scanner;
import java.util.Random;

		public class zad4 {
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        Random rnd = new Random();
		        System.out.println("������� 1");
		        System.out.println("������� ����� ��� �������� ������� �� ��� �� 2");
		        int num = in.nextInt();
		        if (num % 2 == 0) {
		            System.out.println("����� " + num + " ������� �� 2");
		        } else {
		            System.out.println("����� " + num + " �� ������� �� 2");
		        }
		        System.out.println();
		        System.out.println("������� 2");
		        System.out.println("������� ����� �� 1 �� 9, ��� �� ������� ��� �������");
		        int num2 = in.nextInt();
		        switch (num2) {
		            case 1:
		                System.out.println("����");
		                break;
		            case 2:
		                System.out.println("���");
		                break;
		            case 3:
		                System.out.println("���");
		                break;
		            case 4:
		                System.out.println("������");
		                break;
		            case 5:
		                System.out.println("����");
		                break;
		            case 6:
		                System.out.println("�����");
		                break;
		            case 7:
		                System.out.println("����");
		                break;
		            case 8:
		                System.out.println("������");
		                break;
		            case 9:
		                System.out.println("������");
		                break;
		            default:
		                System.out.println("�������� �����");
		                break;
		        }
		        System.out.println();
		        System.out.println("������� 3");
		        System.out.println("�������� ����� �� 1 �� 12, ��� �� ������ ��� �� �����");
		        int num3 = in.nextInt();
		        switch (num3) {
		            case 1:
		                System.out.println("������");
		                break;
		            case 2:
		                System.out.println("�������");
		                break;
		            case 3:
		                System.out.println("����");
		                break;
		            case 4:
		                System.out.println("������");
		                break;
		            case 5:
		                System.out.println("���");
		                break;
		            case 6:
		                System.out.println("����");
		                break;
		            case 7:
		                System.out.println("����");
		                break;
		            case 8:
		                System.out.println("������");
		                break;
		            case 9:
		                System.out.println("��������");
		                break;
		            case 10:
		                System.out.println("�������");
		                break;
		            case 11:
		                System.out.println("������");
		                break;
		            case 12:
		                System.out.println("�������");
		                break;
		            default:
		                System.out.println("��� ������ ������");
		                break;
		        }
		        System.out.println();
		        System.out.println("������� 4");
		        System.out.println("������� ������� ������, ��� �� ������ ������");
		        String num4 = in.next();
		        num4 = num4.substring(0, 1).toUpperCase() + num4.substring(1).toLowerCase();
		        switch (num4) {
		            case "����":
		                System.out.println("����� �����");
		                break;
		            case "�����":
		                System.out.println("��������");
		                break;
		            case "�����":
		                System.out.println("������");
		                break;
		            case "����":
		                System.out.println("��������");
		                break;
		            case "���������":
		                System.out.println("���");
		                break;
		            case "������":
		                System.out.println("������");
		                break;
		            case "������":
		                System.out.println("��������");
		                break;
		            case "������":
		                System.out.println("���������");
		                break;
		            case "�����":
		                System.out.println("�����");
		                break;
		            case "����������":
		                System.out.println("����� ��������");
		                break;
		            case "��������":
		                System.out.println("��������");
		                break;
		            case "������":
		                System.out.println("������");
		                break;
		            default:
		                System.out.println("��� ������ � ����");
		                break;
		        }
		        System.out.println();
		        System.out.println("������� 5");
		        System.out.print("���������� ����� ���� �������� ����� �� 1 �� ");
		        int num5 = in.nextInt();
		        int sum = 0, a = 1;
		        while (a <= num5) {
		            if (a % 2 != 0) {
		                sum += a;
		            }
		            a++;
		        }
		        System.out.println();
		        System.out.println("����� �� ������ �����:\t" + sum);
		        System.out.println("������� 6");
		        System.out.print("���������� ������������ ���� ������ ����� �� 1 �� ");
		        int num6 = in.nextInt();
		        int proiz = 1;
		        while (a <= num6) {
		            if (a % 2 == 0) {
		                proiz *= a;
		            }
		            a++;
		        }
		        System.out.println("������������ ������ �����:\t" + proiz);
		        System.out.println();
		        System.out.println("������� 7");
		        System.out.println("������� ���");
		        System.out.println("���� (�)");
		        double height = in.nextDouble();
		        System.out.println("��� (��)");
		        double weight = in.nextDouble();
		        double IMT = weight / (height * height);
		        System.out.println("���:\t" + IMT);
		        IMT = Math.round(IMT * 100);
		        IMT = IMT / 100;
		        System.out.println("���:\t" + IMT);
		        if (IMT <= 15.99) {
		            System.out.println("���������� ������� ����� ����");
		        } else if (IMT >= 16.00 && IMT <= 18.49) {
		            System.out.println("������������� (�������) ����� ����");
		        } else if (IMT >= 18.50 && IMT <= 24.99) {
		            System.out.println("�����");
		        } else if (IMT >= 25.00 && IMT <= 29.99) {
		            System.out.println("���������� ����� ���� (������������)");
		        } else if (IMT >= 30.00 && IMT <= 34.99) {
		            System.out.println("�������� ������ �������");
		        } else if (IMT >= 35.00 && IMT <= 39.99) {
		            System.out.println("�������� ������ �������");
		        } else if (IMT >= 40.00) {
		            System.out.println("�������� ������� ������� (���������)");
		        }
		    }

	}
