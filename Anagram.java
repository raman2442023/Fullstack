package github.org;

public class Anagram {

	public static void main(String[] args) {
		
		Anagram ana  =new Anagram();
		boolean ans=ana.valid_anagram();
		System.out.println(ans);
		

	}

	private boolean valid_anagram() {
		String s1 ="act";
		String s2 ="cct";
		
		if(s1.length() != s2.length()) {
			return false;
		}else {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i) == s2.charAt(j)) {
						s2 = s2.replaceFirst(""+s1.charAt(i), "");
						break;
					}
				}
			}if(s2.length()==0)
				return true;
			else
				return false;
		}
		
	}

}
