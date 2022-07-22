public class stringbuilder {
    public static void main(String[]  args){
        StringBuilder builder = new StringBuilder("");
        for(char i='a';i<='z';i++){
        builder.append(i);
        }

        String newStr = builder.toString();
		System.out.println(newStr);

        builder.delete(7, 14);
        System.out.println(builder.toString());


    }
}
