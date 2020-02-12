public class Dice {
	private Die dieOne;
	private Die dieTwo;

	public Dice(){
		Die dieOne = new Die();
		Die diewTwo = new Die();
	}

	public void rollDice(){
		dieOne.roll();
		dieTwo.roll();
	}

	public int getValue(){
		return dieOne.getValue()+dieTwo.getValue;
	}

	public String toString(){
	return " ";
	}
}