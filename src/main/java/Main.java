public class Main {

//    Kata.dative("ablak") == "ablaknak"
//            Kata.dative("szék") == "széknek"
//            Kata.dative("otthon") == "otthonnak"

    public static String dative(String word) {

        char[] letters = word.toCharArray();

        char let2 = letters[letters.length-2];
        char let3 = letters[letters.length-3];
        char let4 = letters[letters.length-4];


        if(  let2 == 'a' || let2 == 'á' || let2=='o' || let2=='ó'|| let2=='u'|| let2=='ú' ){
            return word + "nak";
        }
        if( let2 == 'e' || let2 == 'é' || let2 == 'i' || let2 == 'ö' || let2 == 'ő' || let2 == 'ü'  || let2 == 'ű' ){
            return word + "nek";
        }
        if( let2 == 't' &&  let3 == 'e'){
            return word + "nek";
        }

        return word;

    }


}
