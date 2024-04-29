package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		  System.out.print("인원 수 : " ); 
		  int person = sc.nextInt();
		  System.out.print("사탕 개수 : "); 
		  int candy = sc.nextInt();
		  
		  System.out.println("1인당 사탕 개수 : " + candy / person);
		  System.out.println("남는 사탕 개수 : " + candy % person);
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : "); 
		String name = sc.next();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		// 3학년 4반 15번 홍길동 남학생의 성적은 85.75점 입니다.
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.\n",grade,classroom,number,name,gender,score);

	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int Num1 = sc.nextInt();
		
		String str2 = "짝수 입니다.";
		String str3 = "홀수 입니다.";
		
		
		String result = Num1 % 2 == 0 ? str2 : str3;
		System.out.println(result);
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int numA = sc.nextInt();
		
		System.out.print("영어 : ");
		int numB = sc.nextInt();
		
		System.out.print("수학 : ");
		int numC = sc.nextInt();
		
		int sum = numA + numB + numC; 
		System.out.println("합계 : " + sum);//합계
		
		double avg = sum / 3.0;
		System.out.printf("평균 : %.1f\n" , avg);
		
		boolean result = (numA >= 40) && (numB >= 40) && (numC >= 40) && (avg >= 60);
		System.out.println(result ? "합격" : "불합격");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
