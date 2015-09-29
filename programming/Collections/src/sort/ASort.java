package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ASort 
{
	public static void main(String[] args) 
	{
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Cavalo", 4));
		animals.add(new Animal("Peru", 2));
		animals.add(new Animal("Boi", 4));
		
		Collections.sort(animals, new Comparator<Animal>() {

			@Override
			public int compare(Animal animal1, Animal animal2) 
			{
				return animal1.getLegs() - animal2.getLegs();
			}
		});
		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}	
}
