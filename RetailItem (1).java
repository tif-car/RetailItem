
import java.util.Scanner;

/**
RetailItem class holds the items values
*/
public class RetailItem
{

   private String description;    //description variable
   private int unitsOnHand;       //hold the number of units currently in inventory
   private double price;          //price variable


   /**
   Constructor
   @param d description of the item.
   @param u holds the number of units in inventory.
   @param p retail price of item.
   */ 
   public RetailItem(String d, int u, double p)        //constructor that accepts arguments for each field
   {
   description = d;                                    //holds description
   unitsOnHand = u;                                    //holds units
   price = p;                                          //holds price
   }

   /**
   the setDescription method sets the items description.
   @param d The items description
   */
   public void setDescription(String d)                  
   {
   description = d;                                       //holds description
   }

   /**
   the setUnits method sets the items units on hand.
   @param u The items unitsOnHand
   */
   public void setUnits(int u)
   {
   unitsOnHand = u;                                       //holds units
   }

   /**
   the setPrice method sets the items price.
   @param p The items price
   */
   public void setPrice(double p)
   {
   price = p;                                            //holds price
   }

   /**
   the getDescription method returns the items description.
   @return the description of the item.
   */
   public String getDescription()
   {
   return description;
   }

   /**
   the getUnits method returns the items units.
   @return the unitsOnHand.
   */
   public int getUnits()
   {
   return unitsOnHand;
   }

   /**
   the getPrice method returns the items price.
   @return the price of item.
   */
   public double getPrice()
   {
   return price;
   }

}


class retailItemTest                               //program that creates three RetailItem objects 
{
   public static void main(String[] args)
   {
   RetailItem item1 = new RetailItem("Jacket", 12, 59.95);             //add data to items list
   RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
   RetailItem item3 = new RetailItem("Shirt", 20, 24.95);



   System.out.println("        " +"Description" + "   "+ "\tUnits on Hand" +"   "+ "Price");           //print out table
   System.out.println("____________________________________________________");

   System.out.println("Item #1\t"+item1.getDescription()+"\t\t\t\t"+item1.getUnits()+"\t\t\t\t "+item1.getPrice());
   System.out.println("Item #2\t"+item2.getDescription()+"\t\t"+item2.getUnits()+"\t\t\t\t "+item2.getPrice());
   System.out.println("Item #3\t"+item3.getDescription()+"\t\t\t\t\t"+item3.getUnits()+"\t\t\t\t "+item3.getPrice());

   }

}