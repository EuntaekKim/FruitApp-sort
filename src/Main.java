import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(102, "Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(103, "Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi", 2000));
		fl.add(new Fruit(104,"Pear", 1500));
		fl.add(new Fruit(105,"Banana", 500));
		fl.add(new Fruit(106,"Lemon", 1000));
		fl.add(new Fruit(107,"Cherry", 1200));
		fl.add(new Fruit(108,"Melon", 2500));
		fl.add(new Fruit(109,"Grape", 2000));
		fl.add(new Fruit(110,"Pineapple", 3000));
		
		Collections.sort(fl, new FruitComparator());;
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for (int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
