package Medium;

public class LicenseKeyFormatting {
	
	public String licenseKeyFormatting(String S, int K) {
		int count=0;
		StringBuilder str = new StringBuilder();
        for(int i=S.length()-1; i>=0; i--){
        	if(S.charAt(i)=='-'){
        		continue;
        	}else{
        		if(count==K){
        			str.append('-');
        			count=0;
        		}
        		str.append(S.charAt(i));
        		count++;
        	}
        }
        return str.reverse().toString().toUpperCase();
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicenseKeyFormatting lkf = new LicenseKeyFormatting();
		System.out.println(lkf.licenseKeyFormatting("2-4A0r7-4k", 3));
		

	}

}
