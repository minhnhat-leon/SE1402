/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;  

/**
 *
 * @author NhatBPM;
 */
public class MyToysTest {
    
    //Trong đây là những tình huống mình cần test
    //VD: test tình huống đúng và nhận về như dự kiến
    
    //VD: test tình huống sai mà nhận về EXRPTION
    
    @Test
    public void testSuccessfullCases() {
        assertEquals(10, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
    }
    
    //Ngoại lệ là 1 thứ k phải value (TEST EXCEPTION)
    //vậy thì k thể assert được, vì cần có 1 value để so sánh
    //xài thêm 1 kĩ thuật bắt ngoại lệ, coi ngoại lệ xảy ra có đúng kì vọng k
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionNegagtiveCases() {
        //Ko co value 
        cF(-5);
        cF(-100);
        cF(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionUpperBoundCases() {  //>15 thì k sài được
        //Ko co value 
        cF(16);
        cF(100);
    }
}
