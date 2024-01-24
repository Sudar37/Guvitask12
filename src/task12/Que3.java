package task12;

import java.util.TreeMap;

public class Que3 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
        
        TreeMap<String, Integer> employee = new TreeMap<String, Integer>();
        employee.put("Manoj", 2);
        employee.put("Charles", 5);
        employee.put("Saran", 1);
        employee.put("Sudar", 3);
        employee.put("Bala", 4);

        System.out.println("Employee Name : " + employee.keySet());
    }
}
-------------------------------------------------------------------------------------------------------------------
OUTPUT:

Employee Name : [Bala, Charles, Manoj, Saran, Sudar]
