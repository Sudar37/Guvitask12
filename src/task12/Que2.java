package task12;

import java.util.ArrayList;

public class Que2 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<String> list = new ArrayList<String>(); // Creating object of ArrayList<String> 
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("ArrayList before removing elements: " + list);

        list.clear();

        System.out.println("ArrayList after removing elements: " + list);
    }
}
---------------------------------------------------------------------------------------------------------------------
OUTPUT:
	
ArrayList before removing elements: [A, B, C, D, E]
ArrayList after removing elements: []
