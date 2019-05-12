public class Main {

//    Kata.dative("ablak") == "ablaknak"
//            Kata.dative("szék") == "széknek"
//            Kata.dative("otthon") == "otthonnak"


    public static String dative(String word) {

        char[] letters = word.toCharArray();

        char let = letters[letters.length-2];

        if(  let == 'a' || let == 'á' || let=='o' || let=='ó'|| let=='u'|| let=='ú' ){
            return word + "nak";
        }

        if( let == 'e' || let == 'é' || let == 'i' || let == 'ö' || let == 'ő' || let == 'ü'  || let == 'ű'  ){
            return word + "nek";
        }
        return word;

    }
}
