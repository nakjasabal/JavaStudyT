package ex09package.study.util;

public class CommonUtil {
	/*
	전달된 문자열을 검사하여 숫자가 아닌 문자가 포함된 경우 false를
	반환하고, 모두 숫자인 경우 true를 반환한다. */
	public static boolean isNumber(String strValue) {
		
		/*
		만약 전달된 문자열의 길이가 0, 즉 빈 문자열이라면 검사할
		필요가 없으므로 false를 반환 */
		if(strValue.length()==0) 
			return false;
		//문자열의 길이만큼 반복 
		for(int i=0 ; i<strValue.length(); i++) {
			//각 인덱스에 해당하는 문자의 아스키코드 값을 반환 
			int acode = strValue.codePointAt(i);
			/*
			아스키코드를 통해 숫자형식인지 확인하고, 만약 범위를 
			벗어났다면 숫자형식이 아니므로 false를 반환한다. */
			if( !(acode>='0' && acode<='9') ){
				return false;
			}
		}
		//문자열 전체가 숫자로만 구성되었다면 true를 반환한다. 
		return true;
	}
}


