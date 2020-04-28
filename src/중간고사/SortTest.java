package 중간고사;

public class SortTest {
	public static void main(String[] args) {

		String name[] = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
	            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
	            "Aaron", "Kate"};

		int score[] = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
	            343, 317, 265};

		for (int i =0; i <16 ; i++ ){  // 최종값에 i < 5 이것은 i < 4를 주어야 한다 j 에 i+1이기때문에 5를 초과하므로...

			for (int j = i+1; j <16 ; j++ ){

				if (score[j] > score[i]){



					int temp = score[i];

					score[i] = score[j];

					score[j] = temp;



					String str = name[i];

					name[i] = name[j];

					name[j] = str;

				}

			}

		}

		for (int i =0; i < 16 ; i++ ){

			System.out.println(name[i]+ " " + score[i] + " ");

		}



	}

}


