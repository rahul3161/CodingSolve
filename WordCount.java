package lfh;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class WordCount
{  
	public static boolean DESC = false;
    static void Count(String inputWords[])
    {
    	 
        HashMap<String, Integer> CountMap = new HashMap<String, Integer>();
         
         
        for (String i : inputWords) 
        {
            if(CountMap.containsKey(i))
            {
                 
                CountMap.put(i, CountMap.get(i)+1);
            }
            else
            {
                 
                CountMap.put(i, 1);
            }
        }
        System.out.println("After sorting descindeng order......");
        Map<String, Integer> MapDesc = sortByComparator(CountMap, DESC);
        
        System.out.println("Count of Words : "+MapDesc);
    }
    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) 
    {    
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Words: ");
		int n = Integer.parseInt(sc.nextLine());
		String input[]=new String[n];
		for(int i=0;i<n;i++)
		{
        input[i]=sc.nextLine();
		}
		Count(input);
    }    
}