import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TastMain {

    @Test
    public void exampleTests () {
        assertEquals("ablaknak", Main.dative("ablak"));
    }

    @Test
    public void exampleTests2 () {
        assertEquals("tükörnek", Main.dative("tükör"));
    }



//    @Test
//    public void exampleTests () {

//        assertEquals("keretnek", Kata.dative("keret"));
//        assertEquals("otthonnak", Kata.dative("otthon"));
//        assertEquals("virágnak", Kata.dative("virág"));
//        assertEquals("tettnek", Kata.dative("tett"));
//        assertEquals("rokkantnak", Kata.dative("rokkant"));
//        assertEquals("rossznak", Kata.dative("rossz"));
//        assertEquals("gonosznak", Kata.dative("gonosz"));
//    }


}
