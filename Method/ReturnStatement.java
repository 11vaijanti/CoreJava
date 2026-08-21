//return statement will take control back to the caller method
//if we write return statement then we have to create a variable in a caller method to call method
//we can write return statement only if return type of method is not void 
package Method;

public class ReturnStatement
{

	public static void main(String[] args) {
		int sum = add(10,20);

	}
	public static int add(int a , int b) {
		return a+b;
	}

}
