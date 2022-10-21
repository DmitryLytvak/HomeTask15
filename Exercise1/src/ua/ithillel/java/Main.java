package ua.ithillel.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(toList(new Double[]{2.5, 4.0, 5.5, 7.0}));
		System.out.println(toList(new String[]{"Ford", "Peugeot", "BMW", "Tesla"}));
	}
	
	public static <T> List<T> toList(T[] array) {
		List<T> list = new ArrayList<>();
		Collections.addAll(list, array);
		return list;
	}
}
