package collections;

import java.util.*;

public class MapToList {
    public static void main(String[] args) {
        Map<String,Integer> salary=new LinkedHashMap<String,Integer>();
        //Add elements
        salary.put("IT Manager",155000);
        salary.put("Accountant",93000);
        salary.put("Employee",98000);
        salary.put("QA Tester",111000);
        salary.put("Developer",122000);

        Set<String>keySet=salary.keySet();
        List<String>keyList= new ArrayList<String>(keySet);
        System.out.println(keyList);

        Collection<Integer>valueSet=salary.values();
        List<Integer>valueList=new ArrayList<Integer>(valueSet);
        System.out.println(valueList);
        for (String jobType:keyList) {
            System.out.println(jobType);
        }
        for (Integer salaryAmount:valueList) {
            System.out.println(salaryAmount);
        }
        Set<Map.Entry<String,Integer>>entrySet=salary.entrySet();
        ArrayList<Map.Entry<String,Integer>>entryArrayList=new ArrayList<>(entrySet);
        System.out.println("ArrayList of key-value pairs: ");
        for (Map.Entry pairs:entryArrayList) {
            System.out.println(pairs.getKey()+" : "+ pairs.getValue());
        }
        }
    }

