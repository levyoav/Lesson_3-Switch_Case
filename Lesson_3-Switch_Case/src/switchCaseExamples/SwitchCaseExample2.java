package switchCaseExamples;

public class SwitchCaseExample2 {

	public static void main(String[] args) {

		int day = (int) (Math.random() * 7) + 3;
		System.out.println(day);

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			//If the case is a value between 1-5, than this block is done.
			System.out.println("Week day");
			break;
		case 6:
		case 7:
			//If the case is either 6 or 7, than this block is done.
			System.out.println("Week end");
			break;
		default:
			System.err.println(day + " is not a day");
		}
	}

}
