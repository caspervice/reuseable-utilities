/**
 * 
 */
package test;

import emailformatting.EmailFormatContainer;
import emailformatting.UtilityFormatter;

/**
 * @author aramide
 *
 */
public class EmailFormattingTest {

	/**
	 * 
	 */
	public EmailFormattingTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Char Trimme...");
		
		final String fullEmailAddress = "aramide_s@hotmail.co.uk";
		
		final UtilityFormatter formatter = new UtilityFormatter(fullEmailAddress);
		
		
		final EmailFormatContainer emailContainer = new EmailFormatContainer(fullEmailAddress);

		obtainCharEmailSymbolPos(emailContainer);
		
		formattedEmail = emailContainer.getNewEmail();
		
		System.out.println("The final email formatted: " + formattedEmail);
		
	}

	private static String formattedEmail;
	
	private static void obtainCharEmailSymbolPos(final EmailFormatContainer container){
		
		int maxPos = 0;
		
		//fill with symbol we would like to check for...
		final char emailSymbol = 64;
		
		final String rawEmail = "aramide_s@hotmail.co.uk";
		
		final StringBuilder emailCharAt = new StringBuilder(rawEmail);
		
		for (int index = 0; index < emailCharAt.length(); index++){
			
			final char charAt = emailCharAt.charAt(index);
			
			System.out.println("Entry at pos " + index + " : " + charAt);
			
			/**
			 * Identify position where symbol begins at.
			 */
			if (charAt == emailSymbol){
				System.out.println("Symbol " + charAt + " matched at " + index);
				
				//hold position
				maxPos = index;
				
			}
			
		}
		
		/**
		 * Trim email.
		 */
		final String finalEmail = emailCharAt.substring(0, maxPos);
		
		System.out.println("Username: " + finalEmail.toString());
		
		/**
		 * Set new email.
		 */
		container.setNewEmail(finalEmail);
		
	}
	
	private static void identifyCharSymbol(){
		
		char anySymbol = 0;
		
		for (int i = 0; i < 100; i++){
			
			anySymbol = (char) i;
						
			System.out.println("Char at pos: " + i + " = " + anySymbol);

			if (anySymbol == 64){
				
				System.out.println("\n\nMatching Email Symbol Detected...");
				
			}
			
		}

		
	}

}
