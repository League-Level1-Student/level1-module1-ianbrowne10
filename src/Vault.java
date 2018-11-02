
public class Vault {
int randomNumber = new Random.nextInt(1000000);
	int secretCode = randomNumber;
boolean tryCode(int code) {
if(code==secretCode) {
	return true;
}
else {
	return false;
}
}
}
