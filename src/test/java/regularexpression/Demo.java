package regularexpression;

import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		//whole second word should be matched with first one means java then java not like beautiful
		
		
		
		//boolean matchingStatus=Pattern.matches(".*Pragti.*", "this Pragti name");    >>matched
		
		//boolean matchingStatus=Pattern.matches(".*Pragti", "this Pragti");      >>matched
		 
		//boolean matchingStatus=Pattern.matches("Pragti", "this Pragti name");       >>not matched
		    
		//boolean matchingStatus=Pattern.matches("java", "java");                     >>matched
		
		   
		//boolean matchingStatus=Pattern.matches("Java", "java");  >>not matched
		  
		//boolean matchingStatus=Pattern.matches("[Jj]ava", "java");          >>matched
		
		//boolean matchingStatus=Pattern.matches("[Jj]ava", "python");  >>not matched
		
		
		
		//boolean matchingStatus=Pattern.matches("ye[sp]", "yep");  >>matched
		
		//boolean matchingStatus=Pattern.matches("ye[sp]", "yes");    >>matched
		
		//boolean matchingStatus=Pattern.matches("ye[sp]", "yeu"); >>not matched
		
		//boolean matchingStatus=Pattern.matches("[sfk]it", "sit");     >>matched		
		//boolean matchingStatus=Pattern.matches("[sfk]it", "fit");      >>matched
		//boolean matchingStatus=Pattern.matches("[sfk]it", "kit");        >>matched
		
		
		
		
		//boolean matchingStatus=Pattern.matches("[sfk]it", "slo");  >>not matched
		
		
		//boolean matchingStatus=Pattern.matches("[sfk]it", "fgh");   >>not matched
		
		
		//.ava     .indicates only one thing for ex, u I 4 &   only one not two three and so on
		
		//boolean matchingStatus=Pattern.matches(".ava", "bava");    >>matched	
		//boolean matchingStatus=Pattern.matches(".ava", "Java");		 >>matched	
		//boolean matchingStatus=Pattern.matches(".ava", "$ava");      >>matched	
		//boolean matchingStatus=Pattern.matches(".ava", "6ava");	    >>matched	
		
		
		//boolean matchingStatus=Pattern.matches(".ava", "69ava");  >>not matched
		
		//boolean matchingStatus=Pattern.matches(".ava", "699ava");      >>not matched
		
		
		
		
		//[0-9]am                      0-9 any number can come not two/three numbers
		
		//boolean matchingStatus=Pattern.matches("[0-9]am", "8am");      >>matched
		
		//boolean matchingStatus=Pattern.matches("[0-9]am", "3am");     >>matched
		
		//boolean matchingStatus=Pattern.matches("[0-9]am", "36am");    >>not matched
		
		//boolean matchingStatus=Pattern.matches("[0-9]am", "sam");  >>not matched
		
		
		
		
		//[a-z]et                      a-z any letter can come not two/three letters
		
		//boolean matchingStatus=Pattern.matches("[a-z]et", "set");  >>matched		
		
		//boolean matchingStatus=Pattern.matches("[a-z]et", "anet");    >>not matched
		
		
		
		//[A-Z]et                        A-Z any letter can come not two/three letters		
		
		//boolean matchingStatus=Pattern.matches("[A-Z]et", "Set");      >>matched	
		
		//boolean matchingStatus=Pattern.matches("[A-Z]et", "SFet");     >>not matched
		
		
		
		//[a-zA-Z0-9]et                    only one lowercase letter/uppercase letter/0-9 any disit
		
		
		//boolean matchingStatus=Pattern.matches("[a-zA-Z0-9]et", "Set");  
		 
		//boolean matchingStatus=Pattern.matches("[a-zA-Z0-9]et", "set");  
		
		//boolean matchingStatus=Pattern.matches("[a-zA-Z0-9]et", "8et");  
		
		//boolean matchingStatus=Pattern.matches("[a-zA-Z0-9]et", "80et");    >>not matched
		
		//boolean matchingStatus=Pattern.matches("[a-zA-Z0-9]et", "suet");  >>not matched
		
		
		//[^0-9]et                except 0-9, everything is acceptable, for ex, s, A
		
		//boolean matchingStatus=Pattern.matches("[^0-9]et", "set");   >>matched	
		
		//boolean matchingStatus=Pattern.matches("[^0-9]et", "Aet");   >>matched		
		  
		//boolean matchingStatus=Pattern.matches("[^0-9]et", "9et"); 	 >>not matched
		
			
		
		
		
		//se[a-z]                only a-z allowed, not upper, not numeric		
		
		//boolean matchingStatus=Pattern.matches("se[a-z]", "sea");  >>matched
		
		//boolean matchingStatus=Pattern.matches("se[a-z]", "seA");    >>not matched
		
		//boolean matchingStatus=Pattern.matches("se[a-z]", "se9");    >>not matched
		
		
		//s[^aeiou]t                      except a e i o u, everything is acceptable, for ex, s, x, A
		
		
		
		
		//boolean matchingStatus=Pattern.matches("s[^aeiou]t", "szt");   >>matched
		
		//boolean matchingStatus=Pattern.matches("s[^aeiou]t", "sit");    >>not matched
		
		
		//very extra: anything can be anything; lowercase, upppercase, numeric
		
		//boolean matchingStatus=Pattern.matches("s[^aeiou]t", "sXt");    >>matched
		//boolean matchingStatus=Pattern.matches("s[^aeiou]t", "s9t");      >>matched
		
		
		
		//  \d                            like [0-9]am   5am, 6am all are valid 
		
		//boolean matchingStatus=Pattern.matches("\\dam", "7am");     >>matched
		
		
		
		
		
	//   \D                           except  [^0-9] anything is allowed
		
		//boolean matchingStatus=Pattern.matches("\\Dam", "pam");  >>matched	
		
		//boolean matchingStatus=Pattern.matches("\\Dam", "Ram");    >>matched		
		
		//boolean matchingStatus=Pattern.matches("\\Dam", "9am");   >>not matched
		
		
		// \w              [A-Za-z0-9_] allowed only 		  
		
		  
		//boolean matchingStatus=Pattern.matches("\\wak", "9ak");    	 >>matched 
		
		//boolean matchingStatus=Pattern.matches("\\wam", "Rak");  >>matched	
			
		//boolean matchingStatus=Pattern.matches("\\wam", "#ak");   >>not matched
		
		 
		//   \W                                  [^A-Za-z0-9_] except this everything is allowed
		
		
		//boolean matchingStatus=Pattern.matches("\\Wak", "#ak");     >>matched 
		//boolean matchingStatus=Pattern.matches("\\Wak", "@ak");     >>matched 		
		//boolean matchingStatus=Pattern.matches("\\Wak", "0ak");   >>not matched
		
		
		
		
		//^My      starts with My after that nothing should be there^
		
		
		//boolean matchingStatus=Pattern.matches("^My", "My");   >>matched
		//boolean matchingStatus=Pattern.matches("^My", "My name is Pragti"); >>not matched
		
		//boolean matchingStatus=Pattern.matches("^My.*", "My name is Pragti");  >>matched
		//boolean matchingStatus=Pattern.matches("^My.*", "My");     >>matched
	
		
		
		
		//very extra:   .*     nothing can be der or anything can be der (even space)   one word/two words/three words;  0/1
		
		
		
		
		//Arun$          ends with Arun, nothing should be der
		
		//boolean matchingStatus=Pattern.matches("Arun$", "Arun");   >>matched	
		
		//boolean matchingStatus=Pattern.matches("Arun$", "My name is Arun");   >>not matched	
		
		//boolean matchingStatus=Pattern.matches(".*Arun$", "My name is Arun");   >>matched
		
		
		
		
		//A..n       can fit only two; chars-upper/lower/numbers/special
		
		//boolean matchingStatus=Pattern.matches("A..n", "Asjn");   >>matched	
		//boolean matchingStatus=Pattern.matches("A..n", "Asjkn");     >>not matched	
		//boolean matchingStatus=Pattern.matches("A..n", "A99n");    >>matched			
		//boolean matchingStatus=Pattern.matches("A..n", "A$%n");       >>matched	
		
		
		
		
		//^My.*Arun$
		
		
		
		
		//boolean matchingStatus=Pattern.matches("^My.*Arun$", "My name is country Arun");  //matched		
		//boolean matchingStatus=Pattern.matches("^My.*Arun$", "My Arun");    //matched		
		//boolean matchingStatus=Pattern.matches("^My.*Arun$", "MyArun");  //matched		
		//boolean matchingStatus=Pattern.matches("^My.*Arun$", "India  is my Country");   >>not matched
		
		
		
		//^My.+Arun$
		
		//boolean matchingStatus=Pattern.matches("^My.+Arun$", "My name is country Arun");   //matched
		//boolean matchingStatus=Pattern.matches("^My.+Arun$", "My name Arun");  //matched
		//boolean matchingStatus=Pattern.matches("^My.+Arun$", "MyArun");   >>not matched
		
		  
		//.+                 at least one thing should be der    can be more  1/2
		//.*                                                                  0/1
		
		
		
		//^  start
		//$   end
		
		
		
		
		//^My.?Arun$                    nothing/only one word can be der     0/1		
		
		
		//boolean matchingStatus=Pattern.matches("^My.?Arun$", "MyArun");    //matched		
		//boolean matchingStatus=Pattern.matches("^My.?Arun$", "My Arun");   //matched		
	    //boolean matchingStatus=Pattern.matches("^My.?Arun$", "My name is Arun");   >>not matched
		
		
		
		//^My.{2}Arun$               two should be der          
		
		//boolean matchingStatus=Pattern.matches("^My.{2}Arun$", "My77Arun");      //matched
		//boolean matchingStatus=Pattern.matches("^My.{2}Arun$", "My##Arun");      //matched 
		//boolean matchingStatus=Pattern.matches("^My.{2}Arun$", "My Arun");       >>not matched
		//boolean matchingStatus=Pattern.matches("^My.{2}Arun$", "My  Arun");      //matched
		
		
		//Java|java    - only these two words allowed		
	
		//boolean matchingStatus=Pattern.matches("Java|java", "java"); 	   >>matched
		//boolean matchingStatus=Pattern.matches("Java|java", "Java");	   >>matched	 
		//boolean matchingStatus=Pattern.matches("Java|java", "python");     >>not matched
		
		
		
		
		
		//[a-d[m-p]]         should be matched either a-d/m-p
		
		//boolean matchingStatus=Pattern.matches("[a-d[m-p]]", "b");      >>matched
		//boolean matchingStatus=Pattern.matches("[a-d[m-p]]", "m");        >>matched
		//boolean matchingStatus=Pattern.matches("[a-d[m-p]]", "q");          >>not matched
		
		
		
		
		
		//[a-z&&[def]]          only d,e,f should be matched nothing else
		
		//boolean matchingStatus=Pattern.matches("[a-z&&[def]]", "e");     >>matched
		//boolean matchingStatus=Pattern.matches("[a-z&&[def]]", "f");      >>matched
		//boolean matchingStatus=Pattern.matches("[a-z&&[def]]", "a");      >>not matched
		
		
		
		
		//[a-z&&[^bc]]    b and c should not be matched, others can match	
		
		
		//boolean matchingStatus=Pattern.matches("[a-z&&[^bc]]", "e");   >>matched
		//boolean matchingStatus=Pattern.matches("[a-z&&[^bc]]", "b");   >>not matched
		
		
		
		//[a-z&&[^m-p]]      from m-p nothing should be der, except it anything can come
		
		//boolean matchingStatus=Pattern.matches("[a-z&&[^m-p]]", "a");    >>matched
		//boolean matchingStatus=Pattern.matches("[a-z&&[^m-p]]", "m");       >>not matched
		
		
		
		
		//b?at            bat, at
		
		//boolean matchingStatus=Pattern.matches("b?at", "bat");   >>matched		
		//boolean matchingStatus=Pattern.matches("b?at", "bvat");    >>not matched
		//boolean matchingStatus=Pattern.matches("b?at", "at");  >>matched
		
		
		
		
		//b+at              (concat)  b can be 1 time/2/more, only b ll be der no other letter can come
		
		
		//boolean matchingStatus=Pattern.matches("b+at", "bat");    >>matched
		//boolean matchingStatus=Pattern.matches("b+at", "bbat");   >>matched		 
		//boolean matchingStatus=Pattern.matches("b+at", "bbbat");   >>matched
		//boolean matchingStatus=Pattern.matches("b+at", "bnat");    >>not matched
		
		
		
		//b*at      (concat)  b can be 1 time/2/more, only b ll be der no other letter can come
		
		//boolean matchingStatus=Pattern.matches("b*at", "bat");        >>matched
		//boolean matchingStatus=Pattern.matches("b*at", "bbat");       >>matched
		//boolean matchingStatus=Pattern.matches("b*at", "bbbat");     >>matched
		//boolean matchingStatus=Pattern.matches("b*at", "at");         >>matched
		//boolean matchingStatus=Pattern.matches("b*at", "bnat");         >>not matched 
		
		
		
		
		
		//b{2}at   - only two b allowed not less/more
		
		
		//boolean matchingStatus=Pattern.matches("b{2}at", "bbat");    >>matched 		
		//boolean matchingStatus=Pattern.matches("b{2}at", "bbbat");   >>not matched 
		
		
		
		//b{2,}at      - only two b allowed not less/more like above exactly
		
		
		//boolean matchingStatus=Pattern.matches("b{2}at", "bat");   >>not matched
		//boolean matchingStatus=Pattern.matches("b{2}at", "bmat");   >>not matched 		
		//boolean matchingStatus=Pattern.matches("b{2,}at", "bbat");   >>matched 
		
		
		
		//b{2,4}at
		
		
		
		//boolean matchingStatus=Pattern.matches("b{2,4}at", "bbat");      >>matched 
		
		//boolean matchingStatus=Pattern.matches("b{2,4}at", "bbbat");     >>matched 
		
		//boolean matchingStatus=Pattern.matches("b{2,4}at", "bbbbat");    >>matched 
		
		
		//>>not matched
		boolean matchingStatus=Pattern.matches("b{2,4}at", "bat");     
		
		
		if(matchingStatus)  
		{
			System.out.println("matched");
		}
		
		else 
		{
			System.out.println("not matched");

		}
		
		

	}

}
