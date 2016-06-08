class Base {
public void foo() {}}
class Derived extends Base {
    public void foo() {
        System.out.println("Done");
    }}
    public class Main {
        public static void main(String args[]) {
            Derived d = new Derived();
            d.foo();
        }
    }