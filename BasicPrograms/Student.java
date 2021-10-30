package BasicPrograms;
class Student{
}
class MCAStudent extends Student{
}
class Employee{
}
class Manager extends Employee{
}
class sample{
 sample(Student s){
		System.out.println("sample obj");
	}
}

class GenericConDemo{
public static void main(String[] args){
Student s1=new Student();
MCAStudent s2=new MCAStudent();
Employee e1=new Employee();
Employee e2=new Employee();
sample r1=new sample(s1);
sample r2=new sample(s2);
//sample r3=new sample(e1);
//sample r4=new sample(e2);
}
}

