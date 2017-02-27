public class QuadraticPolynomial {
    private double a; // quadratic coefficient
    private double b; // linear coefficient
    private double c; // constant coefficient
    //Getters
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    // Setters
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    //Constructors
    public QuadraticPolynomial(double a, double b, double c) {
    //Question #2
//    The following class named QuadraticPolynomial can be used to represent polynomials of degree 2. 
//    Your job in this first problem is to create a new Eclipse project to test this code and make sure it works correctly. 
//    The class has a bug in one of its methods.  Find it and fix it. 
//    The class should pass the tests in the following tester class.	
    	
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Question #3
//    In this second problem you should complete the definition of a second constructor
//    that has a only one parameter of type double. 
//    This constructor sets all the coefficients in the target QuadraticPolynomial object
//    to the same value provided by the parameter.  
//    Here is a template for the new constructor:
    	
    public QuadraticPolynomial(double abc) {
        // YOUR CODE HERE
    	
    	this.a = abc;
        this.b = abc;
        this.c = abc;
    }
    
//    //Question #4
//    Your next task is to add a new instance method named eval to the QuadraticPolynomial class. 
//    The eval method should accept a single parameter named x of type double and 
//    should return a double value representing the result of evaluating the target polynomial at x.
//    See the test below for an example of how the eval method should work.  Here is a template for the eval method:
    
    public double eval(double x) {
        // YOUR CODE HERE
    	
        return a*x*x+ b*x+c; // Temporarily returns 0 to avoid compiler error
    }
    
//    //Question #5
//    Add another instance method to calculate the discriminant of a polynomial ax^2+ bx + c,
//    that is the result of the expression b2- 4ac.  
//    The method MUST NOT take any explicit parameters and should return a value of type double. 
//    Here is a template for the method:
    
    public double discriminant() {
    	
        return b*b-4*(a*c); // Temporarily return 0 to avoid compiler error
    }
    
//    //Question #6
//    Add a method named scale that returns a new QuadraticPolynomial object 
//    resulting from the multiplication of the target polynomial object by a scalar (a number).
//    The target polynomial should not be modified.
//    As a start you may use the following method template:
    
    public QuadraticPolynomial scale(double scalar) {
    	
        return new QuadraticPolynomial(a*(scalar),b*(scalar),c*(scalar)); 
    }
    
//    //Question #7
//    Add a method named add that returns a new QuadraticPolynomial object resulting form the addition of the target object 
//    to an a second polynomial passed to the method as an explicit parameter of type QuadraticPolynomial .
//    As a start you may use the following method template:
    
    public QuadraticPolynomial add(QuadraticPolynomial p) {
    	
        return new QuadraticPolynomial(this.a+p.getA(), this.b+p.getB(),this.c+p.getC()) ;
    }
     
}