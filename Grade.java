package grade;

import java.util.function.BooleanSupplier;

public class Grade {
	
	int LabGrade = 0;
	float ExamGrade = 0;
	
	public Grade(int LabGrade, float ExamGrade) {
		
		this.LabGrade = LabGrade;
		this.ExamGrade = ExamGrade;
		
	}
	
	public Integer getvalue() {
		int finalGrade = GetBruteGrade();
		if (finalGrade <18)
		   return null;
		if (finalGrade > 30)
			return 30;
		Conditions(finalGrade);
	    return finalGrade;
	}

	private int Conditions(int finalGrade) {
		if (LabGrade < 25)
			return (int) Math.floor(finalGrade);
		if (LabGrade > 25 && LabGrade < 40)
			return (int) Math.round(finalGrade);
		if (LabGrade > 40)
			return (int) Math.ceil(finalGrade);
		return finalGrade;
	}
	
	


	private int GetBruteGrade() {
		int ExceedingLabPoints = LabGrade > 50 ? LabGrade - 50 : 0;
		float ExceedingPoints = ExceedingLabPoints / 5.0f;
		float FinalGradeLabPoints = ((LabGrade - ExceedingPoints)*15)/50;
		float FinalExamGrade = (((ExamGrade + ExceedingPoints)*15))/10;
		int finalGrade = (int)(FinalGradeLabPoints + FinalExamGrade);
		return finalGrade;
	}

	public boolean isApproved() {
		return GetBruteGrade() >= 18;
	}

	public boolean isCumLaude() {
		return GetBruteGrade() > 30;
	}

}
