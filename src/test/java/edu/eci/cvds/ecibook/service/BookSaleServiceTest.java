package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link BookSaleService}
 */
public class BookSaleServiceTest {

	/**
	 * The class under test.
	 */
	private BookSaleService service = new BookSaleService();
                    private DiscountCategory discountCategory=new DiscountCategory();
        
                     @Test
	public void test1() {
                                        BigDecimal califica =  new BigDecimal(1);
                                        BigDecimal rta =  new BigDecimal(1);
		Assert.assertEquals(rta,  service.calculateCost(califica, discountCategory.OTHER));
	}
        
                     @Test
	public void test2() {
                                        BigDecimal rta =  new BigDecimal(1);
		Assert.assertEquals(rta,  service.calculateCost(null, null));
	}
	@Test
	public void test3() {
                                        BigDecimal rta =  new BigDecimal(1);
		Assert.assertEquals(rta,  service.calculateCost(null, null));
	}
}
