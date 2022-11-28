package com.class_array_calculate;
import java.util.Random;
public class array_calculate {
	
	protected Random random = new Random();
	int array1[];
	int array2[];
	int array_flag[];
	int flag = 0;
	int copy_array2[];
	int index_array_;
	int random_number;
	public array_calculate(int array1[], int array2[]) {
		this.array1 = array1;
		this.array2 = array2;	
		this.copy_array2 = array2;
	};
	
	public int calculate()
	{
		index_array_ = random.nextInt(array1.length-1) + 1; 
		random_number = array1[index_array_];
		
		if (copy_array2[index_array_] > 0)
		{
			flag++;
			copy_array2[index_array_] -=1;
			return random_number;
		}
		else
		{
			if (flag > array1[1]+ array1[2])
			{
				flag = 0;
				copy_array2 = array2;
				return array1[0];
			}
		}
		return calculate();
	}
	
}
