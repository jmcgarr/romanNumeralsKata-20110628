package kata

class RomanNumeralConverter
{
    def map = [ 1:"I", 
                4:"IV",
                5:"V",
                9:"IX",
                10:"X",
                40:"XL",
                50:"L",
                90:"XC",
                100:"C",
                400:"CD",
                500:"D",
                900:"CM",
                1000:"M"]
    
    String convert (int numeral)
    {
        def builder = new StringBuilder()
        convert(numeral, builder)
        builder.toString()
    }
    
    /**
     * Refactored algortihm
     * @param numeral
     * @param builder
     */
    void convert(int numeral, StringBuilder builder) {
        def keys = map.keySet().sort{a,b -> b <=> a}
        for (k in keys ){ 
            if (numeral >= k) {
                builder.append map.get(k)
                convert(numeral - k, builder)
                return
            }
        }
    }
    
    /**
     * Previous algorithm before refactoring
     */
    void convertOld(int numeral, StringBuilder builder) {
        if (numeral >= 100) {
            builder.append "C"
            convert(numeral - 100, builder)
        }
        else if (numeral >= 90) {
            builder.append "XC"
            convert(numeral -90, builder)
        }
        else if (numeral >= 50) {
            builder.append "L"
            convert(numeral - 50, builder)
        }
        else if (numeral >= 40)
        {
            builder.append("XL")
            convert(numeral - 40, builder)
        }
        else if (numeral == 9) {
            builder.append("IX")
        }
        else if( numeral >= 10) {
            builder.append "X"
            convert(numeral -10, builder)
        }
        else if( numeral == 4 ) {
            builder.append "IV"
        }
        else if( numeral >= 5) {
            builder.append "V"
            convert(numeral -5, builder)
        } else if(numeral > 0){
            builder.append "I"
            convert(numeral - 1, builder)
        }
    }
}
