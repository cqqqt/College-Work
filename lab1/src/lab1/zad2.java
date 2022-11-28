package lab1;
import java.util.Random;


public class zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,10,12,13,15,19,25,0,14,11};
		 Random r - new Random();
		 double[] arr = new double[arr];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i] = r.nextInt(99);
			 if(arr[i]>i)
			 {
				 System.out.println(arr[i]+" ");
			 } 
		 }
	}

}
