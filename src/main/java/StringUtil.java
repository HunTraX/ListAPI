public class StringUtil {

	public static Object stringToObject(String s){
		if (stringIsDigit(s)){
			return new Integer(s);
		}
		else {
			return new String(s);
		}

	}

	public static boolean stringIsDigit(String s){
		for (Character c: s.toCharArray()) {
			if(!Character.isDigit(c)){
				return false;
			}
		}
		return true;
	}

}
