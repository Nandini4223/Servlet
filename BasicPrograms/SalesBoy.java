package BasicPrograms;
public class SalesBoy {
	private int id;
	private String name;
	private int salary;
	SalesBoy(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
   void show() {
	   System.out.println("id="+id+",name="+name+",salary="+salary);
   }
}
