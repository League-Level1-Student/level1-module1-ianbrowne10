
public class VJamesBond {
int findCode(Vault bigVault) {
for(int i = 0; i < 1000000; i++) {
	if(bigVault.tryCode(i)) {
		return i; 
	}
}
return -1;
}
}
