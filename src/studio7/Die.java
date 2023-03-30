package studio7;
import java.util.Random;
public class Die {

	    private int sides;
	    private Random rand;
	    
	    public Die(int sides) {
	        this.sides = sides;
	        this.rand = new Random();
	    }
	    
	    public int roll() {
	        return rand.nextInt(sides) + 1;
	    }
	}
