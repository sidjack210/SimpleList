/**
 * Sidney Jackson, Class ID: 414, Assignment 2
 * SimpleList.java creates a list where elements can be added.
 * removed, searched, counted, and become a string.
 */
package cse360assign2;

public class SimpleList
{
	private int count;
	private int[] list;
	
	/**
	 * SimpleList assigns the variable count to zero and
	 * sets the array list to 10 elements.
	 */
	public  SimpleList()
	{
		this.count = 0;
		this.list = new int[10];
	}
	
	/**
	 * the method add adds the parameter index to the index of the list
	 * and shifts the rest of the elements to the next index over
	 * and increments count.
	 * if the list is full then the size increases by 50%
	 * @param index
	 */
	public void add(int index)
	{
		   if (count == list.length) 
		   {
	           int half = count / 2;
	           resize(count + half);
	       } 
		   
		  for (int j = count; j > 0; j--) 
	           {
	               list[j] = list[j-1];
	           }
	           
	           list[0] = index;
	           count++;
	           System.out.println("Number added");
	 
	}
	
	/*
	 * resizes the array to a given newSize
	 * copies elements to a new array then replaces 
	 * the old array with a new one
	 */
	private void resize(int newSize)
	{
		int array[] = new int[newSize];
		
		for(int i = 0; i < newSize && i < count; i++)
		{
			array[i] = list[i];
		}
		
		list = array;
		
		if(newSize < count)
		{
			count = newSize;
		}
	}
	
	/**
	 * the method remove, removes the paramenter num from the list 
	 * then adjusts the rest of the elements in the list and updates count.
	 * resizes the list if there is more than 25% open spots
	 * @param num
	 */
	public void remove(int num)
	{
		int aIndex = search(num);

	       if (aIndex != -1) 
	       {
	           
	           for (int j = aIndex; j < count - 1; j++) 
	           {
	               list[j] = list[j + 1];
	           }
	           
	           count--;
	           System.out.println("element successfully removed");
	       } 
	       
	       else 
	       {
	           System.out.println(num + " not found");
	       }
	       
	       int b = 3 * list.length / 4;
	       if(count < b)
	       {
	    	   resize(count);
	       } 
	   }
	
	/*
	 * adds the parameter num to the beginning of the list.
	 * if the list is full then the size increases
	 */
	public void append(int num)
	{
		if(num == list.length)
		{
			int half = count / 2;
			resize(count + half);
		}
		
		list[count] = num;
		count ++;
	}
	
	/*
	 * if the list is empty returns -1
	 * otherwise, returns the first element in the list
	 * 
	 */
	public int first()
	{
		if (count == 0)
		{
			return -1;
		}
		
		return list[0];
	}
	
	/*
	 * if the list is empty returns -1
	 * otherwise, returns the last element in the list
	 */
	public int last()
	{
		if(count == 0)
		{
			return -1;
		}
		
		return list[list.length];
	}
	
	/**
	 * method returns the length of the list
	 * @return
	 */
	public int size()
	{
		return list.length;
	}

	   /**
	    * the method count just returns the updated count
	    * @return
	    */
	   public int count() 
	   {
	       return count;

       }
	   
	   /**
	    * the method search, searches the list array for the index where
	    * the parameter num is located
	    * if the paramenter num is not in the list then it returns -1
	    * @param num
	    * @return
	    */
	  public int search(int num)
	  {
	       int aIndex = -1;
	       
	       for (int k = 0; k < count; k++)
	       {
	           if (list[k] == num)
	           {
	               aIndex = k;
	           }
	       }
	       return aIndex;
	   }
	  
	  /**
	   * the method toString returns a string of all the elements in the list
	   */
	   public String toString() 
	   {
	       String aString = " ";
	       
	       for (int j = 0; j < count; j++)
	       {
	           aString += list[j];
	           
	           if (j != (count - 1)) 
	           {
	               aString += " ";
	           }
	       }
	       
	       return aString;
	   }
}
