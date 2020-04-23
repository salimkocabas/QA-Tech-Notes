package _000_IQ;

public class SplitWordASentence {

	public static void main(String[] args) {

		String str = "Life is short, time is fast";

		String[] words = str.split(" ");

		System.out.println(str);
		for (String x : words)
			System.out.print(x.replaceAll("[^A-Za-z]", "").trim());

	}

}
