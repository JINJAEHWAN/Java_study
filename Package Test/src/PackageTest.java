//import test.pack1.PClass1;
//import test.pack1.PClass2;
import test.pack1.*;//test.pack1 import ��ü

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PClass1 p1c1 = new PClass1();//pack1.PClass1 p1c1���� 
		PClass2 p1c2 = new PClass2();//pack1.PClass1 p1c2���� 
		
		p1c1.method1();//test.pack1�� PClass1���
		p1c2.method1();//test.pack1�� PClass2���
		
		test.pack2.P2Class1 p2c1 = new test.pack2.P2Class1();
		test.pack2.P2Class2 p2c2 = new test.pack2.P2Class2();
		
		p2c1.method1();//test.pack2�� PClass1���
		p2c2.method1();//test.pack2�� PClass2���
	}

}
