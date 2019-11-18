public static String reverse (String text){
		x = (text.length() - 1);
		String reversed = text;
		while (x >= 0){
			reversed = reversed + text.charAt(x));
			x--;
		}
		text = reversed;
		return text;
	}