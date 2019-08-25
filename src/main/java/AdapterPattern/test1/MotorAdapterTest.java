package AdapterPattern.test1;

//客户端代码
public class MotorAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("适配器模式测试：");
        //Motor motor=new OpticalAdapter();
        Motor motor=new ElectricAdapter();
        motor.drive();
    }
}