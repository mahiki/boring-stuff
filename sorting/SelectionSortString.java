public class SelectionSortString {

    public static void main(String[] args) {

	String str1 = "abdaacdefa"; //4
	String out = sortStr(str1);
	System.out.println(out);
	
    }

    public static String sortStr(String str) {
	int small;
	String tmp;
	boolean found;
	for (int i=0; i<str.length()-1; i++) {
	    small = i;
	    found = false;
	    for (int j=i+1; j<str.length(); j++) {
		if ( str.charAt(j) < str.charAt(small) ) {
		    found = true;
		    small = j;
		}
	    }
	    tmp = str.substring(i,i+1);
	    if (found) {
		str = str.substring(0,i) + str.substring(small,small+1) + str.substring(i+1,small) + tmp  + str.substring(small+1,str.length());
	    }
	}

	return str;
    };

}
