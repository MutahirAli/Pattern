package comsats.sc.compositepattern;

public class SubEngineer extends Engineer {

	public SubEngineer(long empId, String name, String department) {
		super(empId, name, department);

	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId + " ***** " + name + " ***** " + department);
	}

}
