package kata

import org.junit.Before
import org.junit.Test

class RomanNumeralConverterTest
{
    def converter

    @Before
    void setUp() {
        converter = new RomanNumeralConverter()
    }
    
    @Test
    void convertToOne()
    {
        def result = converter.convert(1)
        assert result == "I"
    }
    
    @Test
    void convertTwo()
    {
        def result = converter.convert(2)
        assert result == "II"
    }
    
    @Test
    void convertThree()
    {
        def result = converter.convert(3)
        assert result == "III"
    }
    
    @Test
    void convertFour()
    {
        def result = converter.convert(4)
        assert result == "IV"
    }
    
    @Test
    void convertFive()
    {
        def result = converter.convert(5)
        assert result == "V"
    }
    
    @Test
    void convertSix()
    {
        def result = converter.convert(6)
        assert result == "VI"
    }
    
    @Test 
    void convertSeven()
    {
        def result = converter.convert(7)
        assert result == "VII"
    }
    
    @Test
    void convertNine() {
        def result = converter.convert(9)
        assert result == "IX"
    }
    
    @Test
    void convertTen() {
        def result = converter.convert(10)
        assert result == "X"
    }
    
    @Test
    void convertEleven() {
        def result = converter.convert(11)
        assert result == "XI"
    }
    
    @Test 
    void convertFourteen() {
        def result = converter.convert(14)
        assert result == "XIV"
    }
    
    @Test
    void convertEighteen() {
        def result = converter.convert(18)
        assert result == "XVIII"
    }
    
    @Test
    void convertFortyThree() {
        def result = converter.convert(43)
        assert result == "XLIII"
    }
    
    @Test
    void convertSixtyNine()
    {
        def result = converter.convert(69)
        assert result == "LXIX"
    }
    
    @Test
    void convertNinetFour()
    {
        def result = converter.convert(94)
        assert result == "XCIV"
        
    }
    
    @Test
    void convertOneHundredThirtySeven() {
        def result = converter.convert(137)
        assert result == "CXXXVII"
    }
    
    @Test 
    void convert499()
    {
        def result = converter.convert(499)
        assert result == "CDXCIX"
    }
    
    @Test 
    void convert562()
    {
        def result = converter.convert(562)
        assert result == "DLXII" 
    }
    
    @Test
    void convert1999()
    {
        def result = converter.convert(1999)
        assert result == "MCMXCIX"
    }
    
    @Test
    void convert2011()
    {
        def result = converter.convert(2011)
        assert result == "MMXI"
    }
}
