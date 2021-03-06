package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import edu.eci.cvds.ecibook.model.DiscountCategory;

/**
 * Subscription Service class in charge of calculating the monthly subscription.
 */
public class BookSaleService {

	/**
	 * Calculate the cost of a book, depending on the discount category and book category.
	 *
	 * @param bookCategory      The book category
	 * @param discountCategory  The discount category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final BigDecimal bookCategory, final DiscountCategory discountCategory) {
                                        BigDecimal precio= getPrice(bookCategory);
                                        switch (discountCategory){
                                            case EMPLOYEE:
                                                 BigDecimal tarifa=   new BigDecimal(0.1);
                                                return precio.subtract(precio.multiply(tarifa));
                                            case STUDENT:
                                                BigDecimal tarifa2=   new BigDecimal(0.2);
                                                return precio.subtract(precio.multiply(tarifa2));
                                              case OTHER:
                                                  BigDecimal tarifa3=   new BigDecimal(1);
                                                return precio.subtract(precio.multiply(tarifa3));
                                              default:
                                                  throw new IllegalStateException("Category dont find");
                                        }	
	}
                    public BigDecimal getPrice(final BigDecimal bookCategory) {
                               BigDecimal uno =  new BigDecimal(1);
                               BigDecimal dies =  new BigDecimal(1);
                               BigDecimal once =  new BigDecimal(1);
                               BigDecimal veinte =  new BigDecimal(1);
                               BigDecimal ventiuno =  new BigDecimal(1);
                               BigDecimal treinta =  new BigDecimal(1);
                               
                               BigDecimal p1 =  new BigDecimal(25000);
                               BigDecimal p2 =  new BigDecimal(50000);
                               BigDecimal p3 =  new BigDecimal(100000);
                               
                              if (bookCategory.compareTo(uno) >=0 && bookCategory.compareTo(dies) <=0){
                                  return p1;
                                } 
                              if (bookCategory.compareTo(once) >=0 && bookCategory.compareTo(veinte) <=0){
                                  return p2;
                                } 
                               if (bookCategory.compareTo(ventiuno) >=0 && bookCategory.compareTo(treinta) <=0){
                                  return p2;
                                } 
                               else{ return BigDecimal.ZERO;}
                    }
                        
	/*
                    
	 * Tip: Siempre que se desee realizar c??lculos matem??ticos de alta precisi??n (por ejemplo para temas de dinero)
	 * es mucho m??s confiable usar el tipo de dato BigDecimal, pues soporta un alto rango de n??mero, decimales y
	 * tiene mayor precisi??n en los c??lculos. <br />
	 * Ejemplos b??sicos de operaciones con BigDecimal, teniendo las variables `bd1` y `bd2`:
	 * <ul>
	 * <li>Creaci??n: <code>BigDecimal nuevo = new BigDecimal(10);</code></li>
	 * <li>Sumas: <code>BigDecimal suma = bd1.add(bd2);</code></li>
	 * <li>Restas: <code>BigDecimal resta = bd1.subtract(bd2);</code></li>
	 * <li>Multiplicaci??n: <code>BigDecimal multiplicaci??n = bd1.multiply(bd2);</code></li>
	 * <li>Divisi??n: <code>BigDecimal division = bd1.divide(bd2);</code></li>
	 * </ul>
	 */

}
