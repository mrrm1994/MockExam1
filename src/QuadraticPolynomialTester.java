import static org.junit.Assert.*;
import org.junit.Test;
public class QuadraticPolynomialTester {
    @Test //Question #2
    public void settersGettersTest () {
        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
        p.setA(p.getA()+1.0);
        p.setB(p.getB()*3.0);
        p.setC(p.getC()/3.0);
        assertEquals("settersGettersTest: Wrong quadratic coefficient", 2.0, p.getA(), 1e-10);
        assertEquals("settersGettersTest: Wrong linear coefficient", 6.0, p.getB(), 1e-10);
        assertEquals("settersGettersTest: Wrong constant coefficient", 1.0, p.getC(), 1e-10);
    }
    @Test //Question #2
    public void constructorTest1 () {
        QuadraticPolynomial p1 = new QuadraticPolynomial(1.0, 2.0, 3.0);
        assertEquals("constructorTest1: Wrong quadratic coefficient", 1.0, p1.getA(), 1e-10);
        assertEquals("constructorTest1: Wrong linear coefficient", 2.0, p1.getB(), 1e-10);
        assertEquals("constructorTest1: Wrong constant coefficient", 3.0, p1.getC(), 1e-10);
    }
    
    @Test //Question #3
    public void constructorTest2 () {
        QuadraticPolynomial p2 = new QuadraticPolynomial(1.0);
        assertEquals("constructorTest2: Wrong quadratic coefficient", 1.0, p2.getA(), 1e-10);
        assertEquals("constructorTest2: Wrong linear coefficient", 1.0, p2.getB(), 1e-10);
        assertEquals("constructorTest2: Wrong constant coefficient", 1.0, p2.getC(), 1e-10);
        QuadraticPolynomial p3 = new QuadraticPolynomial(2.0);
        assertEquals("constructorTest2: Wrong quadratic coefficient", 2.0, p3.getA(), 1e-10);
        assertEquals("constructorTest2: Wrong linear coefficient", 2.0, p3.getB(), 1e-10);
        assertEquals("constructorTest2: Wrong constant coefficient", 2.0, p3.getC(), 1e-10);
    }
    
//    @Test //Question #4
//    public void evalTest () {
//        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 1.0, 1.0);
//        assertEquals("evalTest: Wrong result in eval method" , 3.0, p.eval(1.0), 1e-10);
//        QuadraticPolynomial q = new QuadraticPolynomial(2.0, 2.0, 2.0);
//        assertEquals("evalTest: Wrong result in eval method" , 6.0, q.eval(1.0), 1e-10);
//    }
    
//    @Test //Question #5
//    public void discriminantTest() {
//        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 4.0, 2.0);
//        assertEquals("discriminantTest: Wrong result in eval method" , 8.0, p.discriminant(), 1e-10);
//        QuadraticPolynomial q = new QuadraticPolynomial(1.0, 4.0, 3.0);
//        assertEquals("discriminantTest: Wrong result in eval method" , 4.0, q.discriminant(), 1e-10);
//    }
    
//    @Test //Question #6
//    public void scaleTest() {
//        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
//        QuadraticPolynomial r = p.scale(2.0);
//        assertEquals("scaleTest: Wrong quadratic coefficient", 1.0, p.getA(), 1e-10);
//        assertEquals("scaleTest: Wrong linear coefficient", 2.0, p.getB(), 1e-10);
//        assertEquals("scaleTest: Wrong constant coefficient", 3.0, p.getC(), 1e-10);
//        assertEquals("scaleTest: Wrong quadratic coefficient", 2.0, r.getA(), 1e-10);
//        assertEquals("scaleTest: Wrong linear coefficient", 4.0, r.getB(), 1e-10);
//        assertEquals("scaleTest: Wrong constant coefficient", 6.0, r.getC(), 1e-10);
//    }
    
//    @Test //Question #7
//    public void addTest() {
//            QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
//            QuadraticPolynomial q = new QuadraticPolynomial(3.0, 2.0, 1.0);
//            QuadraticPolynomial r = p.add(q);
//            assertEquals("addTest: Wrong quadratic coefficient", 4.0, r.getA(), 1e-10);
//            assertEquals("addTest: Wrong linear coefficient", 4.0, r.getB(), 1e-10);
//            assertEquals("addTest: Wrong constant coefficient", 4.0, r.getC(), 1e-10);
//            r = q.add(r);
//            assertEquals("addTest: Wrong quadratic coefficient", 7.0, r.getA(), 1e-10);
//            assertEquals("addTest: Wrong linear coefficient", 6.0, r.getB(), 1e-10);
//            assertEquals("addTest: Wrong constant coefficient", 5.0, r.getC(), 1e-10);
//    }
    
}