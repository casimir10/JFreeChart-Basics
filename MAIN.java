package cisc3150hw4;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MAIN {
	
	public static void countFrequencies(ArrayList<String> list) 
    { 
        // Hashmap to store the amount of times a genre appears 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        for (String i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
  
        // Displaying the occurrence of elements in the arraylist 
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times"); 
        } 
    }
	
	
	
   public static void occurencePerYear(ArrayList<String> list,ArrayList<String> list2, String year) {
	 //Checks how many movies were made in a particular year by matching the genres in the List
	 //to a wordbank of all the genres, then checking if the year of the matched genre is the same as the 
	 //year that was entered. If it is, the amount of times it appears is counted and placed in a parallel
	 //array of integers for each genre. After all counting is completed it is printed.
	   
	   
	 //  (I tried to figure out how to implement this using Hashmaps but couldnt 
	 // since I couldnt find a workaround  for Keys not being able to have multiple values)
	   
	   String [] genres = {"Drama","Comedy","Romance","Thriller","Western","Crime",
				"Fantasy","IMAX","War","Musical","Children","Sci-Fi","Action","Documentary",
				"Horror","Mystery","C"};
	   
	   int [] totalmovies = new int[genres.length];
		   
	   for(int i = 0; i < list.size();i++) {
		   for(int j = 0; j < genres.length;j++) {
			   if(list.get(i).contentEquals(genres[j]) && list2.get(i).contentEquals(year)) {
				   totalmovies[j]++;
			   }
		   }
	   }
	   
	   for(int x = 0; x < genres.length;x++) {
		   System.out.println("In" + " " + year + " " + genres[x] + " " + "had" + " " + totalmovies[x] + " " + "movies");
	   }
	  
	  }
   
	
	public static void main(String []args) throws IOException {
		//parse in the file, extract the genre names
		//create hashmap and fill
		//search for how many times each genre appears, compare it to how many each appeared in past 5 years
		//parse out release year of movies, check how many movies of each genre came out for a particular year(its the last substring)
		
		File file = new File("C:\\Users\\Christian Casimir\\Desktop\\movies.csv");
		Scanner sc = new Scanner(file);
	
		
		ArrayList<String> movielist = new ArrayList<>();
		ArrayList<String> yearlist = new ArrayList<>();
		
		 String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
	
				if(line.indexOf('|') < 0) {
					movielist.add(line.substring(line.lastIndexOf(',') + 1));
				}
				else {
					movielist.add(line.substring(line.lastIndexOf('|') + 1));
				}
				yearlist.add(line.substring(line.lastIndexOf('(') + 1,line.lastIndexOf(')')));
				
				}	
			
			
		occurencePerYear(movielist,yearlist,"1995");//Example to test for a particular year
		System.out.println();
		countFrequencies(movielist);//Prints hows many times each genre appears in hashmap
		System.out.println();
		
		
		
	
	
	
	sc.close();
	}
}
