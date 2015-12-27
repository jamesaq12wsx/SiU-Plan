package templatemethod;

public class MainProgram {

	public static void main(String[] args) {
	    
		MasterStudentTemplate tom = new NetworkSubjectMasterStudent("Tom");
		tom.graduate();
		
		// TODO 1) write another class called "SoftwareEngineeringSubjectMasterStudent", 
		//         which extends MasterStudentTemplate.java (You may refer to "NetworkSubjectMasterStudent")
		//
		// TODO 2) Create an instance of SoftwareEngineeringSubjectMasterStudent called Mary,
		//         and then call its graduate() method below.
		
		MasterStudentTemplate mary = new SoftwareEngineeringSubjectMasterStudent("Mary");
		mary.graduate();
        
	}

}
