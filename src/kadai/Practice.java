package kadai;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		
		
	    	//HelloWorldを変数に代入して表示する
			helloWorld();

			//1から10までを足した値を表示
			sum();

			//3年後の今日は何曜日？
			date();

			//引数が0なら偽。引数が1なら真と表示
			trueFalse();

			//String型のListを作成して表示
			colortList();

		    //String型のMapを作成して表示
			station();
			
	}
		
		//HelloWorldを変数に代入して表示
		private static void helloWorld() {
			String greeting = "Hello World";
			System.out.println(greeting);
		}

		//1から10までを足した値を計算して表示する
		private static void sum() {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			System.out.println(sum);
		}

		//3年後の今日は何曜日？
		private static void date() {
			LocalDateTime day = LocalDateTime.now();
			System.out.println(day.plusYears(3).getDayOfWeek());
		}

		//引数が0なら偽、1なら真と表示
		private static void trueFalse() {
			int x = 0;
			if (x == 1) {
				System.out.println("真");
			} else if (x == 0) {
				System.out.println("偽");
			} else {
				System.out.println("0 or 1");
			}
		}

		//String型のListを作成して表示
		private static void colortList() {
			List<String> list = new ArrayList<>();
			list.add("赤色");
			list.add("黄色");
			list.add("緑色");
			list.add("青色");
			
			for (String c : list) {
				System.out.println("好きな色は" + c + "です");
			}
		}


		//String型のMapを作成して表示する
			private static void station() {
				Map<String, String> map = new HashMap< String, String>();
				map.put("赤井", "大阪駅");
				map.put("宮崎", "新今宮駅");
				map.put("木岡", "天王寺駅");
				
			//降順でソート
				List<Entry<String, String>> list_entries = new ArrayList<Entry<String, String>>(map.entrySet());
				
				for (Entry<String, String> entry : list_entries){
					System.out.println(entry.getKey() + "さんの最寄駅は" + entry.getValue() + "です。" );		
				}
			}
}
			

