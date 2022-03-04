package collections;

import java.util.*;

public class collection {

	public static void main(String[] args) {
		                                      //creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("India");//
	      city.add("Delhi");    	   
	      System.out.println(city);  
		
		                                       //creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(25); 
	      vec.addElement(50); 
	      System.out.println(vec);
		
		                                        //creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Tony");  
	      names.add("Mani");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	                                            //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(20);  
	       set.add(30);
	       set.add(40);
	       System.out.println(set);
	       
	                                             //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(100);  
	       set2.add(200);  
	       set2.add(300);
	       set2.add(400);	       
	       System.out.println(set2);
	      	} 
	      }  
	}



