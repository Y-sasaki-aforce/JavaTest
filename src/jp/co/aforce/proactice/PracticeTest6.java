package jp.co.aforce.proactice;

import java.util.Random;

public class PracticeTest6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①

		Random random = new Random();
		int randomValue = random.nextInt(5);

		int fortune = randomValue;

		switch(fortune) {
		case 1:
			System.out.println("吉です");
		break;
		case 2:
			System.out.println("中吉です");
		break;
		case 3:
			System.out.println("中吉です");
		break;
		default:
			System.out.println("凶です");
		}

		//練習問題②
		int j;
		j=0;

		for(int i =1; i<=100; i++) {
			if((i%7)==0) {
				j += i;
			}
		}
		System.out.println(j);


		//練習問題③
		for(int k = 1; k<=9; k++) {
			for(int l = 1; l<=9; l++) {
				System.out.println(""+k*l);
			}
			System.out.println();
		}
	}

}
