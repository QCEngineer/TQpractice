package hashSet;




public class Student  //implements Comparable
{

int roll;String name;
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + "]";
}
public Student(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}

public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + roll;
	return result;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (roll != other.roll)
		return false;
	return true;
}
/*
public int compareTo(Object o)
{
	Student o1 = (Student)o;
	if(roll <  o1.roll)
		return 1;
	else if(roll>o1.roll)
		return -1;
	else
	return 0;
}
*/


}
