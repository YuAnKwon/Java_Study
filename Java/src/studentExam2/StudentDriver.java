package studentExam2;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student student1 = new Student("선남");
		Student student2 = new Student("선녀");

		
		while(true) {
			System.out.println(student1.getName() + "의 퀴즈 점수를 입력하라 : ");
			if(student1.setQuizScore(sc.nextInt())){
				break;
			}
		}
		
		System.out.println(student1.getName() + "의 중간시험 점수를 입력하라 : ");
		student1.setMiddleScore(sc.nextInt());
		System.out.println(student1.getName() + "의 기말시험 점수를 입력하라 : ");
		student1.setFinalScore(sc.nextInt());

		System.out.println(
				student1.getName() + "의 총점은" + student1.getTotalScore() + "이고 학점은" + student1.getGrade() + "이다.");
		sc.close();
	}
}
