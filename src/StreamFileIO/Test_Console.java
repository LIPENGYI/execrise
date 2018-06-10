package StreamFileIO;

import java.io.Console;
public class Test_Console {
	public static void main(String[] args){
		Console c = System.console();
		String username = c.readLine("User name");
		c.printf("user:"+username+"\n");
		char [] passwd = c.readPassword();
		c.printf(String.valueOf(passwd));
	}
}
