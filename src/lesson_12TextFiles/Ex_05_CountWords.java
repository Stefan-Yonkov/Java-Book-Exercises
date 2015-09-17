package lesson_12TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex_05_CountWords {

	public static void main(String[] args) throws FileNotFoundException {

		File source = new File("words.txt");
		File sortedResult = new File("result.txt");
		Scanner input = new Scanner(source);
		TreeMap<String, Integer> table = new TreeMap<String, Integer>();
		while (input.hasNextLine()) {
			table.put(input.nextLine(), 0);
		}
		source = new File("text.txt");
		input = new Scanner(source);
		StringBuilder mask = new StringBuilder();
		while (input.hasNextLine()) {
			mask.append(input.nextLine());
		}
		String result = mask.toString().toLowerCase();
		String[] words = result.split("[,.!? ]+");
		for (String word : words) {
			if (table.containsKey(word)) {
				table.put(word, table.get(word) + 1);
			}
		}
		PrintWriter write = new PrintWriter(sortedResult); 
		System.out.println(entriesSortedByValues(table));
		write.println(entriesSortedByValues(table));
		
		input.close();
		write.close();
		

	}
	static <K,V extends Comparable<? super V>>
	SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}

}
