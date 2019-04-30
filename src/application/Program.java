package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
		//instantiate news Lists 
		List<Integer> myInts = Arrays.asList(3,4,5);
		List<Double> myDoubles = Arrays.asList(6.58, 6.44);
		List<Object> myObjects = new ArrayList<Object>();
		
		//instantiate the copy method
		copy(myInts, myObjects);
		//instantiate the print list method
		printList(myObjects);
		//instantiate the copy method
		copy(myDoubles, myObjects);
		//instantiate the print list method
		printList(myObjects);
		
		
	}
	
	    //Method to copy the values of a list
	    //?: receiving the type of a selected list
		public static void copy(List<? extends Number> source,  List<? super Number> destiny) {
			//"for" scroll through a list and add values ​​from another list
			for(Number number : source) {
				destiny.add(number);
			}
		}
		//Method to print the selected list
		// ?: receiving the type of a selected list
		public static void printList(List<?> list) {
	    //"for"scroll through a list and print all the values
               for(Object obj : list) {
				System.out.print(obj + " ");
			}
			System.out.println();
		
		
	}

}
