package Manual_Control;

public class Mutant1 {

	public Mutant1() {
		
	}
	
	public double AreaRectangle(double a, double b) {
		double result = a+b;//MUTANT LINE
		return result;
	}
	
	public double AreaCircle(double radius) {
		double result = radius*radius*Math.PI;
		return result;
	}
	
	public double Circumference(double radius) {
		double result = 2*radius*Math.PI;
		return result;
	}
	
	public double Power(double base, double pow) {
	        if (pow == 0) { 
	            return 1; 
	        }
	        double answer = base; 
	        double increment = base; 
	        double i, j; 
	        for (i = 1; i < pow; i++) { 
	            for (j = 1; j < base; j++) { 
	                answer += increment; 
	            } 
	            increment = answer; 
	        } 
	        return answer; 
	    }
}
