package com.test.sel.seleniumFramework;

public class tws1 {
	public void StringReverse() {
		
		  //String to reverse.
		  String str = "This 5";
		  String revstring = "";
		  System.out.println(str.length());

		  for (int i = str.length()-1; i >= 0; i--) {
		   //Start getting characters from end of the string.
			  
		   revstring += str.charAt(i);
		  }

		  System.out.println(revstring);
		 }
		
		
		public static void main(String[] args) {  
			tws1 s1 =new tws1();
			s1.StringReverse();
		
			
			
			
		}
			
		}