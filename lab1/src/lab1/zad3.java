package lab1;
import java.util.Random;

public class zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
        Random r = new Random();
        double[][] arr = new double[size][size];
        double[] dig = new double[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = r.nextInt(99); 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
	}

}
