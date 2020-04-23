package _002_String_Class;

public class _050_String_Manupulation_replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Hello world my name is Nemo...";
		String str2=str1.substring(12);  //string 12. karakterinden sonraki
		String str3=str2.replace("my","My"); // "my"  /  "My" replaced
		String str4=str3.replace('.','!'); // . /  ! replaced tek karakter ise '' kullanilabilir
		String str5=str2.replace("my","My").replace(".","!"); //replace ardi ardina da yazilabilir
		String str6=str2.replaceAll("my","My").replace(".","!"); //replace ardi ardina da yazilabilir
		
		
		//replace ve replaceAll basit kullanimda ayni. ReplaceAll'un daha fazla yetenekleri var
		
		
		System.out.println(str1);  //Hello world my name is Nemo...
		System.out.println(str2);  //my name is Nemo...
		System.out.println(str3);  //My name is Nemo...
		System.out.println(str4);  //My name is Nemo!!!
		System.out.println(str5);  //My name is Nemo!!!
		System.out.println(str6);  //My name is Nemo!!!
		
		
		
		
		
		
	}

}
