
package OOPS.Abstraction;

abstract class Rule5Parent{
    abstract void test();
}

public class AbstractionRule5 extends Rule5Parent {
      void test(){
        System.out.println("1 abstract class extended to concrete/non-abstract class" +
                " & provided implementation details to abstract method");
    }
}
