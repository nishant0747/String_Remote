package Str;

public class string_class 
{
	public static void main(String[] args) 
	{
		String a = "My NaMe is NIshAnt MaNe";
		a.toLowerCase();
		System.out.println(a.toLowerCase());
		String b = a.toUpperCase();
		System.out.println(b);
		
		a.length();
		System.out.println(a.length());
		
		boolean c = a.isEmpty();
		System.out.println(c);
		
	    char d= a.charAt(6);
	    System.out.println(d);
	  

	

	    String w = "@MumbaiIsBestCity";
	    
	    String x = "MumbaiBest";
	    
	    String y = "MumbaiBEST ";
	    
	 
	
	    System.out.println(w.compareTo(x));
	  String w1 = w.replace("Mumbai","Pune"); // string return
	  System.out.println(w1);
	  
	 
	   
	  System.out.println(w.isEmpty());//checks spaces in between string
	                                 //return type boolean
	  System.out.println(a.concat(w)); // string return
	   
	 System.out.println(w.substring(6)); //gives output from 6th index to above
	   
	 System.out.println(w.substring(6, 12));// prints 6th to 10th index
	   
	 System.out.println(w.endsWith("BestCity")); //boolean return
	 
	 System.out.println(w.startsWith("MumbaiIs")); //boolean return
	 
	 System.out.println(w.indexOf("i")); //int return
	                                     //gives int return of only first character in case of using same character multiple times
	 
	 System.out.println(w.lastIndexOf('i'));// int return and read th string characters from last
	
	 System.out.println(w.charAt(2)); //return char datatype
	 
	 System.out.println(w.contains(x)); // boolean return
	 
	 System.out.println(x.equals(y)); //boolean return
	 
	 System.out.println(x.equalsIgnoreCase(y)); //boolean return
	 
	 System.out.println(y.length()); //int return number of characters
	                                 // it counts space also
	 
	 System.out.println(w.toUpperCase()); //return string datatype
	 
	 System.out.println(w.toLowerCase()); //return string datatype
	 
	 System.out.println("-------toCharArray--------");
	 
	 char re[] = w.toCharArray();
	 
	 System.out.println(w.length());
	 
	 for(int i=0; i<=16; i++)
	 {
		 System.out.println(re[i]);
	 }
	 
	 
	 
	}

}
