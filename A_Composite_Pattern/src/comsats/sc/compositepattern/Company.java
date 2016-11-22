package comsats.sc.compositepattern;

public class Company {

	public static void main(String[] args) {
		Employee eng1 = new Engineer(100, "Mutahir", "Engineering");
		CompanyDirectory engDirectory = new CompanyDirectory();
		engDirectory.addEmployee(eng1);
		engDirectory.addEmployee(new SubEngineer(101, "Umar", "Engineering"));

		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(new Accountant(200, "Laiq", "Accounts"));
		accDirectory.addEmployee(new Accountant(201, "Zubair", "Accounts"));
		
		engDirectory.removeEmployee(eng1);

		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(engDirectory);
		directory.addEmployee(accDirectory);
		directory.showEmployeeDetails();

	}

}
