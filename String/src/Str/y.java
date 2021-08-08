package Str;

public class y 

{
	
	public static void main(String[] args)
	{
		
		String s1= new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1=s2); //assigning value of s2 to s1
		
		String s3 = "abc";
		String s4 = new String("abc");
		System.out.println(s3==s4); //boolean return 
		
		String s5 ="nishantmane895@gmail.com"; //string to array conversion
		char[] ch= s5.toCharArray();
	    for(int i =0; i<s5.length(); i++)
	    {
	    	System.out.println(ch[i]);
	    }

		//string to int conversion
		
		String t1 = "234";
		System.out.println(t1+6);
		
		System.out.println(Integer.parseInt(t1)+6);
		
		// int to string conversion
		
		int t3 = 56;
		System.out.println(t3+4);
		
		System.out.println(Integer.toString(t3)+4);
		
		//split the string 
		
		String t4 = "tarzan/the/wonder/car";
		
		String t5[] = t4.split("/");
		for (String str : t5) 
		{
			System.out.println("----->"+str);
		}
		
		System.out.println("-----string to int-----");
		
		String sd = "4555";
		
		int e = Integer.parseInt(sd);
		
		System.out.println(e+1);
		
		System.out.println("-----int to string-----");
		
		int t = 454;
		
		String z1= Integer.toString(t);
		
		System.out.println(z1+"f");
		
		System.out.println("----modifying string------");
		
		String s10 = s3.replace("abc","xyz");
		
		System.out.println(s10);
		
		

	}

}
