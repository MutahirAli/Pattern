package comsats.sc.compositepattern;

public class Engineer implements Employee {
	
	 protected String name;
	    protected long empId;
	    protected String department;
	 
	    public Engineer(long empId, String name, String department){
	        this.empId = empId;
	        this.name = name;
	        this.department = department;
	    }

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId+" ***** "+name+" ***** "+department);
		
	}
	

}
