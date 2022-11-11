package tryingagain;

public class TwoSixPerson {
private String name;
private String address;
private int salary;
public TwoSixPerson() {
System.out.println("You invoked constructor with no parameters!");
}
public TwoSixPerson(String name, String address) {
System.out.println("You invoked constructor with 2 parameters!");
this.name = name;
this.address = address;
this.salary = 0;
}
public TwoSixPerson(String name, String address, int salary) {
System.out.println("You invoked constructor with 3 parameters!");
this.name = name;
this.address = address;
this.salary = salary;
}
public String getName() {
return name;
}
public String getAddress() {
return address;
}
public int getSalary() {
return salary;
}
}

