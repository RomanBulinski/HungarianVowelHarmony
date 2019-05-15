public class Main {

    public static String dative(String word) {

        int len = word.length();
        char[] letters = word.toCharArray();
        char let2 = letters[letters.length - 2];
        char let3 = letters[letters.length - 3];

        if( len > 3 ){
            char let4 = letters[letters.length - 4];
            String x = getNewWord(let2, let3, word);
            if (x != null) return x;
            if ( let4 == 'o') {
                return word + "nak";
            }
        }else if ( len <= 3 ){
            String x = getNewWord(let2, let3,word );
            if (x != null) return x;
        }
        return word;
    }


    private static String getNewWord( char let2, char let3, String word) {

        if ( "aáoóuú".contains( String.valueOf(let2) ) ){
            return word + "nak";
        }
        if ( "eéiöőüű".contains( String.valueOf(let2)) ) {
            return word + "nek";
        }
        if ( let3 == 'e' || let3 == 'é' ) {
            return word + "nek";
        }
        if ( let3 == 'a' || let3 == 'o' || let3 == 'á' ) {
            return word + "nak";
        }
        return null;
    }


}
