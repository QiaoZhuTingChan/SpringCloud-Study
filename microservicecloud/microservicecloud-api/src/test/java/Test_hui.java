import org.junit.Test;

public class Test_hui {

	@Test
	public void find() {

		String str = "ysfsturewr";
		String regex = "y?f*u";

		isfindValue(str, regex, 0, 0);

	}

	private boolean isfindValue(String str, String regex, int str_index, int regex_index) {
		
		if(regex_index >= regex.length() && str_index <= str.length()-1) {
			System.out.println("ok");
			return true;
		}
		System.out.println(str_index+":"+str.charAt(str_index)+"\t"+regex_index+":"+regex.charAt(regex_index));
		
		if(str.charAt(str_index) == regex.charAt(regex_index)) {
			str_index++;
			regex_index++;
		}
		if(regex.charAt(regex_index) == "?".toCharArray()[0]) {
			str_index++;
			regex_index++;
		}
		if(regex.charAt(regex_index) == "*".toCharArray()[0]) {
			if(regex_index < regex.length()-1) {
				if(regex.charAt(regex_index+1) == str.charAt(str_index)) {
					
					str_index++;
					regex_index+=2;
				}
			}else {
				str_index++;
			}
		}
		return isfindValue(str, regex, str_index, regex_index);
		
		
	}

}
