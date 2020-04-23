package _3023_Set_TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _10_HashSetAndTreeSet {

	public static void main(String[] args) {
		
		
		// // stores values unique - no sort
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Toyota");
		hash_Set.add("Mercedes");
		hash_Set.add("BMW");
		hash_Set.add("Honda");
		hash_Set.add("Audi");
		hash_Set.add("Honda");
		hash_Set.add("Toyota");
		hash_Set.add("Toyota");   //Second Toyota but it's not add Set Collections is unique

		System.out.println("Hash Set");
		System.out.println(hash_Set);

		Set<String> tree_Set = new TreeSet<String>(hash_Set); // stores values in order and unique
		
		System.out.println();
		
		System.out.println("Tree Set |Keeps value sorted in the Collecttion |");
		System.out.println(tree_Set);
		
		
	}
}
