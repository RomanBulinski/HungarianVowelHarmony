import org.junit.jupiter.api.Test;

public class TastMain {


    @Test
    public void exampleTests () {
        assertEquals("ablaknak", Kata.dative("ablak"));
        assertEquals("tükörnek", Kata.dative("tükör"));
        assertEquals("keretnek", Kata.dative("keret"));
        assertEquals("otthonnak", Kata.dative("otthon"));
        assertEquals("virágnak", Kata.dative("virág"));
        assertEquals("tettnek", Kata.dative("tett"));
        assertEquals("rokkantnak", Kata.dative("rokkant"));
        assertEquals("rossznak", Kata.dative("rossz"));
        assertEquals("gonosznak", Kata.dative("gonosz"));
    }


}
