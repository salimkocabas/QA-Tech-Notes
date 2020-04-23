package _009_WidenigNarrowing;

import java.util.Arrays;

public class _05_char_int_sample1 {

	public static void main(String[] args) {

		char[] ch = { 'H', 'e', 'l', 'l', 'o' };

		StringBuilder all = new StringBuilder().append(ch);
		
		System.out.println(ch[0] + ch[1] + ch[2] + ch[3] + ch[4]);
		System.out.println(Arrays.toString(ch));
		System.out.println(all);

	}

}
