package hackerrankpack;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SubstringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "javais javai javaisnotjava!@%@^!@#!#!)#!OPPIEOP!I javajava";
		String find = "javai";
		int lastIndex = 0;
		int count =0;
		while(lastIndex!=-1) {
			lastIndex=str.indexOf(find,lastIndex);
			if(lastIndex!=-1) {
				count++;
				lastIndex+=find.length();
			}
		}
		System.out.println(count);
		// String arr[] = s.split("is");
		/*
		 * System.out.println("size: "+arr.length); for(String x: arr) {
		 * System.out.println(x); }
		 */
		// System.out.println("count: "+s.split("java"));

	}

}
