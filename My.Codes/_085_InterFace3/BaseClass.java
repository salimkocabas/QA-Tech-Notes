package _085_InterFace3;

public class BaseClass extends AustarlianTraffice {

	
	public static void main(String[] args) {

		AustarlianTraffice trafficRules=new AustarlianTraffice();
		
		trafficRules.greenGo();
		trafficRules.redStop();
		trafficRules.TraingSymbol();
		trafficRules.flashYellow();
		trafficRules.walking();
		System.out.println(trafficRules.year);
		
		
		
		
		
		
	}

}
