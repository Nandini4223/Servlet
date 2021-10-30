// we are able to create interface reference.But we are not able to create interface object
package interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		Alpha r;//allowed
		r=null;//allowed
		// r=new Alpha();------>Not allowed
	}

}
