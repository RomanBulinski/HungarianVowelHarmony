public class Main {

//    Kata.dative("ablak") == "ablaknak"
//            Kata.dative("szék") == "széknek"
//            Kata.dative("otthon") == "otthonnak"

    public static String dative(String word) {

        int len = word.length();
        char[] letters = word.toCharArray();
        char let2 = letters[letters.length - 2];
        char let3 = letters[letters.length - 3];

        if( len > 3 ){
            char let4 = letters[letters.length - 4];
            String x = getNewWord(let2, let3, word);
            if (x != null) return x;
            if (  let3 == 's' && let4 == 'o') {
                return word + "nak";
            }
        }else if ( len <= 3 ){
            String x = getNewWord(let2, let3,word );
            if (x != null) return x;
        }
        return word;
    }

//    expected:<kérvény[nek]> but was:<kérvény[]>


    private static String getNewWord(char let2, char let3, String word) {
        if (let2 == 'a' || let2 == 'á' || let2 == 'o' || let2 == 'ó' || let2 == 'u' || let2 == 'ú') {
            return word + "nak";
        }
        if (let2 == 'e' || let2 == 'é' || let2 == 'i' || let2 == 'ö' || let2 == 'ő' || let2 == 'ü' || let2 == 'ű') {
            return word + "nek";
        }
        if ( let3 == 'e' || let3 == 'é' ) {
            return word + "nek";
        }
        if ( let3 == 'a') {
            return word + "nak";
        }

        if (let2 == 's' && let3 == 'o') {
            return word + "nak";
        }
        if (let3 == 'á' && let2 == 'l') {
            return word + "nak";
        }

        return null;
    }

}
