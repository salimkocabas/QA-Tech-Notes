package _013_Operators;



/**
 * 
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
 * 
 * @author bulent.geckin
 *
 */



class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++; System.out.println(i);   // prints 4
        
        ++i; System.out.println(i); // prints 5
        
     
        System.out.println(++i);    // prints 6
        
      
        System.out.println(i++);   // prints 6
        
    
        System.out.println(i);    // prints 7 
    }
}