package ca.davidgrant.euler17;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import ca.davidgrant.euler17.IntegerToString;

public class IntegerToStringTest {
    private IntegerToString euler17;

    @Before
    public void setup() {
        euler17 = new IntegerToString();
    }
    
    @Test
    public void one() {
        assertThat(euler17.convert(1), is("one"));
    }
    
    @Test
    public void two() {
        assertThat(euler17.convert(2), is("two"));
    }
    
    @Test
    public void three() {
        assertThat(euler17.convert(3), is("three"));
    }
    
    @Test
    public void four() {
        assertThat(euler17.convert(4), is("four"));
    }
    
    @Test
    public void five() {
        assertThat(euler17.convert(5), is("five"));
    }
    
    @Test
    public void six() {
        assertThat(euler17.convert(6), is("six"));
    }
    
    @Test
    public void seven() {
        assertThat(euler17.convert(7), is("seven"));
    }
    
    @Test
    public void eight() {
        assertThat(euler17.convert(8), is("eight"));
    }
    
    @Test
    public void nine() {
        assertThat(euler17.convert(9), is("nine"));
    }
    
    @Test
    public void ten() {
        assertThat(euler17.convert(10), is("ten"));
    }
    
    @Test
    public void eleven() {
        assertThat(euler17.convert(11), is("eleven"));
    }
    
    @Test
    public void twelve() {
        assertThat(euler17.convert(12), is("twelve"));
    }
    
    @Test
    public void thirteen() {
        assertThat(euler17.convert(13), is("thirteen"));
    }
    
    @Test
    public void fourteen() {
        assertThat(euler17.convert(14), is("fourteen"));
    }
    
    @Test
    public void fifteen() {
        assertThat(euler17.convert(15), is("fifteen"));
    }
    
    @Test
    public void sixteen() {
        assertThat(euler17.convert(16), is("sixteen"));
    }
    
    @Test
    public void seventeen() {
        assertThat(euler17.convert(17), is("seventeen"));
    }
    
    @Test
    public void eighteen() {
        assertThat(euler17.convert(18), is("eighteen"));
    }
    
    @Test
    public void nineteen() {
        assertThat(euler17.convert(19), is("nineteen"));
    }
    
    @Test
    public void twenty() {
        assertThat(euler17.convert(20), is("twenty"));
    }
    
    @Test
    public void twenty_one() {
        assertThat(euler17.convert(21), is("twenty-one"));
    }
    
    @Test
    public void twenty_two() {
        assertThat(euler17.convert(22), is("twenty-two"));
    }
    
    @Test
    public void thirty() {
        assertThat(euler17.convert(30), is("thirty"));
    }
    
    @Test
    public void thirty_one() {
        assertThat(euler17.convert(31), is("thirty-one"));
    }

    @Test
    public void forty() {
        assertThat(euler17.convert(40), is("forty"));
    }
    
    @Test
    public void forty_one() {
        assertThat(euler17.convert(41), is("forty-one"));
    }
    
    @Test
    public void fifty() {
    	assertThat(euler17.convert(50), is("fifty"));
    }
    
    @Test
    public void sixty() {
    	assertThat(euler17.convert(60), is("sixty"));
    }
    
    @Test
    public void seventy() {
    	assertThat(euler17.convert(70), is("seventy"));
    }
    
    @Test
    public void eighty() {
    	assertThat(euler17.convert(80), is("eighty"));
    }
    
    @Test
    public void ninety() {
    	assertThat(euler17.convert(90), is("ninety"));
    }
    
    @Test
    public void ninety_nine() {
    	assertThat(euler17.convert(99), is("ninety-nine"));
    }
    
    @Test
    public void one_hundred() {
    	assertThat(euler17.convert(100), is("one hundred"));
    }
    
    @Test
    public void one_hundred_and_one() {
    	assertThat(euler17.convert(101), is("one hundred and one"));
    }
    
    @Test
    public void one_hundred_and_eleven() {
    	assertThat(euler17.convert(111), is("one hundred and eleven"));
    }
    
    @Test
    public void one_hundred_and_ninety_nine() {
    	assertThat(euler17.convert(199), is("one hundred and ninety-nine"));
    }
    
    @Test
    public void two_hundred() {
    	assertThat(euler17.convert(200), is("two hundred"));
    }
    
    @Test
    public void two_hundred_and_one() {
    	assertThat(euler17.convert(201), is("two hundred and one"));
    }
    
    @Test
    public void two_hundred_and_fifty() {
    	assertThat(euler17.convert(250), is("two hundred and fifty"));
    }
    
    @Test
    public void three_hundred() {
    	assertThat(euler17.convert(300), is("three hundred"));
    }
    
    @Test
    public void nine_hundred_and_ninety_nine() {
    	assertThat(euler17.convert(999), is("nine hundred and ninety-nine"));
    }
    
    @Test
    public void one_thousand() {
    	assertThat(euler17.convert(1000), is("one thousand"));
    }
}
