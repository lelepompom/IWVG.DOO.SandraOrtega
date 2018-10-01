package mastermind.v001.utils;

import mastermind.v001.models.Key;

public class StartDialog {

	private String title;
	private Key secretKey = new Key();
	
	public StartDialog(String title, String secretKey){
		assert title != null;
		this.title = title + " " + secretKey;
	}
	
	public int read(){
		IO io = new IO();
		return io.readInt(title);
	}
}
