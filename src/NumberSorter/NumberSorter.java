package NumberSorter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
                while(number>0){
                    number /= 10;
                    count++;
                }
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int dig = getNumDigits(number);
                int[] sorted = new int[getNumDigits(number)];
                for(int n = 0; n<dig; n++){
                    sorted[n] = number%10;
                    number /= 10;  
                }
                Arrays.sort(sorted);
                /*for(int i = 1; i<sorted.length; i++){
                    int ind = i;
                    for(int j = i; j<sorted.length; j++){
                        if(sorted[j]>sorted[i]){
                            ind = j;
                        }
                    }
                }*/
		return sorted;
	}
}