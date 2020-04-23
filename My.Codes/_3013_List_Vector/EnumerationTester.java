package _3013_List_Vector;

import java.util.Vector;
import java.util.Arrays;
import java.util.Enumeration;

public class EnumerationTester {

   public static void main(String args[]) {
      Vector<String> dayNames = new Vector<String>();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");

      
      Enumeration<String> days= dayNames.elements();
      
      System.out.println(dayNames);
      System.out.println(days);
      
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}