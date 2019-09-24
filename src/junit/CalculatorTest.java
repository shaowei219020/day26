package junit;

import org.junit.Test;

public class CalculatorTest {
   @Test
    public void test1(){
Calculator a=new Calculator();
int sum=a.add(3,4);
       System.out.println(sum);
    }
}
