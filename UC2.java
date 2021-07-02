package snakeLadderPrblm;

public class UC2 {
	int noOfPlayer=1;
	int positionOfPlayer1=0;
	
	public int roll_dice() {
		int die=(int) (Math.floor(Math.random()*100)%6)+1;
		return die;
	}
	public static void main(String[] args) {
		UC2 obj = new UC2();
		int die = obj.roll_dice();
		System.out.println(die);
	}
	
}
