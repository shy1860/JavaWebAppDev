package ca.gbc.library.cookies;
public class PersistentCookie extends javax.servlet.http.Cookie{

	private static final long serialVersionUID = 1L;
	private static final int SECONDS_PER_HALF_HOUR = 60 * 30;
	
	public PersistentCookie(String name, String value) {
		super(name, value);
		setMaxAge(SECONDS_PER_HALF_HOUR);
		}


}
