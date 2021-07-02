package snakeLadderPrblm;

public class UC4 {
	static final int noOfPlayer = 1;

	public int roll_dice() {
		int die = (int) (Math.floor(Math.random() * 100) % 6) + 1;
		return die;
	}

	public int roll_dice_option() {
		int option = (int) Math.floor(Math.random() * 100) % 3;
		return option;
	}

	public static void main(String[] args) {
		int positionOfPlayer1 = 0;
		UC4 obj = new UC4();
		while (positionOfPlayer1 < 100) {
			int option = obj.roll_dice_option();
			if (option == 0) {
				System.out.println("No Play");
			} else {
				int die = obj.roll_dice();
				if (option == 1) {
					System.out.println("got ladder");
					positionOfPlayer1 += die;
					System.out.println(positionOfPlayer1);
				} else {
					System.out.println("got snake");
					positionOfPlayer1 -= die;
					if (positionOfPlayer1 < 0) {
						positionOfPlayer1 = 0;
					}
					System.out.println(positionOfPlayer1);
				}
			}
		}
	}
}
