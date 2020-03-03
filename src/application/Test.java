package application;

public class Test {

	public static void main(String[] args) {
		
		Staff a1 = new Staff("Gustav", "9610", "0702990313", "gusben96@gmail.com", "Lärare");
		Staff a2 = new Staff("Kalle", "9900", "0705501232", "kalleklumpfot@YAHOO.COM", "Proffessor");
		
		SecurityLevel s1 = new SecurityLevel("Kontor");
		SecurityLevel s2 = new SecurityLevel("Salar");
		
		a1.addSecurityLevel(s1);
		a1.addSecurityLevel(s2);
		a2.addSecurityLevel(s2);
		
		
		for (SecurityLevel level : a1.getSecurityLevel()) {
			System.out.println(level.getLevel());
		}
	}

}
