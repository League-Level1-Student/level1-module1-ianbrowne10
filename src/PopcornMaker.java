import javax.swing.JOptionPane;
/* Your mission and you have to accept it:
 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and cooks it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 *  Don't change the existing methods.
 */
public class PopcornMaker {
public static void main(String[] args) {
	Popcorn pop = new Popcorn("big poppy");
	Microwave miccroWaveh = new Microwave();
	miccroWaveh.putInMicrowave(pop);
	miccroWaveh.setTime(2);
	miccroWaveh.startMicrowave();

}
}
	
