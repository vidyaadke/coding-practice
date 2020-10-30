package Algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestStockProfitTest {
    BestStockProfit bestStockProfit;

    @BeforeEach
    void init(){
         bestStockProfit = new BestStockProfit();
    }

    @Test
    void findBestProfit_1() {
        int[] inputValues = new int[]{7,1,4,5,6,7};
        assertEquals(6,bestStockProfit.findBestProfit2(inputValues));
    }

    @Test
    void findBestProfit_2() {
        int[] inputValues = new int[]{7,6,4,3,1};
        assertEquals(0,bestStockProfit.findBestProfit2(inputValues));
    }

    @Test
    void findBestProfit_3() {
        int[] inputValues = new int[]{7};
        assertEquals(0,bestStockProfit.findBestProfit2(inputValues));
    }
}