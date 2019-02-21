interface products{

    void stress_test();
    void fire_test();

}
class chair implements products{
    @Override
    public void stress_test() {
        System.out.println("chair stress test");
    }

    @Override
    public void fire_test() {
        System.out.println("chair fire test");
    }
}

class woodenchair extends chair{
    @Override
    public void fire_test() {
        System.out.println("wooden chair fire test");
    }
    @Override
    public void stress_test() {
        System.out.println("wooden chair stress test");
    }
}
class woodentable extends chair{
    @Override
    public void stress_test() {
        System.out.println("wooden table stress test");
    }

    @Override
    public void fire_test() {
        System.out.println("wooden table fire test");
    }
}
class Metal__chair extends chair{
    @Override
    public void stress_test() {
        System.out.println("metal chair stress test");
    }

    @Override
    public void fire_test() {
        System.out.println("metal chair fire test");
    }


}
class metal_table extends chair{
    @Override
    public void stress_test() {
        System.out.println("metal table stress test");
    }

    @Override
    public void fire_test() {
        System.out.println("metal table fire test");
    }
}
public class ques9 {

    public static void main(String[] args) {
    chair c=new chair();
        c.fire_test();
        c.stress_test();
        woodenchair woodenchair=new woodenchair();
        woodenchair.fire_test();
        woodenchair.stress_test();
        woodentable woodentable=new woodentable();
        woodentable.fire_test();
        woodentable.stress_test();
        metal_table metal_table=new metal_table();
        metal_table.fire_test();
        metal_table.stress_test();
        Metal__chair metal__chair=new Metal__chair();
        metal__chair.stress_test();
        metal__chair.fire_test();
    }
}
