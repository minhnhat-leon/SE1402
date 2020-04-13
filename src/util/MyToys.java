/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author NhatBPM;
 */
public class MyToys {
    //Thư viện xài chung
    
    //cF: compute factorial, tinsh n giai thua
    //O! = 1
    //n! tang nhanh nen de long
    public static long cF(int n) {
        if (n < 0 || n> 15) {
            throw new IllegalArgumentException("Sorry,n must be >= 0");
        }
        if (n == 0) {
            return 1;
        }
        long product = 1;
        for (int i = 0; i < n; i++) {
            product *= i;
        }
        return product;
    }
}
