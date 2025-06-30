package studentExam;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] students = { new Student("선남"), new Student("선녀") };

		for (Student student : students) {
			String name = student.getName();

			while (true) {
				System.out.printf("%s의 퀴즈 점수를 입력하라 : ", name);
				int quizScore = sc.nextInt();
				if (student.validateScore(quizScore)) {
					student.setQuizScore(quizScore);
					break;
				}
				System.out.println("퀴즈 점수가 0보다 작거나 100보다 크다.");
			}

			while (true) {
				System.out.printf("%s의 중간시험 점수를 입력하라 : ", name);
				int middleScore = sc.nextInt();
				if (student.validateScore(middleScore)) {
					student.setMiddleScore(middleScore);
					break;
				}
				System.out.println("중간시험 점수가 0보다 작거나 100보다 크다.");
			}

			while (true) {
				System.out.printf("%s의 기말시험 점수를 입력하라 : ", name);
				int finalScore = sc.nextInt();
				if (student.validateScore(finalScore)) {
					student.setFinalScore(finalScore);
					break;
				}
				System.out.println("기말시험 점수가 0보다 작거나 100보다 크다.");
			}

			System.out.printf("%s의 총점은 %.1f이고 학점은 %c이다.\n", name, student.getTotalScore(), student.getGrade());

		}

		sc.close();
	}

}
