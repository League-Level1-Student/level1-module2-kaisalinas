
public class Vault {
	int secretCode = 1492;
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond JB = new JamesBond();
	System.out.println(JB.findCode(v));
	//System.out.println(v.tryCode(141592));
}
	public boolean tryCode(int bob) {
		if(bob == secretCode) {
			return true;
		}
		else {
			return false;
		}
	}
}
