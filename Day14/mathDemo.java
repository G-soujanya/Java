class mathDemo 
{
    public static void main(String args[])
    {
        System.out.println("Absolute: ");
        System.out.println(Math.abs(-123));
        System.out.println("strict absolute");
        System.out.println(StrictMath.abs(-123));
        System.out.println("cube root ");
        System.out.println(Math.cbrt(9));
        System.out.println("Excact decrement");
        System.out.println(Math.decrementExact(7));
        System.out.println("exponent in floating");
        System.out.println(Math.getExponent(12.3456));
        System.out.println("convert to radians");
        System.out.println(Math.toRadians(90));
        System.out.println("Round Division");
        System.out.println(Math.floorDiv(5,9));
        System.out.println("e power ofx");
        System.out.println(Math.exp(1));
        System.out.println("e power ofx");
        System.out.println(StrictMath.exp(1));
        System.out.println("Log base 10:");
        System.out.println(Math.log10(100));
        System.out.println("maximum");
        System.out.println(Math.max(100,50));
        System.out.println("tan");
        System.out.println(Math.tan(45*Math.PI/180));
        System.out.println("convert t radius");
        System.out.println(Math.toRadians(90));

        System.out.println("convert to degree");
        System.out.println(Math.toDegrees(Math.tanh(1)));

        System.out.println("convert to degrees");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

        System.out.println("randm");
        System.out.println(Math.random()*1000);

        System.out.println("exact prodyct");
        System.out.println(Math.multiplyExact(100, 200));//if product is beyond the range of integer then do not oveflow it it throw arthmetic exeption
        System.out.println("next float value");
        System.out.println(Math.nextAfter(12.5,11));//if seccond one 13 the it goup else down of just after it
    }    
}
