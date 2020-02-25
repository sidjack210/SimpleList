/**
 * Sidney Jackson, Class ID: 414, Assignment 1
 * SimpleListTest.java tests all methods in SimpleTest.java
 */
package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest
{

	SimpleList list = new SimpleList();
	 
	/**
	 * loops through list and adds an element at a specific index
	 * prints the list out
	 * prints the updated count
	 */
	@Test
	public void testAdd()
	{
		 
	       for(int i = 1; i < 10; i++)
	       {
	           list.add(i);
		
	       }
	       
	       System.out.println("List: " + list.toString());
	       System.out.println("Count: " + list.count());
	}
	
	/**
	 * loops through list and adds an element at a specific index
	 * prints the list out
	 * prints the updated count
	 * removes an element at index 6
	 */
	@Test
	public void testRemove()
	{
		for(int i = 1; i < 10; i++)
	       {
	           list.add(i);
		
	       }
	       
	       System.out.println("List: " + list.toString());
	       System.out.println("Count: " + list.count());
	       
	       
		 list.remove(6);
	}
	
	/**
	 * loops through list and adds an element at a specific index
	 * prints the list out
	 * prints the updated count
	 * removes an element at index 6
	 * updates count
	 */
	@Test
	public void testCount()
	{
		for(int i = 1; i < 10; i++)
	       {
	           list.add(i);
		
	       }
	       
	       System.out.println("List: " + list.toString());
	       System.out.println("Count: " + list.count());
	       
	       
		 list.remove(6);
		 System.out.println("Count: " + list.count());
	}
	
	/**
	 * loops through list and adds an element at a specific index
	 * prints the list out
	 * prints the updated count
	 * removes an element at index 6
	 * updates count
	 * prints the list as a string
	 */
	@Test
	public void testToString()
	{
		for(int i = 1; i < 10; i++)
	       {
	           list.add(i);
		
	       }
	       
	       System.out.println("List: " + list.toString());
	       System.out.println("Count: " + list.count());
	       
	       
		 list.remove(6);
		 System.out.println("Count: " + list.count());
		 System.out.println("List: " + list.toString());
	}
	
	/**
	 * loops through list and adds an element at a specific index
	 * prints the list out
	 * prints the updated count
	 * removes an element at index 6
	 * updates count
	 * prints the list as a string
	 * searches the list at index 3
	 */
	@Test
	public void testSearch()
	{
		for(int i = 1; i < 10; i++)
	       {
	           list.add(i);
		
	       }
	       
	       System.out.println("List: " + list.toString());
	       System.out.println("Count: " + list.count());
	       
	       
		 list.remove(6);
		 System.out.println("Count: " + list.count());
		 System.out.println("List: " + list.toString());
		 System.out.println("Item 3 found at index: " + list.search(3));
	}

}
