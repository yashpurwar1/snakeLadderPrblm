package snakeLadderPrblm;

public class UC7 {

	public int roll_dice() {
		int die = (int) (Math.floor(Math.random() * 100) % 6) + 1;
		return die;
	}

	public int roll_dice_option() {
		int option = (int) Math.floor(Math.random() * 100) % 3;
		return option;
	}

	public static void main(String[] args) {
		int positionOfPlayer1 = 0, counter = 0;
		int positionOfPlayer2 = 0;
		int option;
		UC7 obj = new UC7();

		while (positionOfPlayer1 < 100 && positionOfPlayer2 < 100) {
			System.out.println("User 1 chance");
			option = obj.roll_dice_option();
			counter += 1;
			if (option == 0) {
				System.out.println("No Play");
			} else {
				int die = obj.roll_dice();
				if (option == 1) {
					System.out.println("got ladder");
					if (positionOfPlayer1 + die <= 100) {
						positionOfPlayer1 += die;
					}
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

			option = obj.roll_dice_option();
			System.out.println("User 2 chance");
			if (option == 0) {
				System.out.println("No Play");
			} else {
				int die = obj.roll_dice();
				if (option == 1) {
					System.out.println("got ladder");
					if (positionOfPlayer2 + die <= 100) {
						positionOfPlayer2 += die;
					}
					System.out.println(positionOfPlayer2);
				} else {
					System.out.println("got snake");
					positionOfPlayer2 -= die;
					if (positionOfPlayer2 < 0) {
						positionOfPlayer2 = 0;
					}
					System.out.println(positionOfPlayer2);
				}
			}
		}
		if (positionOfPlayer1 == 100) {
			System.out.println("Player 1 won while position of second is" +positionOfPlayer2);
		} else {
			System.out.println("Player 2 won while position of player 1 is "+positionOfPlayer1);
		}
		System.out.println("Number of chances played are "+counter);
	}
}
