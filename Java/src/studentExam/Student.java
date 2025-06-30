package studentExam;

public class Student {
	private String name;
	private int quizScore; // 퀴즈 점수
	private int middleScore; // 중간시험 점수
	private int finalScore; // 기말시험 점수

	// 생성자
	public Student(String name) {
		this.name = name;
	}

	// Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuizScore() {
		return quizScore;
	}

	public void setQuizScore(int quizScore) {
		this.quizScore = quizScore;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", quizScore=" + quizScore + ", middleScore=" + middleScore + ", finalScore="
				+ finalScore + "]";
	}

	// 점수 유효성검사
	public boolean validateScore(int score) {
		if (score < 0 || score > 100) {
			return false;
		}
		return true;
	}

	// 모든 시험 점수의 총점 계산
	public double getTotalScore() {
		return quizScore * 0.2 + middleScore * 0.3 + finalScore * 0.5;
	}

	public char getGrade() {
		double totalScore = getTotalScore();
		if (totalScore >= 90) {
			return 'A';
		} else if (totalScore >= 80) {
			return 'B';
		} else if (totalScore >= 70) {
			return 'C';
		} else if (totalScore >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
