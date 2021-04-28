
public class FibMain {

	public static void main(String[] args) {
		
		System.out.println("Answer to Question 1: ");
		System.out.println("Using recursive function, the 9th position of fib number is: " + fib_recursion(9));
		System.out.println();
		
		System.out.println("Answer to Question 2: ");
		System.out.println("Using iterative function, the 9th position of fib number is: " + fib_iteration(9));
		System.out.println();

		
		System.out.println("Answer to Question 3: ");
		System.out.println("Using recursive function, the first 5 number of adding the pairs of squared Fibonacci numbers is: " + fib_addsquare(1)+
				" " + fib_addsquare(2) + " " + fib_addsquare(3) + " " + fib_addsquare(4) + " " + fib_addsquare(5));
		System.out.println();

		//Answer to Question 3 Continue
		//As we can see the first 5 numbers of adding the pairs of squared Fib numbers are 1 2 5 13 34. And if we put the bracket of these 5 numbers that appears in
		//the original fib number, we have 0 [1] 1 [2] 3 [5] 8 [13] 21 [34]. Therefore, if we add only pairs of squared Fibonacci numbers,
		//we get the pattern of every number in the odd number position from the original Fibonacci numbers. 
		
		System.out.println("Answer to Question 4: ");
		System.out.println("The pattern of adding the squares of Fibonacci numbers up to the current position(starting from position 0 are as follow: " +
				fib_iterationaddsquare(0) + " "+ fib_iterationaddsquare(1) + " " + fib_iterationaddsquare(2) + " " + fib_iterationaddsquare(3) + " " + fib_iterationaddsquare(4)+ " "
				+fib_iterationaddsquare(5) + " "+ fib_iterationaddsquare(6) + " " + fib_iterationaddsquare(7) + " " + fib_iterationaddsquare(8) + " " + fib_iterationaddsquare(9));
		System.out.println();
		
		//Answer to Question 4 Continue
		//As we can see the first few sum are 0 1 2 6 15 40 104 273 714 1870. If you just look at this sequence itself. There is no pattern unless you compare it to the 
		//original fib number. notice that every number above is the product of pairs of fib number. so the sum of squared fibonacci numbers up to the current position is
		//actually the product of the current position and current position + 1 from the original fib number sequence. For instance, up to the 4th position of the squared fib number
		//sequence which is 9, the sum is 15(0+1+1+4+9). Observe that the 4th and 5th from the original fib sequence, which are 3 & 5 and their products is 15 also.
		//If you continuously add the squares of Fib numbers, you can form a rectangle and then realize that the length of the rectangle is actually the next Fib number and so on.
	}
	//Q1
	public static int fib_recursion(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fib_recursion(n-1)+fib_recursion(n-2);
	}
	//Q2
	public static int fib_iteration(int n) {
		int count=0;
		int fib1=0;
		int fib2=1;
		int ans=-1;
		
		if(n==0||n==1) ans=n;
		else {
			while(count<n-1) {
				ans=fib1+fib2;
				fib1=fib2;
				fib2=ans;	
				count++;
			}
		}
		return ans;
	}
	//Q3
	public static int fib_addsquare(int n) {
		return (fib_recursion(n)*fib_recursion(n))+(fib_recursion(n-1)*fib_recursion(n-1));
	}
	//Q4
	public static int fib_iterationaddsquare(int n) {
		int count=0;
		int fib1=0;
		int fib2=1;
		int ans=-1;
		int sum=0;
		
		if(n==0) return 0;
		if(n==1) return 1;

		else {
			while(count<n-1) {
				ans=fib1+fib2;
				fib1=fib2;
				fib2=ans;	
				count++;
				sum+=(ans*ans);
				
			}
		}
		
		return sum+1;
	}

}
