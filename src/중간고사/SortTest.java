package �߰����;

public class SortTest {
	public static void main(String[] args) {

		String name[] = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
	            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
	            "Aaron", "Kate"};

		int score[] = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
	            343, 317, 265};

		for (int i =0; i <16 ; i++ ){  // �������� i < 5 �̰��� i < 4�� �־�� �Ѵ� j �� i+1�̱⶧���� 5�� �ʰ��ϹǷ�...

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


