package _085_Interface2;

public class Developing implements BankingClient, DomainClient {

	
	
	public static void main(String[] args) {
		
		Developing d=new Developing();
		d.payCreditCard();
		d.checkBalance();
		d.transferBalance();
		
		System.out.println("------------------------------");
		BankingClient dr=new Developing();  //Run time polymorpholism
		dr.payCreditCard();

		
		
		System.out.println("------------------------------");
		DomainClient ds=new Developing();
		d.investment();
		ds.investment();
		
		
	}
	
	
	
	
	
	@Override
	public void payCreditCard() {
		System.out.println("payCreditCard implemented");

	}

	@Override
	public void transferBalance() {
		System.out.println("transferBalance implemented");

	}

	@Override
	public void checkBalance() {
		System.out.println("checkBalance implemented");
	}



	@Override
	public void investment() {
		System.out.println("investment implemented");
		
	}


}
