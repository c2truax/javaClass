public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String finishedString = (str1.trim()) + (str2.trim());
        return finishedString;
    }
    public Integer getIndexOrNull(String str3, char ch) {
        Integer valReturned;
        if (str3.indexOf(ch) == -1) {
            valReturned = null;
        }
        else {
            valReturned = str3.indexOf(ch);
        }
        return valReturned;
    }
    public Integer getIndexOrNull(String str3, String str4) {
        Integer valReturned;
        if (str3.indexOf(str4) == -1) {
            valReturned = null;
        }
        else {
            valReturned = str3.indexOf(str4);
        }
        return valReturned;
    }
    public String concatSubstring(String str5, int num1, int num2, String str6) {
        String strReturned = (str5.substring(num1, num2)) + str6;
        return strReturned;
    }
}