package test;

public class TestVarArgs {

	public static void main(String[] args) {
		
		
	
	}
	
	static String union(String... data) {
		StringBuilder builder=new StringBuilder();
		for(String s:data) {
			builder.append(s);
			builder.append(",");
			
		}return builder.toString();// Para construir la cadena
	
	}

}
