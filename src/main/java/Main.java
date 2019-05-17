public class Main {

    public static String dative(String word) {


        String newWord;
        int len = word.length();
        char[] letters = word.toCharArray();
        char let2 = letters[letters.length - 2];

        if( len > 3 ){
            char let4 = letters[letters.length - 4];
            char let3 = letters[letters.length - 3];
            newWord = getNewWord(let2, let3, word);
            if (newWord != null) return newWord;
            if ( let4 == 'o') {
                return word + "nak";
            }
        }else if ( len == 3 ){
            char let3 = letters[letters.length - 3];
            newWord = getNewWord(let2, let3,word );
            if (newWord != null) return newWord;
        }else if ( len == 2 ){
            newWord = getNewWord(let2, 'x',word );
            if (newWord != null) return newWord;
        }

        return null;
    }


    private static String getNewWord( char let2, char let3, String word) {

        if ( "aáoóuú".contains( String.valueOf(let2) ) ){
            return word + "nak";
        }
        if ( "eéiöőüűí".contains( String.valueOf(let2)) ) {
            return word + "nek";
        }
        if ( "eéiöőüűí".contains( String.valueOf(let3)) ) {
            return word + "nek";
        }
        if ( "aáoóuú".contains( String.valueOf(let3)) ) {
            return word + "nak";
        }
        return null;
    }




}
