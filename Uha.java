class Uha
{
 int main1(int a)
 {
  System.out.println(a-1);
  System.out.println(50);
  return 0;
 }
 int main2(int x)
 {
  System.out.println(x);
  int i = new Uha().main1(101);
  System.out.println(i);
  return 0;
 }
 public static void main(String[] args)
 {
 System.out.println("Start");
 Uha priya=new Uha();
 priya.main2(99);
 System.out.println("Hello");
 System.out.println("Java is awesome");
 }
}