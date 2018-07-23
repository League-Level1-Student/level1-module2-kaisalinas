
public class Vault {
	int secretCode = 141592;
public static void main(String[] args) {
	Vault v = new Vault();
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
