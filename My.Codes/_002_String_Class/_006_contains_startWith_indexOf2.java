package _002_String_Class;

public class _006_contains_startWith_indexOf2 {

	public static void main(String[] args) {
		String str = "Life is short... Time is fast...";
		
		
		
		for (char i = 'A'; i <= 'z'; i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++)
				if (str.substring(j, j + 1).contentEquals(Character.toString(i))) {
					count++;
				}

			if (count > 0) {
				System.out.println(i + " : " + count);
			}
		}

	}
}
