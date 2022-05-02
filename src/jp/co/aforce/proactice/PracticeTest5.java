package jp.co.aforce.proactice;

import java.util.ArrayList;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");


		String animal = "猫";

		if(animals.contains(animal)) {
			System.out.println(animal + "はリストに含まれています");
		}else {
			System.out.println(animal + "はリストに含まれていません");
		}

		int birthday = 3;
		String syukuzitu;

		switch(birthday) {
		case 1:
			syukuzitu ="元日、成人の日";
			break;
		case 2:
			syukuzitu ="建国記念の日、天皇誕生日";
			break;
		case 3:
			syukuzitu = "春分の日";
			break;
		case 4:
			syukuzitu ="昭和の日";
			break;
		case 5:
			syukuzitu ="憲法記念日、みどりの日、こどもの日";
			break;
		case 6:
			syukuzitu ="なし";
			break;
		case 7:
			syukuzitu ="海の日、スポーツの日";
			break;
		case 8:
			syukuzitu ="山の日";
			break;
		case 9:
			syukuzitu ="敬老の日、秋分の日";
			break;
		case 10:
			syukuzitu ="なし";
			break;
		case 11:
			syukuzitu ="文化の日、勤労感謝の日";
			break;
		default:
			syukuzitu ="なし";
			break;
		}

		System.out.println(syukuzitu);

}
}
