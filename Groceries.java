package TestNGExample;

public class Groceries
{
   
   // Instance variables
   private String name;
   private int cost;
   /*
     This variable decides if the item is a luxury or a necessity.
     Luxury=0 indicates its a necessity.
     Luxury=1 indicates that the item is a luxury
   */
   private int luxury;  
    
   
   // Instance methods
    /*
     * Enter name,cost and luxury
     * luxury needs to be either 0 or 1
     * Luxury=0 indicates its a necessity
     * Luxury=1 indicates that the item is a luxury
     */
    public void itemDetail(String name,int cost,int luxury)
    {
        this.name = name;
        this.cost = cost;
        this.luxury=luxury;
    }
    
   /*
    * Prints the tax rate for basic necessities and luxury items
    * tax rate for basic necessities is 1%, the tax rate for luxury items is 9%.
    */   
    public void printItemCost()
    {
    	
    		System.out.println("Item cost of "+name+" is "+ cost+" pennies");
    		if( luxury == 0 )
    		{
    			System.out.println(name +"  is a necessity.Total cost is "+cost*1.01);
    			
    		}
    		else
    		{
    			System.out.println(name +" is a luxury.Total cost is "+ cost*1.09);
    		}
    			
    	       	
    }
    
   
    
    
}

