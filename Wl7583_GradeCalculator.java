public class Wl7583_GradeCalculator {
	
	private int exam1;
	private int exam2;
	private int exam3;
	private int totalHWScore;
	private int totalQuizScore;
	
	public Wl7583_GradeCalculator(int exam1, int exam2, int exam3, int totalHWScore, int totalQuizScore) {
		if (exam1 < 0 || exam2 < 0 || exam3 < 0 || totalHWScore < 0 || totalQuizScore < 0 || exam1 > 100 || exam2 > 100 || exam3 > 100 || totalHWScore > 100 || totalQuizScore >  100) {
			System.out.println("One or more scores is/are invalid.");
		}
		else {
			this.exam1 = exam1;
			this.exam2 = exam2;
			this.exam3 = exam3;
			this.totalHWScore = totalHWScore;
			this.totalQuizScore = totalQuizScore;
		}
	}
	
	public void calculateGrade() {
		double grade;
		grade = exam1 * 0.25 + exam2 * 0.25 + exam3 * 0.25 + totalHWScore * 0.10 + totalQuizScore * 0.15;
		String letterGrade;
		if (grade > 90) { letterGrade = "A"; }
		else if (grade > 80) { letterGrade = "B"; }
		else if (grade > 70) { letterGrade = "C"; }
		else if (grade > 60) { letterGrade = "D"; }
		else { letterGrade = "F"; }
		System.out.println(letterGrade);
	}
}