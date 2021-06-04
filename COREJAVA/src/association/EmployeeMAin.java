package association;

public class EmployeeMAin {

	public static void main(String[] args) {
		Address add = new Address(26, 23, "hyd", "ts", "ind", 508208);
		Employee emp = new Employee("dihith", "dihith@gmail", 12345, 1234567890, add);

		System.out.println(emp);
		System.out.println("Id:" + emp.getId());
		System.out.println("get cityname from employee obj:" + emp.getAddress().getCity());

		emp.getAddress().setPlotNo(100);
		emp.getAddress().setStreetNo(200);
		// don't use address object(add) for seting plot and street no.
		System.out.println("new location of employee:" + emp);
	}

}
