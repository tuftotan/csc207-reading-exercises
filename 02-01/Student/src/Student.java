
public class Student {


	private String firstName;
	private String lastName;
	private int id;
	private int age;
	
	/**
	* Stores each private field into a returnable value.
	*
	* @param firstName, lastName, id, age, the base fields.
	* @return Each field currently private.
	*/
	
    public String getfirstName() {
    	return this.firstName;
    }
    public String getlastName() {
    	return this.lastName;
    }
    public int getid() {
    	return this.id;
    }
    public int getage() {
    	return this.age;
    }
	
	/**
	* Allows each private field to be shown publicly without modifying.
	*
	* @param private values, see above
	*/
	
	
	public Student (String fName, String lName, int idnum, int currentage) {
		this.firstName = fName;
		this.lastName = lName;
		this.id = idnum;
		this.age = currentage;
	}
}
	

