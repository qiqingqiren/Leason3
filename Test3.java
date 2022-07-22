
public class Test3 {
    public static void main(String[] srgs)
    {
        byte j = 42;
        byte j1 = (byte) (j << 1); 	          //84
        byte j2 = (byte) (j << 2); 	          //168 
        byte j3 = (byte) (j << 3); 	          //336
        
        String m1 = String.format("0x%x", j);
        String m2 = String.format("0x%x", j1);
        String m3 = String.format("0x%x", j2);
        String m4 = String.format("0x%x", j3);


        System.out.println("j=" + m1);
        System.out.println("j1=" + m2);
        System.out.println("j2=" + m3);
        System.out.println("j3=" + m4);

    }    
}
