package recursionPractice;

public class numberSum {
	
	 public static int addNumbers(int num) {
		 
	        if (num != 0)
	        	
	            return num + addNumbers(num - 1);
	        else
	            return num;
	    }

	    public static void main(String[] args) {
			// TODO Auto-generated method stub

	    	
	        int number = 5;
	        int sum = addNumbers(number);
	        System.out.println("Sum = " + sum);
	    }

	   
	}