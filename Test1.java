
public class Test1 {
    public static void main(String[] args)
    {
        char c1 = 'A';     // A的ASCII值为65
		int i;
		i = (int)c1 ;
		System.out.println(i);

        int a = 131071;
        short b = (short)a;
        short c = (short)-1;

        String m1 = String.format("a 的 10 进制 为：%d", a);
        
		System.out.println(m1);
        String m2 = String.format("a 的 16 进制 为：%x", a);

		System.out.println(m2);
        String m3 = String.format("b 的 10 进制 为：%d", b);
        
		System.out.println(m3);
        String m4 = String.format("b 的 16 进制 为：%x", b);

		System.out.println(m4);

        String m5 = String.format("-1 的 16 进制 为：%x", c);

		System.out.println(m5);



    }
}
