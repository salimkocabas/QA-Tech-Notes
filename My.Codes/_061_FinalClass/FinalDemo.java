package _061_FinalClass;

public class FinalDemo extends Parent{
	
	public static void main(String[] args) {
	
		
		Parent p=new Parent();
		
		p.getData();
		System.out.println(p.prntStr1);   //other string can not accessible
		System.out.println(p.prntStr2);   //other string can not accessible
		System.out.println(p.prntStr3);   //other string can not accessible
		
		
		
		
		
		
	}

	
	
	
}
