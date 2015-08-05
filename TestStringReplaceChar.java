import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestStringReplaceChar {

	StringReplaceChar stringReplaceChar = new StringReplaceChar();

	@Test(dataProvider = "test1")
	public void testRemoveAllInstanceChar(String input, char charRemove,
			String expectedOutput) {

		Assert.assertEquals(expectedOutput,
				StringReplaceChar.removeAllInstanceChar(input, charRemove));

	}

	@Test(dataProvider = "test2")
	public void testRemoveAllInstanceInOneLine(String input, String charRemove,
			String expectedOutput) {

		Assert.assertEquals(expectedOutput,
				StringReplaceChar.removeAllInstanceInOneLine(input, charRemove));

	}

	// In below data provider, 1st element as input string, 2nd element is the
	// character needs to be removed, 3rd one expected result

	// Test cases covered
	/*
	 * Give valid string and remove any char Give alphanumeric string and remove
	 * character digit Give string as input and try to remove empty character
	 * Give the null string and try to remove character. Give the empty string
	 * and try to remove the character. Give very long string and try to remove
	 * the character.
	 */
	@DataProvider(name = "test1")
	public static Object[][] RemoveAllInstanceChar() {
		return new Object[][] {
				{ "santhosh", 's', "anthoh" },
				{ "kshitij", 'i', "kshtj" },
				{ "kshitij", '\0', "kshitij" },
				{ null, '8', null },
				{ "kshitij8", '8', "kshitij" },
				{ "", '8', "" },
				{ "jagadevisanthoshkumarbiradar", 'a', "jgdevisnthoshkumrbirdr" } };
	}

	@DataProvider(name = "test2")
	public static Object[][] RemoveAllInstanceCharInOneLine() {
		return new Object[][] {
				{ "santhosh", "s", "anthoh" },
				{ "kshitij", "i", "kshtj" },
				{ "kshitij", "\0", "kshitij" },
				{ null, "8", null },
				{ "kshitij8", "8", "kshitij" },
				{ "", "8", "" },
				{ "jagadevisanthoshkumarbiradar", "a", "jgdevisnthoshkumrbirdr" } };
	}

}
