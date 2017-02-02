/**
 * 
 */
package com.svr.logical;

/**
 * @author Venkata Saripella
 *
 */
public class FibonacciConfiguration {

    Integer  firstNumber;
    Integer  secondNumber;
    Integer  limit;
    public Integer getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }
    public Integer getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public String toString() {
        return "FibonacciConfiguration [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", limit="
                + limit + "]";
    }
    
}
