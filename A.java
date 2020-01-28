interface A
{
 public abstract void aM1();
 public abstract void aM2();
}
interface B extends A
{
 public void bM1();
 public void bM2();
}
public class Demo extends Object implements B
{
}