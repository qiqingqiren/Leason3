public class builderstring { // 新建类
	public static void main(String[] args) { // 主方法
		StringBuilder builder = new StringBuilder("");
		for (int i = 1; i <= 10; i++) {
			builder.append(i);
		}
        int a=builder.length();
		System.out.println(a);
		
		String newStr = builder.toString();
		System.out.println(newStr);

		builder.delete(7, 10);
		System.out.println(builder.toString());

		builder.insert(1,"hello_");
		System.out.println(builder.toString());

	}
}