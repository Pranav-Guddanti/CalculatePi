/*Pranav Guddanti
9-11-2024
CalculatePi.java
This approximates pi two different ways. It prints each result to 2, then
6 decimal places. Each result is compared to 3.141592 and the difference is printed.
Working on: Using printf and the format class to format the decimals.
Declare and initializing variables (D&I). A final constant.

Psuedocode == the plan

class header D&I a final constant for PI

main header
	make an instance of the class 
	use the instance to call firstApprox
	use the instance to call secondApprox
	
firstApprox header
	declare approx1 as a float
	initializing approval to 0.0f
	D&I diff1, set to -100.0f
	
	set approxl to 22/7
	set diffl to difference between approxl and PI
	print 3 blank lines, then the intro sent using PI
	print approxl to 2 decimal places, then 6, then diff1 to 6 places
	
secondApprox header
	D&I approx2 as a float initialize approx2 to 0.0f
	D&I diff1, set to -100.0f
	
	set approx2 to (4+100)*8 +62000 all divided by 20000
	set diff2 to difference between approx2 and PI
	print approx2 to 2 places, then 6, then diff2 to 6 places
*/

public class CalculatePi
{
	final float PI = 3.141592f; // this is a final constant 
	public static void main(String[] args)
	{
		CalculatePi calcPi = new CalculatePi();
		calcPi.firstApprox();
		calcPi.secondApprox();
	}
	public void firstApprox()
	{
		//program what we said in psuedocode
		float approx1;
		approx1 = 0.0f;
		float diff1 = -100.0f;
		
		approx1 = 22/7f;
		diff1 = approx1-PI;
		
		System.out.println("\n\n\n");
		System.out.printf("I am approximating pi (a bit more than %5.10f)%n",PI);
		System.out.printf("The calculation 22/7 yields %1.2f or more specifically %1.6f shown to 6 places. It is %1.6f %ndifferent from %1.6f",approx1,approx1,diff1,PI);
	}
	/*I	am	approximating pi	(a	bit	more	than	3.141592).
The	calculation	22/7	yields	3.14 or	more	specifically	3.142857 shown	to	6	places.		It	is	-0.001265
different	from	3.141592.
The	calculation	(4+100)	x	8	+	62000	all	divided	by	20000	yields	3.14 or	more	specifically	
3.141600 shown	to	6	places.		It	is	-0.000008 different	from	3.141592.
(The	last	line	will	be	printed	twice.		See	directions	above.)
*/
	public void secondApprox()
	{
		float approx2;
		approx2 = 0.0f;
		float diff2 = -100.0f;
		
		approx2 = ((4f+100)*8 +62000)/20000;
		diff2 = approx2-PI;
		System.out.println("\n\n\n");
		System.out.printf("The calculation (4+100) x 8 + 62000 all divided by 20000 yields %1.2f or more specifically %1.6f shown to %n 6 places. It is %1.6f different from %1.6f.",approx2,approx2,diff2,PI);
		System.out.println("\n\n\nThe calculation (4+100) x 8 + 62000 all divided by 20000 yields 3.14 or more specifically "+Format.right(approx2,6,2)+" shown to 6 places.It is"+Format.right(diff2,6,6)+"different from "+Format.right(PI,6,6)+".\n\n");
	}
	
}
		
