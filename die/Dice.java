public class Dice {
	private Die dieOne;
	private Die dieTwo;

	public Dice(){
		dieOne = new Die();
		dieTwo = new Die();
	}

	public void rollDice(){
		dieOne.roll();
		dieTwo.roll();
	}

	public int getValue(){
		return dieOne.getValue()+ dieTwo.getValue();
	}

	public String toString(){
	return "First Die's Value = " + dieOne.getValue() + " and the second Die's value = " + dieTwo.getValue();
	}
}