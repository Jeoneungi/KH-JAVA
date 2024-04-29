package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

	// 3행 3열짜리 문자열 배열을 선언 및 할당하고
	// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여
	// "(0,0)"과 같은 형식으로 저장 후 출력하세요.



	public void practice1() {

		String[][] arr = new String[3][3];

		for(int row = 0; row < arr.length; row++) {

			for(int col = 0; col < arr[row].length; col++) {

				arr[row][col] = "(" + row + "," + col + ")";

				System.out.print(arr[row][col]);
			}
			System.out.println();
		}




	}

	public void practice2() {

		// 4행 4열짜리 정수형 배열을 선언 및 할당 하고
		//		1) 16 ~ 1과 같이 값을 저장하세요.
		//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];

		int num = 1;
		for(int row = 0; row < arr.length; row++) { // 행 반복

			for(int col = 0; col < arr[row].length; col++) { // 열 반복

				arr[row][col] = num++;

				System.out.printf("%3d",arr[row][col]);
			}
			System.out.println();
		}
	}

	public void practice3() {

		// 4행 4열짜리 정수형 배열을 선언 및 할당 하고
		//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];

		int num = 16;
		for(int row = 0; row < arr.length; row++) { // 행 반복

			for(int col = 0; col < arr[row].length; col++) { // 열 반복

				arr[row][col] = num--;

				System.out.printf("%3d",arr[row][col]);
			}
			System.out.println();
		}

	}


	public void practice4() {

		// 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의
		// 정수 값 저장 후 아래의 내용처럼 처리하세요.

		//		int[][] arr = new int[4][4];
		//
		//		
		//		int rowTwo = arr.length - 1; 
		//		int colTwo = arr[0].length - 1;  
		//
		//		for(int row = 0; row < arr.length; row++) {
		//
		//			for(int col = 0; col < arr[row].length; col++) {
		//
		//				
		//				if(row != rowTwo && col != colTwo) {
		//					
		//					arr[row][col]= (int)(Math.random() * 10 + 1  );
		//					
		//					
		//					arr[row][colTwo] += arr[row][col];
		//					arr[rowTwo][colTwo] += arr[row][col];
		//					arr[rowTwo][col] += arr[row][col];
		//					
		//					}
		//
		//				System.out.printf("%3d",arr[row][col]);
		//				
		//				
		//			}
		//			System.out.println();
		//		}


		// 강사님 풀이


		int[][] arr = new int[4][4];

		// 상수 사용법 : 변하지 않는 특정 값에 이름을 붙여줌

		final int ROW_LAST_INDEX = arr.length - 1; // 행 마지막 인덱스 
		final int COL_LAST_INDEX = arr[0].length - 1; // 열 마지막 인덱스 

		for(int row = 0; row < arr.length; row++) {
			// 행의 길이
			for(int col = 0; col < arr[row].length; col++) {
				// row번째 행의 열의 길이 

				// 마지막 행, 마지막 열이 아닌 경우
				if(row != ROW_LAST_INDEX && col != COL_LAST_INDEX) {

					arr[row][col]= (int)(Math.random() * 10 + 1  ); // 1 ~ 10 난수


					// 각 행의 마지막 열에 난수를 누적 
					arr[row][COL_LAST_INDEX] += arr[row][col];

					// 각 열의 마지막 행에 난수를 누적 
					arr[ROW_LAST_INDEX][col] += arr[row][col];

					// 생선된 모든 난수를 마지막 행, 마지막 열에 누적  
					arr[ROW_LAST_INDEX][COL_LAST_INDEX]+= arr[row][col] ;
				}

				System.out.printf("%4d",arr[row][col]);
			}	// 안쪽 for문 끝 == 열 반복 끝 

			System.out.println(); // 줄 바꿈 
		}

	}


	public void practice5() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("행 크기 : ");
			int row = sc.nextInt();

			System.out.print("열 크기 : ");
			int col = sc.nextInt();


			if(row < 1 || row > 10){
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			} else if(col < 1 || col > 10) {
				System.out.print("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");

			} else {

				char[][] arr = new char[row][col];

				for(int i = 0; i < row; i++) {

					for(int j =0; j < col; j++) {

						arr[i][j]= (char)(Math.random() * 26 + 65);

						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;

			}

		}

	}

	public void practice6() {

		//사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아 
		//		문자형 가변 배열을 선언 및 할당하세요.
		//		그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 눌러 저장하고 출력하세요.



		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");

		int input = sc.nextInt();

		char[][] arr = new char[input][];

		char ch = 'a';

		for(int row = 0; row < arr.length; row++) {
			System.out.print(row + "열의 크기 : ");
			int input2 = sc.nextInt();

			arr[row] = new char[input2];

		}

		//출력용 for문
		for(int i = 0; i< arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

	public void practice7() {


		String[] students = {"강건강", "남나나","도대담","류라라", "문미미","박보배"
				,"송성실","윤예의","진재주","차천축","피풍표","홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0; // students 배열에서 0부터 1씩 증가하며 학생들을 선택하는 용도의 변수



		System.out.println("== 1분단 ==");

		for(int row = 0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[row].length; col++) {

				arr1[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입 

				System.out.print(arr1[row][col]+ " ");
			}
			System.out.println();
		}


		System.out.println("== 2분단 ==");

		for(int row = 0; row < arr2.length; row++) {
			for(int col = 0; col < arr2[row].length; col++) {

				arr2[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입 

				System.out.print(arr2[row][col]+ " ");
			}
			System.out.println();
		}



	}

	public void practice8() {
		String[] students = {"강건강", "남나나","도대담","류라라", "문미미","박보배"
				,"송성실","윤예의","진재주","차천축","피풍표","홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		int index = 0; // students 배열에서 0부터 1씩 증가하며 학생들을 선택하는 용도의 변수


		System.out.println("== 1분단 ==");

		for(int row = 0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[row].length; col++) {

				arr1[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입 

				System.out.print(arr1[row][col]+ " ");
			}
			System.out.println();
		}


		System.out.println("== 2분단 ==");

		for(int row = 0; row < arr2.length; row++) {
			for(int col = 0; col < arr2[row].length; col++) {

				arr2[row][col] = students[index++];
				// students 배열 index번째 학생을 arr1[row][col]에 대입 

				System.out.print(arr2[row][col]+ " ");
			}
			System.out.println();
		}

		System.out.println("============================================");

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		int line = 0; 
		int section = 0;
		String way = "";

		for(int row =0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[row].length; col++) {
				if(arr1[row][col].equals(name)) {
					line = row+ 1;
					section = 1;
					way = col == 0 ? "왼쪽" : "오른쪽" ;


				} else if (arr2[row][col].equals(name)) {
					line = row+1;
					section = 2;
					way = col == 0 ? "왼쪽" : "오른쪽" ;
				}
			}
		}
		if(section == 0) {
			System.out.println("검색 결과가 없습니다.");

		} else {
			System.out.println("검색하신 "+ name + " 학생은 " + section + "분단 " + line + 
					"번째 줄 "+ way +" 에 있습니다 ");
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[6][6];

		System.out.print("행 인덱스 입력 : ");
		int rowindex = sc.nextInt();

		System.out.print("열 인덱스 입력 : ");
		int colindex = sc.nextInt();

		for(int row =0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {

				if(row == 0 && col != 0) {

					arr[row][col] = col - 1 + " " ;

				} else if (col == 0 && row != 0) {

					arr[row][col] = row - 1 + " ";
				} else {

					arr[row][col] = "  ";

				}

				arr[rowindex+1][colindex+1] = "X";
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}



	}
	public void practice10() {

		//		Scanner sc = new Scanner(System.in);
		//
		//		String[][] arr = new String[6][6];

		//		while(true) {
		//
		//			System.out.print("행 인덱스 입력 : ");
		//			int rowindex = sc.nextInt();
		//
		//			
		//			if(rowindex == 99) {
		//				System.out.println("프로그램 종료");
		//				break;
		//				
		//			} else {
		//				System.out.print("열 인덱스 입력 : ");
		//				int colindex = sc.nextInt();
		//				
		//				for(int row =0; row < arr.length; row++) {
		//					
		//					for(int col = 0; col < arr[row].length; col++) {
		//
		//						if(row == 0 && col != 0) {
		//
		//							arr[row][col] = col - 1 + " " ;
		//
		//						} else if (col == 0 && row != 0) {
		//
		//							arr[row][col] = row - 1 + " ";
		//							
		//						} else {
		//							
		//							if(arr[row][col] == "X") {
		//								
		//							} else {
		//								
		//								arr[row][col] = "  ";
		//							}
		//
		//						}
		//						arr[rowindex + 1][colindex + 1] = "X";
		//						
		//						System.out.print(arr[row][col]);
		//					}
		//					System.out.println();
		//				}
		//			}
		//		}

		// 강사님 풀이 


		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[6][6];

		// 기본 모양 만들기
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {

				if(row == 0 && col != 0) {
					arr[row][col] = col-1 + " ";
				} else if(row != 0 && col == 0) {
					arr[row][col] = row-1 + " ";
				} else {
					arr[row][col] = "  ";
				}
				System.out.println();
			}
		}

		System.out.print("행 인덱스 입력 : ");
		int rowIndex = sc.nextInt();

		while(true) {

			if(rowIndex == 99) {
				System.out.println("프로그램 종료");
				break;
			}

			System.out.print("열 인덱스 입력 : ");
			int colIndex = sc.nextInt();

			arr[rowIndex+1][colIndex+1] = "X ";

			// 출력용 for문

			for(int row=0; row<arr.length; row++) {
				for(int col=0; col<arr[row].length; col++) {

					System.out.print(arr[row][col]);
				}
				System.out.println(); // 줄바꿈
			}

			System.out.print("\n행 인덱스 입력 >> ");
			rowIndex = sc.nextInt();

		}

	}


	public void bingoGame() { 

		Scanner sc = new Scanner(System.in);

		System.out.print("빙고판 크기 지정 : ");
		int bingo = sc.nextInt();
		sc.nextLine();

		//1차원 배열로 빙고판에 입력될 값 생성 + 중복제거

		int[] Arr = new int[ bingo * bingo ]; // 1차원 배열 생성

		// bingo * bingo --> 빙고판의 크기는 가로, 세로의 곱 만큼 공간이 필요함 

		// 중복값 제거하면서 랜덤값 집어넣기

		for(int i = 0; i < Arr.length; i++) {
			Arr[i] = (int)(Math.random()*(bingo*bingo)) + 1;

			for(int k = 0; k<i; k++) {
				if(Arr[i] == Arr[k]) {
					i--;
					break;
				}
			}
		}

		String[][] bingopan = new String[bingo][bingo];

		int index = 0; // 1차원 배열 인덱스 지정을 위한 변수 

		for(int i = 0; i < bingo; i++) {
			for(int k = 0; k < bingo; k++) {

				bingopan[i][k]= Arr[index++] + ""; // 숫자 + 문자 => 문자열 
			}
		}
		// --------------------------------------------------------------------

		// 랜덤 배치된 빙고판 출력


		for(int i = 0; i < bingopan.length; i++) {
			for(int j = 0; j < bingopan[i].length; j++) {
				System.out.printf("%4s", bingopan[i][j]);
			}
			System.out.println();
		}

		System.out.println("==============빙고게임 시작=============");


		while( true) {

			System.out.print("정수를 입력하시오 : ");
			String num = sc.nextLine();

			boolean flag = true; // 검색된 값이 빙고판에 있는지 확인하기 위한 변수 

			for(int row = 0; row < bingopan.length; row++) {
				for(int col = 0; col <bingopan[row].length; col++) {

					// 입력된 값과 일치하는 곳을 ★로 변환 

					if(bingopan[row][col].equals(num)) {
						bingopan[row][col] = "★";
						flag = false;

					}
					System.out.printf("%4s", bingopan[row][col]);
				}

				System.out.println();

			}

			if( flag ) {
				System.out.println("다시 입력해주세요.");
			}

			// 빙고판 크기에 따라
			// 빙고 기준이 되는 문자열 생성
			// ex) 5 * 5 크기 빙고 -> 한 줄이 "★★★★★" 이면 빙고 

			String bingoLine = "";
			for(int i = 0; i < bingo; i++) {
				bingoLine += "★";
			}

			// 빙고 검사 

			int bingocount = 0; // 빙고 수를 저장할 변수 

			// 가로(행) 또는 세로(열)의 문자를 더하여 하나의 문자열로 저장 
			//  --> 저장된 문자열의 모양이 "★★★★★" 인 경우 == 빙고 
			//  --> bingocount 증가




			for(int i = 0; i < bingopan.length; i++) {
				// 매 반복 시 마다 row, col을 빈 문자열로 초기화 
				// -> 바깥쪽 for문이 반복될때 마다 검사하는 행과 열이 이동하므로
				//    빙고 여부를 검사하기 위한 row, col을 빈 문자열로 초기화 해야함

				String row = "";

				String col = "";

				for(int j=0; j < bingopan[i].length; j++) { 

					row += bingopan[i][j]; // 현재 행의 문자를 모두 더함 

					col += bingopan[j][i]; // 현재 열의 문자를 모두 더함 

					if(row.equals(bingoLine)) { // 가로 빙고가 존재할 경우
						bingocount++;

					}
					if(col.equals(bingoLine)) { // 세로 빙고가 존재할 경우 
						bingocount++;

					}

				}
				// 대각선 빙고 여부 
				// 대각선 : diagonal (다이애그널)

				//대각선 빙고판에 두개만 존재
				// --> 대각선 문자를 더해서 저장할 변수 두개 선언 및 반문자열로 초기화 
			}

			String dia1 = "";

			String dia2 = "";


			// 대각선 for문 하나로 가능

			for(int i = 0; i < bingopan.length; i++ ) {

				dia1 += bingopan[i][i]; // 좌상 우하

				dia2 += bingopan[i][bingopan.length - i - 1]; // 우상 좌하 

			}

			if(dia1.equals(bingoLine)) {
				bingocount++;
			}
			if(dia2.equals(bingoLine)) { 
				bingocount++;
			}

			System.out.println("현재" + bingocount + "빙고");

			if(bingocount >= 3) {
				System.out.println("***** BINGO !!! *****");
				break;
			}

		} // while문 종료


	}

}


