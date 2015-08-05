
public class StringReplaceChar {

	// Iterate through the String, one character at a time
	public static String removeAllInstanceChar(String input, char removeChar) {

		if (input == null) {
			return input;
		}

		StringBuilder sb = new StringBuilder(input);

		for (int i = 0; i < sb.length(); i++) {

			char currentChar = sb.charAt(i);

			if (currentChar == removeChar) {
				sb.deleteCharAt(i);
			}

		}

		return sb.toString();

	}

	// Find a method in the String class that can solve this in one line

	public static String removeAllInstanceInOneLine(String input,
			String removeChar) {

		if (input == null) {
			return input;
		}

		String replacedString = input.replaceAll(removeChar, "");

		return replacedString;

	}

}
