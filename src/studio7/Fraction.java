package studio7;

public class Fraction {

		    private int numerator;
		    private int denominator;
		    
		    public Fraction(int numerator, int denominator) {
		        this.numerator = numerator;
		        this.denominator = denominator;
		    }
		    
		    public Fraction add(Fraction other) {
		        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		        int newDenominator = this.denominator * other.denominator;
		        return new Fraction(newNumerator, newDenominator).simplify();
		    }
		    
		    public Fraction multiply(Fraction other) {
		        int newNumerator = this.numerator * other.numerator;
		        int newDenominator = this.denominator * other.denominator;
		        return new Fraction(newNumerator, newDenominator).simplify();
		    }
		    
		    public Fraction reciprocal() {
		        return new Fraction(denominator, numerator);
		    }
		    
		    public Fraction simplify() {
		        int gcd = findGCD(numerator, denominator);
		        return new Fraction(numerator / gcd, denominator / gcd);
		    }
		    
		    private int findGCD(int a, int b) {
		        if (b == 0) {
		            return a;
		        }
		        return findGCD(b, a % b);
		    }
		}
		
	

