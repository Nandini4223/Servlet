//As interface data is final data so we can not modify it.

package interfaces;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Alpha r;
		r=null;
		System.out.println(r);
		System.out.println(Alpha.a);
		//r.a=6;....C error
		//Alpha.a=7;------C error
	}

}
