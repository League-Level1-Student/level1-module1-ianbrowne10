import java.util.Random;

public class Vault {
private int thecode;
Vault(){
	// thecode = new Random().nextInt(1000000);
thecode = 1000001;
}

boolean tryCode(int code) {
if(code==thecode) {
	return true;
}
else {
	return false;
}
}
}
