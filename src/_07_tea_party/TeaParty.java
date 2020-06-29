package _07_tea_party;
/**
 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
 * George Orwell is a man, so say “Hello Mr. Orwell”. 
 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
 **/
public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	    	String greet = "Hello ";
			if(isWoman == true) {
				 if(isKnighted == true) {
					 return greet + "Lady " + name;
				 }
				 else {
					 return greet += "Ms. " + name;
				 }
			}
			 if(isKnighted == true) {
				 return greet + "Sir " + name;
			 }
			 else {
				 greet += "Mr. " + name;
			 }
			return greet;
			
	    }
	}
