import java.util.*;
public class Randomize{
	public static void main (String[] args) throws InterruptedException{
		double chance=0.6666666666666;
		double rawrand= 0;
		double secrand= 0;
		double thirand= 0;
		double forrand = 0;
		int finrand= 0;
		int marker=0;
		int counter=0;
		
		
		while (marker==0){
		counter=counter+1;
		rawrand= (Math.random());
		secrand= rawrand*1000;
		thirand= secrand/chance;
		forrand = (Math.round(thirand));
		finrand= (int)forrand;
		System.out.println(finrand);
		if (finrand==1500){
			marker=1;
			}
		}
		System.out.println(counter);			
	}
}