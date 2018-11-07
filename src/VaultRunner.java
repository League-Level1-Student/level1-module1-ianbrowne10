
public class VaultRunner {
	public static void main(String[] args) {
	Vault vault = new Vault();
	VJamesBond james = new VJamesBond();
int answer =	james.findCode(vault); 
	if (answer==-1) {
		System.out.println("James Bond is a failure.");
	}
	else {
		System.out.println("James Bond is a winner. The code is " +answer+ "!");
	}
	}
}
