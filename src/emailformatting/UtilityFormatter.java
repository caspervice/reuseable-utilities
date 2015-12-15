/**
 * 
 */
package emailformatting;

/**
 * @author aramide
 *
 */
public class UtilityFormatter {


	//Will hold the trimmed username (without email section attached)/
	private String desiredUsername;

	//hold passed email to trim...
	private String emailToTrim;

	//hold position '@' was located.
	private int emailSymbolPos;

	//holds username and email domain of name of trim/substring
	private StringBuilder emailUsernameToSubstring;

	public UtilityFormatter(final String fullEmailAddress){
		this.emailToTrim = fullEmailAddress;
	}

	//loops through provided email, obtains
	private void locateEmailStart(){
		final StringBuilder rawEmail = new StringBuilder(this.emailToTrim);
		final String emailSymbol = "@";

		for (int i = 0; i < rawEmail.length(); i++){
			
			//TODO - identify the integer value for '@'e.g. 56?
			if(rawEmail.charAt(i) == 2)
					//.equals(emailSymbol)){

				//whatever I is is whsere '@' symbol is located...
				//this.emailSymbolPos = i;
				this.setEmailPos(i);

			}
		}

	//removes email domain address from the email...
	public void trimEmailDomain(){

		//firstly, find out where email symbol position is located
		this.locateEmailStart();

		//next, substring the email down to this
		this.emailUsernameToSubstring = new StringBuilder(this.emailToTrim);

		/**
		 * Key operation, trims email down to nth start & max pos where email symbol begins...
		 */
		this.emailUsernameToSubstring.substring(0, this.emailSymbolPos);

		//update resultant usename...
		this.setUsername(this.emailUsernameToSubstring.toString());

	}


	//return generated username (email removed).
	public String returnObtainedUsername(){

		return this.desiredUsername;
	}

	public void setEmailPos(final int emailSymbolAtPosition){
		this.emailSymbolPos = emailSymbolAtPosition;
	}

	public void setUsername(final String newUserName){
		this.desiredUsername = newUserName;
	}

}
