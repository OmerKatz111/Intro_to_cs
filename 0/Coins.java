public class Coins {
    public static void main(String[] args) {
	    int x = Integer.parseInt(args[0]);
		System.out.println("Use " + (x/25) + " quarters and " + (x%25) + " cents");
	}
}