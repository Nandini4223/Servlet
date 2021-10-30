package BasicPrograms;

public class Point {
	private int x;
	private int y;
	
	Point(){
		x=0;
		y=0;
		
	}
	Point(int a){
		x=a;
		y=0;
		
	}
	Point(int a,int b){
		x=a;
		y=b;
		
	}
	Point(Point p){
		x=p.x;
		y=p.y;
		
	}
	void show() {
		System.out.println("("+x+","+y+")");
	}
}
