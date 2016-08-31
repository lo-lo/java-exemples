package book_exe;

/**
 * Как можно заменить в строке подстроку на другую строку? В документации написано, что в строке
 * можно заменять только символы, а надо строки.
 * Вот простоя функция, которая делает, то, что нужно. Причем делает это столько раз, сколько нужно.
 * Т.е. если искомая строка встречается несколько раз, то она заменяется везде, где только встречается.
 */
/*
 Name: _String Replace (for real)
 Description:Replaces all occurances of a given substring with another substring in a String object.
 By: Brad Amsberry

 Inputs:aSearch=The String to search
		  aFind=The String to find
		  aReplace=The String to replace aFind with

 Returns:Returns aSearch with all occurances of aFind replaced with aReplace

*/
public class replaceString {
    protected String replaceString(String aSearch, String aFind, String aReplace) {
        String result = aSearch;
        if (result != null && result.length() > 0) {
            int a = 0;
            int b = 0;
            while (true) {
                a = result.indexOf(aFind, b);
                if (a != -1) {
                    result = result.substring(0, a) + aReplace + result.substring(a + aFind.length());
                    b = a + aReplace.length();
                } else
                    break;
            }
        }
        return result;
    }
}

