import org.example.Main;
import org.example.TrianguloChecker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;


public class TrianguloTest {
    private TrianguloChecker trianguloChecker;

    @After
    @Before
    public void before(){
        this.trianguloChecker = new TrianguloChecker();
    }


    @Test
    public void trinaguloTestCorrectValues1(){
        this.trianguloChecker.setLados(2.0, 2.0, 2.0);
        this.trianguloChecker.verificaTriangulo();
        final boolean isTriangle = this.trianguloChecker.isTriangle();
        final String response = this.trianguloChecker.getMessage();

        Assert.assertTrue(isTriangle);
        Assert.assertEquals("os lados formam um triângulo", response );
    }

    @Test
    public void trinaguloTestCorrectValues2(){
        this.trianguloChecker.setLados(2.0, 3.0, 2.0);
        this.trianguloChecker.verificaTriangulo();
        final boolean isTriangle = this.trianguloChecker.isTriangle();
        final String response = this.trianguloChecker.getMessage();

        Assert.assertTrue(isTriangle);
        Assert.assertEquals("os lados formam um triângulo", response );
    }

    @Test
    public void trinaguloTestCorrectValues3(){
        this.trianguloChecker.setLados(3.0, 2.0, 3.0);
        this.trianguloChecker.verificaTriangulo();
        final boolean isTriangle = this.trianguloChecker.isTriangle();
        final String response = this.trianguloChecker.getMessage();

        Assert.assertTrue(isTriangle);
        Assert.assertEquals("os lados formam um triângulo", response );
    }


}
