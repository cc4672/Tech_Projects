/******************************************************************************
Simple password checker using Java, it has 3 methods:
    -Check for at least 8 digits
    -At least 1 lower case
    -At least 1 upper case


*******************************************************************************/

public class passwordChecker
{
	public static void main(String[] args) {
		System.out.println("Check Passwords: ");
		// Create an instance of the passwordChecker class
        passwordChecker checker = new passwordChecker();

        // Test cases for checkCharNum
        System.out.println("checkCharNum tests:");
        System.out.println("Test 1 (password = 'password123'): " + checker.checkCharNum("password123")); // Expected: true
        System.out.println("Test 2 (password = 'pass'): " + checker.checkCharNum("pass")); // Expected: false

        // Test cases for checkUpper
        System.out.println("\ncheckUpper tests:");
        System.out.println("Test 1 (password = 'Password123'): " + checker.checkUpper("Password123")); // Expected: true
        System.out.println("Test 2 (password = 'password123'): " + checker.checkUpper("password123")); // Expected: false

        // Test cases for checkLower
        System.out.println("\ncheckLower tests:");
        System.out.println("Test 1 (password = 'PASSWORD123'): " + checker.checkLower("PASSWORD123")); // Expected: false
        System.out.println("Test 2 (password = 'Password123'): " + checker.checkLower("Password123")); // Expected: true
	}
	
    public Boolean checkCharNum(String password) {
        Boolean check = false; // Corrected 'False' to 'false' (Java uses lowercase for booleans).
        if (password.length() >= 8) {
            check = true;
         }
        return check;
    }

	
	public Boolean checkUpper(String password){
	    Boolean checkUpper=false;
	    for(int i=0; i<password.length(); i++){
	        if (Character.isUpperCase(password.charAt(i))){
	            checkUpper=true;
	            break;
	        }
	    }
	   return checkUpper;
	}
	
	public Boolean checkLower(String password) {
    Boolean checkLower = false; // No issues here.
    for (int i = 0; i < password.length(); i++) {
        if (Character.isLowerCase(password.charAt(i))) { 
            checkLower = true;
            break; // Properly exits the loop after finding a lowercase letter.
        }
    }
    return checkLower; 
}


}