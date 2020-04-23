public class CounterDemo
{
 public static void main ( String[] args )
 {
  Counter c1;
  c1 = new Counter();
  c1.increment();
  System.out.println( "Count of c1 = "+ c1.getCount() );
  c1.increment();
  System.out.println( "Count of c1 = "+ c1.getCount() );
  c1.incrementDelta( 2 );
  System.out.println( "Count of c1 = "+ c1.getCount() );
  Counter c2 = new Counter( 10 );
  c2.increment();
  System.out.println( "Count of c2 = "+ c2.getCount() );
  c2.increment( 20 );
  System.out.println( "Count of c2 = "+ c2.getCount() );
  c2.reset();
  System.out.println( "Count of c2 = "+ c2.getCount() );
 }
}
