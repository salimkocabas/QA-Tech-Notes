package _002_String_Class;

public class _032__String_new_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char data[] = { 'a', 'b', 'c' };

		// 1:
		System.out.println("1:");
		for (int x = 0; x <= 2; x++) {
			System.out.print(data[x]);
		}

		System.out.println();
		System.out.println();

		// 2:
		System.out.println("2:");
		String str = new String(data); // data serisindeki tüm harfleri str içine topladı
		System.out.println(str);

		System.out.println();
		System.out.println();

		

	}

}
