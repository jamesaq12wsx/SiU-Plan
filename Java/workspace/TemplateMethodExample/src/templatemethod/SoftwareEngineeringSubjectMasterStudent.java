package templatemethod;

public class SoftwareEngineeringSubjectMasterStudent extends MasterStudentTemplate {

	public SoftwareEngineeringSubjectMasterStudent(String name) {
		super(name);
	}

	@Override
	protected void readPaper() {
		System.out.println(getName() + " first read software engineering papers");
	}

	@Override
	protected void identifyContextAndProblem() {
		System.out.println(getName() + " find a software engineering performance problem");
	}

	@Override
	protected void findSolution() {
		System.out.println(getName() + " enhance performance by an algorithm");
	}

	@Override
	protected void evaluateSolution() {
		System.out
				.println("Based on the evaluation, " + getName() + " observed that the performance has been improved");
	}

}
