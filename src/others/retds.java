package others;
import java.util.*;

public class retds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"()()()()","(()()())","()(()())","(()())()","((()()))","()()(())","()(())()","(()(()))","(())()()","((())())","()((()))","((()))()","(((())))"};
		String[] b = {"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"};
		
		Set<String> sd = new HashSet<String>();
		
		String[] c = {"(()())","((()))","()(())","(())()","()(())","()()()"};
	    String[] d = {"((()))","(()())","(())()","()(())","()()()"};

		for(String s:a)
		{
			sd.add(s);
		}
		
		for(String sb:b)
		{
			if(!sd.contains(sb))
				System.out.println(sb);
		}
	}

}
