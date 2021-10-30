package BasicPrograms;

public class ConTestCase2 {
public static void main(String[] args) {
	Point p1,p2,p3,p4;
	p1=new Point();
	p2=new Point(23);
	p3=new Point(23,42);
	p4=new Point(p3);
	p1.show();
	p2.show();
	p3.show();
	p4.show();
}
}
