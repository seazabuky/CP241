import java.util.Objects;

public class Employee implements Comparable {

	private int eid;
	private String ename;
	private double salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, double sal) {
		eid = id;
		ename = name;
		salary = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, ename);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = (Employee) o;

		if (!this.equals(e)) {
			if (this.getSalary() > e.getSalary()) {
				return 1;
			} else if (this.getSalary() < e.getSalary()) {
				return -1;
			} else {
				if (this.getEname().compareTo(e.getEname()) == 1) {
					return 1;
				} else {
					return -1;
				}
			}
		}
		return 0;
	}
}
