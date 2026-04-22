package context;

public class TestContext {
	
	private String employeeFullName;
	private String employeeLastName;
	private String employeeFirstName;
	private String employeeId;
	
	public String getEmployeeName() {
		return employeeFullName;
	}
	
	public void setEmployeeName(String employeeName) {
		
		this.employeeFullName = employeeName;		
	}
	
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	
	public String employeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	

}
