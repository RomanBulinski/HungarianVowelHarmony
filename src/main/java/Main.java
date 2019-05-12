public class Main {

//    Kata.dative("ablak") == "ablaknak"
//            Kata.dative("szék") == "széknek"
//            Kata.dative("otthon") == "otthonnak"


    public static String dative(String word) {

        char[] letters = word.charAt();

        if( letters[letters.length-2] == 'a'  ){
            return word + "nak";
        }
        if( letters[letters.length-2] == 'é'  ){
            return word + "nek";
        }

    }
}
