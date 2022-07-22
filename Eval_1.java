public class Eval_1 { // 新建类
	public static void main(String[] args) { // 主方法
		String regex = "1[35]\\d{9}";	//    \\d  0-9的任意一个数字  
		String text = "15598565253";
		if (text.matches(regex)) {
			System.out.println(text + "是合法的手机号");
		}
	}
}