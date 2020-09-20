package perfect.storms.lesson9;

public class Exception {
/*
Answer

1. I think catch (java.io.IOException e){}; - Because as far as I remember, there is no such exception in the tree as OutputStreamException and OutputException.
And point 4.

2. 12. - try { y += x; - we add 5 to 8 = 13
if(x<=5) throw new Exception(); - since the condition is true, we throw an Exception.
In the catch block, we handle the exception and decrease the value of y -1.

3. 14 - count += x; - we assign the value 12.
count += mexcept(count); - we catch the Execution and we are immediately thrown into the code block catch.
There we decrease the count value by -1 and and the finally block is executed in any case where we assign the count to +3.

4. There are no correct points.

5. Point one.
*/

    @Override
    public String toString() {
        return "Exception{}";
    }
}
