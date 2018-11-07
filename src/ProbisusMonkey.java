
public class ProbisusMonkey {
private int pounds;
private String favoriteFood;


ProbisusMonkey(int pounds, String favoriteFood){
	this.pounds = pounds;
	this.favoriteFood = favoriteFood;

}
public String toString(){
	return "A monkey that weighs "+pounds+", and eats "+favoriteFood+"!";
}
}
