package _007_Date_Time;
import java.util.Scanner;

public class j_011_CurrentTimeMillis2 {
	
	@SuppressWarnings("resource")
	public static void main (String[] args){
		
		        long startTime; //start time
		        long endTime;   //end time
		        double time;    //time difference
		         
		        startTime = System.currentTimeMillis();
		 
		        //doing some operation
		        //read and print your name      
		        System.out.print("Enter you name: ");
		        
		        
		        //Scanner class object
		        Scanner read=new Scanner(System.in);
		        String name=read.nextLine();
		         
		        System.out.println("Thanks "+ name +" ! ");
		 
		        endTime = System.currentTimeMillis();
		        time = (endTime - startTime) / 1000.0;
		 
		        System.out.println("\nElapsed Time is:  " + time);

		
		
		
		
		
	}
	
	
	
	

}
