package grade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestGradeCalculator {

	@Test
	void FullGrade() {
		Grade grade = GradeCalculator.calculateGrade(50, 10.0f);
				assertEquals(30, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
	
	@Test
	void FullExamGradeAndGoodLabGrade() {
		Grade grade = GradeCalculator.calculateGrade(40, 10.0f);
				assertEquals(27, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}

	@Test
	void FullLabGradeAndGoodExamGrade() {
		Grade grade = GradeCalculator.calculateGrade(50, 8.0f);
				assertEquals(27, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
	
	@Test
	void NotPassingGrade() {
		Grade grade = GradeCalculator.calculateGrade(25, 5.0f);
				assertNull(grade.getvalue());
				assertFalse(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
	
	@Test
	void LabPointExceedingFifty() {
		Grade grade = GradeCalculator.calculateGrade(55, 7.0f);
				assertEquals(28, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
	
	@Test
	void CumLaude() {
		Grade grade = GradeCalculator.calculateGrade(61, 9.0f);
				assertEquals(30, grade.getvalue());
				assertTrue(grade.isApproved());
				assertTrue(grade.isCumLaude());
				}
	
	@Test
	void RoundDownGrade() {
		Grade grade = GradeCalculator.calculateGrade(24, 8.0f);
				assertEquals(19, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
	@Test
	void NormalRoundGrade() {
		Grade grade = GradeCalculator.calculateGrade(39, 10.0f);
				assertEquals(26, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
	@Test
	void RoundUpGrade() {
		Grade grade = GradeCalculator.calculateGrade(45, 9.0f);
				assertEquals(27, grade.getvalue());
				assertTrue(grade.isApproved());
				assertFalse(grade.isCumLaude());
	}
}
