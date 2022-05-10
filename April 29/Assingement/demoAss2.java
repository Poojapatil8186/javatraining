import java.util.*;

class Employee {
private int id;
private String name;
private String address;
private Double salary;
public Employee(int id, String name, String address, Double salary) {
super();
this.id = id;
this.name = name;
this.address = address;
this.salary = salary;
}	
public int getId() 
return id;
}
@Override
public String toString() 
{
return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}
}
class Assignment4
{
public static void main(String[] args) {
List<Employee> list = new ArrayList<>();
list.add(new Employee(101, "vaishali", "Aakashwani chowk, India", 20000.0));
list.add(new Employee(102, "arti", "garkheda, India", 30000.0));
list.add(new Employee(103, "sonali", "usmanpura, India", 25000.0));
list.add(new Employee(104, "swati", "bajajnagar, India", 40000.0));
Iterator<Employee> it = list.iterator();
while (it.hasNext()) 
{
Employee emp = it.next();
			
if (emp.getId() == searchId)
{
System.out.println(emp);
}
}
}