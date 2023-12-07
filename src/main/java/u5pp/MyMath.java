package u5pp;

public class MyMath {
	double x;
	int sqr;
	public int abs(int x) {
		if (x < 0) {
			x = x + (-2* x);
			return x;
		}
		else {
			return x;
		}
	}
	
	public double abs(double x) {
		if (x < 0) {
			x = x + (-2* x);
			return x;
		}
		else {
			return x;
		}
	}
	
	public double pow(double base, int exponent) {
		x = base;
		if (exponent == 0) {
			x = 1;
		}
		else {
			for (int i = 1; i < exponent; i++) {
				x *= base;
			}
		}
		return x;  
	}
	
	public int perfectSqrt(int x) {
		int y = 1;
		if (x > 4) {
			sqr = x/2;
		}
		while (y < sqr){
			if (x / y == y) { 
				return y;
			}
			y++;
		}
		
			return -1;
		
	}
	
}
