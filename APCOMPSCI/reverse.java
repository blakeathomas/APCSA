public class reverse{

		private String reversed = "";
		private String text;
		private int x = 0;

		public String reverse (String text){
		x = (text.length() - 1);
		while (x >= 0){
			reversed = reversed + text.charAt(x);
			x--;
		}
		text = reversed;
		return reversed;
	}
}
