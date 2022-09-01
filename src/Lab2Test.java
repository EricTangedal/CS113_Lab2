import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab2Test {

    @Test
    void testPowerOfTwo(){
        var testLab2 = new Lab2(4096);
        testLab2.checkIfPowerOfTwo();
        assertEquals(2, testLab2.tempNum);
    }
}
/*
Eric Tangedal
Lab 2
CS113 1971
Version 1.0
08/31/2022
 */