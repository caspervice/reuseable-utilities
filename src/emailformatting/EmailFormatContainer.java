/**
 * 
 */
package emailformatting;

/**
 * @author aramide
 *
 */
public class EmailFormatContainer {

	private int charSymbolPosition;
	
	private String originalEmailAddress;
	
	private String newFormattedEmailAddress;
	
	/**
	 * 
	 */
	public EmailFormatContainer(final String emailAdd) {
		// TODO Auto-generated constructor stub
		
		this.originalEmailAddress = emailAdd;
	}
	
	/**
	 * Store position where detected symbol located at.
	 * 
	 * @param pos
	 */
	public void setSymbolPosition(final int pos){
		
		this.charSymbolPosition = pos;
		
	}
	
	public void setNewEmail(final String newEmail){
		
		this.newFormattedEmailAddress = newEmail;
	}
	
	/**
	 * Return stored position.
	 * 
	 * @return
	 */
	public int getSymbolPosition(){
		
		return this.charSymbolPosition;
	}
	
	/**
	 * Return newly generated email address.
	 * 
	 * @return
	 */
	public String getNewEmail(){
		
		return this.newFormattedEmailAddress;
	}

}
