//Why Line 17 in the below code is throwing compile time error?

package pack1;

public class A
{
  protected A()
  {
      //protected constructor
  }
}

package pack2;

import pack1.A;

class B
{
  A a = new A();


}
