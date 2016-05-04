package cl.ubb.ejemplo;

public class Stack {

	public Stack(){
		
	}

	public String convertTo(int numer) {
		
		if (isDivisiblebythree(numer) && isDivisiblebyfive(numer) )
		 return "FizzBuzz";
		else{
			if (isDivisiblebythree(numer)){
				return "Fizz";
			} else{ 
				if(isDivisiblebyfive(numer)){
					return "Buzz";
				}
			}
		}
		return String.valueOf(numer);
	}

	private boolean isDivisiblebyfive(int numer) {
		return numer % 5 == 0;
	}

	private boolean isDivisiblebythree(int numer) {
		return numer % 3 ==0;
	}

	
}
