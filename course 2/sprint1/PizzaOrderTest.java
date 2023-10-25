package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest 
{
    PizzaOrder po;
    
	@Before
public void setUp(){
    //Initialize the object of class PizzaOrder
    po = new PizzaOrder();
}


// Write the logic inside the test case methods

@Test
public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){
    int noOfPizza = 5;
    float priceOfPizza = 11.99f;
    float actualResult = po.calculatePriceOfPizza(noOfPizza, priceOfPizza);
    assertEquals(59.95, actualResult, 0.001);
}

@Test
public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
    int noOfGarlicBread = 3;
    float priceOfGarlicBread = 5.99f;
    float actualResult = po.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
    assertEquals(17.97, actualResult, 0.01);
}

@Test
public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
    int noOfBeverages = 3;
    float priceOfBeverages = 1.99f;
    float actualResult = po.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
    assertEquals(5.97, actualResult, 0.01);
}

@Test
public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
    int noOfPizza = 5;
    float priceOfPizza = 11.99f;
    float actualResult = po.calculatePriceOfPizza(noOfPizza, priceOfPizza);
    assertNotEquals(45, actualResult, 0.01);
}

@Test
public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
    int noOfGarlicBread = 3;
    float priceOfGarlicBread = 5.99f;
    float actualResult = po.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
    assertNotEquals(15, actualResult, 0.01);
}

@Test
public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
    int noOfBeverages = 3;
    float priceOfBeverages = 1.99f;
    float actualResult = po.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
    assertNotEquals(9, actualResult, 0.01);
}

@Test
public void givenSizeofPizzaReturnPrice(){
    int size = 2;
    float actualResult = po.getPriceOfPizzaBasedOnSize(size);
    assertEquals(11.99, actualResult, 0.01);
}

@Test
public void givenPriceOfItemsCalculateTotalBillAmount(){
    float totalPizzaPrice = 59.95f;
    float totalGarlicBreadPrice = 17.97f;
    float totalBeveragePrice = 5.97f;
    float actualResult = po.calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBeveragePrice);
    assertEquals(83.89, actualResult, 0.01);
}

@Test
public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
    float totalBillAmount = 83.89f;
    float actualResult = po.calculateDiscountAndReturnBillAmount(totalBillAmount);
    assertEquals(75.501, actualResult, 0.01);
}

@Test
public void givenTotalBillLessThan50AmountCalculateDiscount(){
    float totalBillAmount = 17.97f;
    float actualResult = po.calculateDiscountAndReturnBillAmount(totalBillAmount);
    assertEquals(17.97, actualResult, 0.01);
}
	
	
	@After
public void tearDown(){
    // Assign object of PizzaOrder to null
    po = null;

}
}