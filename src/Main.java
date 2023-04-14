
public class Main {
    public static void main(String[] args) {
        String[] arrrayOfWords = new String[]{"mama", "papa", "yoj", "meimei", "jiejie"};
        System.out.println(wordsWithLettersRepeatedTwoTimes(arrrayOfWords));
     }

    public static char[] wordsWithLettersRepeatedTwoTimes(String[] arrayOfWords) {
        int arrayCounter = 0;
        String[] firstTwoWords = new String[2];
        int r;

        for (String element : arrayOfWords) {
            r = 1;
            int contains = 0;
           for (int i = 1; i < element.length(); i++) {

               for (int c = 0; c < element.length(); c++) {
                   if (element.charAt(i) == element.charAt(c)) {
                       contains++;
                   }
               }
               if (contains % 2 == 0) {
                   r++;
               }
           }

            if (r == element.length()) {
                firstTwoWords[arrayCounter] = element;
                arrayCounter++;
            }
            if (arrayCounter == 2) break;
        }

        return unicalLeters(firstTwoWords);
    }

    public static char[] unicalLeters(String[] firstTwoWords) {
        String lineOfChars = new String();
        for (String element : firstTwoWords) {
            int i = 0;
            do {
                boolean contains = false;
                for (int c = 0; c<lineOfChars.length(); c++) {
                    if (lineOfChars.charAt(c) == element.charAt(i)) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    lineOfChars += element.charAt(i);
                }
               i++;
            } while (i < element.length());
        }
        return lineOfChars.toCharArray();
    }
}