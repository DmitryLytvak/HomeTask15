package ua.ithillel.ex2.controller;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.ex2.model.Fruitable;

public class Box<T extends Fruitable> {
	
	private float weight;
	private final List<T> boxFruit = new ArrayList<>();
	
	public void addFruit(T fruit) {
		if (fruit != null) {
			boxFruit.add(fruit);
		}
	}
	
	public void addManyFruits(List<T> fruits) {
		for (T fruit : fruits) {
			if (fruit != null) {
				boxFruit.add(fruit);
			}
		}
	}
	
	public void getWeight() {
		for (Fruitable fruit : boxFruit) {
			weight += fruit.getWeight();
		}
	}
	
	public Boolean compare(Box<?> box) {
		return this.weight == box.weight;
	}
	
	public void merge(Box<T> box) {
		this.boxFruit.addAll(box.boxFruit);
		getWeight();
	}
	
	@Override
	public String toString() {
		return "Box{" +
				"weight=" + weight +
				", boxFruit=" + boxFruit +
				'}';
	}
}
