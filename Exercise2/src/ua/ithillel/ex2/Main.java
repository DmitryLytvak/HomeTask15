package ua.ithillel.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ua.ithillel.ex2.controller.Box;
import ua.ithillel.ex2.model.Apple;
import ua.ithillel.ex2.model.Orange;

public class Main {
	
	public static void main(String[] args) {
		
		List<Apple> appleList = new ArrayList<>();
		Collections.addAll(appleList, new Apple(), null, new Apple(), new Apple(),
				new Apple(), new Apple(), new Apple(), new Apple());
		
		List<Orange> orangeList = new ArrayList<>();
		Collections.addAll(orangeList, new Orange(), new Orange(), new Orange(), new Orange(),
				new Orange(), new Orange());
		
		Box<Orange> orangeBox1 = new Box<>();
		Box<Orange> orangeBox2 = new Box<>();
		
		Box<Apple> appleBox1 = new Box<>();
		Box<Apple> appleBox2 = new Box<>();
		
		appleBox1.addManyFruits(appleList);
		appleBox2.addManyFruits(appleList);
		orangeBox2.addManyFruits(orangeList);
		orangeBox1.addManyFruits(orangeList);
		
		orangeBox1.addFruit(null);
		appleBox1.addFruit(new Apple());
		
		orangeBox1.getWeight();
		appleBox1.getWeight();
		orangeBox2.getWeight();
		appleBox2.getWeight();
		
		System.out.println(appleBox1);
		System.out.println(appleBox2);
		System.out.println(orangeBox1);
		System.out.println(orangeBox2);
		
		System.out.println(appleBox1.compare(orangeBox1));
		System.out.println(orangeBox2.compare(appleBox2));
		appleBox1.merge(appleBox1);
		orangeBox1.merge(orangeBox1);
		System.out.println(appleBox2);
		System.out.println(orangeBox2);
	}
}