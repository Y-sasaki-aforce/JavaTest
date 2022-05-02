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
			System.out.println(animal + "はリストに含まれていいません");
		}

		int birthday = 3;
		String syukuzitu;

		switch(birthday) {
		case 1:
			syukuzitu ="1月：元日、成人の日";
			break;
		case 2:
			syukuzitu ="2月：建国記念の日、天皇誕生日";
			break;
		case 3:
			syukuzitu = "3月：春分の日";
			break;
		case 4:
			syukuzitu ="4月：昭和の日";
			break;
		case 5:
			syukuzitu ="5月：憲法記念日、みどりの日、こどもの日";
			break;
		case 6:
			syukuzitu ="6月：（なし）";
			break;
		case 7:
			syukuzitu ="7月：海の日、スポーツの日";
			break;
		case 8:
			syukuzitu ="8月：山の日";
			break;
		case 9:
			syukuzitu ="9月：敬老の日、秋分の日";
			break;
		case 10:
			syukuzitu ="10月：（なし）";
			break;
		case 11:
			syukuzitu ="11月：文化の日、勤労感謝の日";
			break;
		default:
			syukuzitu ="12月：（なし）";
			break;
		}

		System.out.println(syukuzitu);

}
}
