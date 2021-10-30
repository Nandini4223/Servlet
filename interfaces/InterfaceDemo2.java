//interface data is public static data so we can access it by using interface name or by using interface reference pointing impl obj/interface ref pointing null.


package interfaces;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Alpha r;
		r=null;
		System.out.println(r);
		System.out.println(r.a);
		System.out.println(Alpha.a);
	}

}
