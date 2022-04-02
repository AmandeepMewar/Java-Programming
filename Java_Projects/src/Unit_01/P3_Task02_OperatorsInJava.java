package Unit_01;

/*
 * Operators in Java is a symbol that is used to perform operations between two operands .
 * 
 * sum = a + b;
 * 
 * for example: +, -, *, / etc.
 * 
 *  -> a+=1;  // a = a + 1;
 *  
 *  Types of operators in Java
 *  - Unary Operator:           {prefix and postfix} {a++, a--, ++a, --a, ~a, !a}
 *  - Arithmetic Operator:      {*  /  %  +  -}
 *  - Shift Operator:           {<<  >>}
 *  - Relational Operator:      {< > <= >= == !=}
 *  
 *  - Bitwise Operator:         {&  ^  |}  {bitwise AND, excusive OR, inclusive OR}
 *  - Logical Operator:         {&& ||}
 *  
 *  - Ternary Operator:         {? :}
 *  - Assignment Operator       {= += -= /= %= &= ^=  <<= >>= >>>=2 }
 */
public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorsInJava obj = new OperatorsInJava();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();
		
	}

}

class OperatorsInJava{
	
	void UnaryOperator() {
		
		int a = 10;
		boolean b = false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++);  // 10
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		
		/*
		 * Bitwise Complement(~)
		 * This unary operator returns the one's complement representation of the input value
		 * with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
		 */
		
		System.out.println(~a);  // 1010 invert all bits=> 0101 2's complement => 1010 + 1 => 1011
		//000000000000......1010
		
		// 'NOT' Operator(!) : It is used to reverse the value of an operand
		System.out.println(!b);    // true
		System.out.println("\n");
		
	}
	
	void ArithmeticOperator() {
		
		System.out.println("Inside ArithmeticOperator");
		int a = 10;
		int b = 5;
		System.out.println(a + b); // 15
		System.out.println(a - b); // 5
		System.out.println(a * b); // 50
		System.out.println(a / b); // 2
		System.out.println(a % b); // 0
		
		// What is the output of this expression?
		System.out.println(((10 * 10) / 5) + 3 - ((1 * 4) / 2));
		System.out.println("\n");
	}
	
	void ShiftOperator() {
		System.out.println("Inside ShiftOperator");
		/*
		 * 01010101<<1
		 * 10101010
		 * 
		 * 01010101>>1
		 * 00101010
		 * 0,0,1,0,0,0 {8>>1} >>
		 * 0,0,0,1,0,0 {4>>1}
		 * 0,0,0,0,1,0 {2>>1}
		 * 0,0,0,0,0,1 {1}
		 * 32,16,8,4,2,1
		 * 
		 * 0,0,1,0,0,0 {8<<1} >>
		 * 0,1,0,0,0,0 {16<<1}
		 * 1,0,0,0,0,0 {32}
		 */
		
		System.out.println(10 << 2); // 10*2^2 = 10*4 = 40
		System.out.println(10 << 3); // 10*2^3 = 10*8 = 80
		System.out.println(20 << 2); // 20*2^2 = 20*4 = 80
		System.out.println(15 << 4); // 15*2^4 = 15*14 = 240
		
		System.out.println(10 >> 2); // 10/2^2 = 10/4 = 2
		System.out.println(20 >> 2); // 20/2^2 = 10/4 = 5
		System.out.println(20 >> 3); // 20/2^3 = 20/8 = 2
		
		System.out.println("\n");
	}
	
	// result is true or false
	void RelationalOperator() {
		
		System.out.println("Inside RelationalOperator");
		
		int a = 10;
		int b = 20;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println("\n");
	}
	
	//Bitwise: Second condition is also checked but not in logical && and even in ||
	void BitwiseAndLogicalOperators() {
		
		System.out.println("Inside BitwiseAndLogicalOperators");
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Logical && and Bitwise &
		System.out.println(a<b && a++<c);   //false && true = false
		System.out.println(a);              //10 because second condition is not checked
		
		System.out.println(a<b & a++<c);    //false && true = false
		System.out.println(a);              //11 because second condition is checked
		
		//Logical || and Bitwise |
		System.out.println(a>b || a<c);     //true == true
		System.out.println(a>b | a<c);      //true | true = true
		
		System.out.println(a>b||a++<c);     //true || true = true
		System.out.println(a);              //10 because second condition is not checked
		System.out.println(a>b|a++<c);      //true | true = true
		System.out.println(a);              //11 because second condition is checked
		
		/*
		 * Exclusive and Inclusive OR {| and ^}
		 * In case of or: 0|1= 1, 1|0 = 1, 1|1 = 1, 0|0 = 0
		 * In case of xor: 0|1= 1, 1|0 = 1, 1|1 = 0, 0|0 = 0
		 */
		System.out.println("Bitwise inclusive OR:"+(12|12));  // 1100 | 1100 = 1100
		System.out.println("bitwise exclusive OR:"+(12^12));  // 1100 ^ 1100 = 0000
		
		System.out.println("\n");
		
	}
	
	void TernaryOperator() {
		
		System.out.println("Inside TernaryOperator");
		
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
		
		System.out.println("\n");
	}
	
	void AssignmentOperator() {
		
		System.out.println("Inside AssignmentOperator");
		
		int a = 10;
		int b = 20;
		a+=4;       //a = a+4   (a= 10+4)
		b-=4;       //b = b-4   (b= 20-4)
		System.out.println(a);
		System.out.println(b);
		
		//Exercise??
		
		b>>>=2;
		System.out.println(b);
		
		a=10;
		a+=3;
		System.out.println(a);
		a-=4;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a/=2;
		System.out.println(a);
		
		System.out.println("\n");
		
	}
}