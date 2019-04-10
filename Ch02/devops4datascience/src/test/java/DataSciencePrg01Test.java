import com.packt.devops.datascience.DataSciencePrg01;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataSciencePrg01Test {

    public DataSciencePrg01 dataScience;


    @BeforeEach
    public void before() throws Exception
    {
        dataScience = new DataSciencePrg01();
        dataScience.init();
    }

    @Test
    public void testMean1() {
        assertEquals(0, dataScience.x);
    }

    @Test
    public void testMean2() {
        dataScience.mean();
        assertEquals(4.230769230769231, dataScience.x);
    }

    @Test
    public void testMedian1() {
        assertEquals(0, dataScience.y);
    }

    @Test
    public void testMedian2() {
        dataScience.median();
        assertEquals(5.0, dataScience.y);
    }

    @Test
    public void testMode1() {
        assertEquals(0, dataScience.z);
    }

    @Test
    public void testMode2() {
        dataScience.mode();
        assertEquals(5.0, dataScience.z);
    }

    @Test
    public void testStdev1() {
        assertEquals(0, dataScience.a);
    }

    @Test
    public void testStdev2() {
        dataScience.stdev();
        assertEquals(1.9644272343292226, dataScience.a);
    }

    @Test
    public void testVariance1() {
        assertEquals(0, dataScience.b);
    }

    @Test
    public void testVariance2() {
        dataScience.variance();
        assertEquals(3.858974358974358, dataScience.b);
    }


}
