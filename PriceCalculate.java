package TestNGExample;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculate {

	public static void main(String[] args) {
		
		
		List<Object> groceriesList = new ArrayList<Object>();
		
		
		Groceries gc1 = new Groceries();
		gc1.itemDetail("Banana", 100, 0);
		
		
		Groceries gc2 = new Groceries();
		gc2.itemDetail("Blue berries", 400, 1);
		
		
		Groceries gc3 = new Groceries();
		gc3.itemDetail("Wine", 500, 1);
		
		
		
		groceriesList.add(gc1);
		groceriesList.add(gc2);
		groceriesList.add(gc3);
		
		
		
		for(int i=0;i< groceriesList.size();i++)
		{
			Groceries gc = (Groceries) groceriesList.get(i);
		    gc.printItemCost();
			System.out.println("====================================");
		}
		
		
	}

}
