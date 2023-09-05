import org.example.Main;
import org.example.TrianguloChecker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;


public class TrianguloTest {


    @Test
    public void trinaguloTestCorrectValues1(){

        final boolean isTriangle = TrianguloChecker.getIsTriangle(2.0, 2.0, 2.0);
        final String response = TrianguloChecker.getTriangleType(2.0, 2.0, 2.0);

        Assert.assertTrue(isTriangle);
        Assert.assertEquals("Equilatero", response );
    }

    @Test
    public void trinaguloTestCorrectValues2(){
        final boolean isTriangle = TrianguloChecker.getIsTriangle(5.0, 7.0, 8.0);
        final String response = TrianguloChecker.getTriangleType(5.0, 7.0, 8.0);

        Assert.assertTrue(isTriangle);
        Assert.assertEquals("Escaleno", response );
    }

    @Test
    public void trinaguloTestCorrectValues3(){
        final boolean isTriangle = TrianguloChecker.getIsTriangle(3.0, 2.0, 3.0);
        final String response = TrianguloChecker.getTriangleType(3.0, 2.0, 3.0);

        Assert.assertTrue(isTriangle);
        Assert.assertEquals("não é um triangulo", response );
    }

    @Test
    public void trianguloTestValoresNegativos() {
        final boolean isTriangle = TrianguloChecker.getIsTriangle(-1.0, 2.0, 3.0);
        final String response = TrianguloChecker.getTriangleType(-1.0, 2.0, 3.0);

        Assert.assertFalse(isTriangle);
        Assert.assertEquals("os lados não podem ser menor que zero", response);
    }

}
