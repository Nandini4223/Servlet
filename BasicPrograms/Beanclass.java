package BasicPrograms;

public class Beanclass {
private int id;
private String name;
private int Rollno;

public Beanclass(int id, String name, int rollno) {
	super();
	this.id = id;
	this.name = name;
	Rollno = rollno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return Rollno;
}
public void setRollno(int rollno) {
	Rollno = rollno;
}
public String toString()
{
	return "employeename "+name+" and employeeid "+id+" and emp rollno"+Rollno+" details ofEmployee";
}

}
