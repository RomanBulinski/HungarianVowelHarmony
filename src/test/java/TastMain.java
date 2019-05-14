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

    @Test
    public void exampleTests3 () {
        assertEquals("tettnek", Main.dative("tett"));
    }

    @Test
    public void exampleTests4 () {
        assertEquals("keretnek", Main.dative("keret"));
    }

    @Test
    public void exampleTests5 () {
        assertEquals("otthonnak", Main.dative("otthon"));
    }

    @Test
    public void exampleTests6 () {
        assertEquals("virágnak", Main.dative("virág"));
    }



//        assertEquals("rokkantnak", Kata.dative("rokkant"));
//        assertEquals("rossznak", Kata.dative("rossz"));
//        assertEquals("gonosznak", Kata.dative("gonosz"));
//    }


}
