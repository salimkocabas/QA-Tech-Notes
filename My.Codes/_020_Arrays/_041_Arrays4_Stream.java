package _020_Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class _041_Arrays4_Stream {

	public static void main(String[] args) {

		String[] arr = { "I", "like", "to", "eat", "apple" };
		System.out.println("\n" + Arrays.toString(arr));

		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(x -> System.out.print(x + " "));

		Arrays.sort(arr);
		System.out.println("\n sorted " + Arrays.toString(arr));

		Stream<String> stream2 = Arrays.stream(arr);
		stream2.forEach(x -> System.out.print(x + " "));

	}

}
