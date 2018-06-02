package exercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest{

    @Test
    fun reverseUsingSB(){
        Assert.assertEquals("bs_niltok",reverseUsingSB("kotlin_sb"))
    }
    @Test fun reverseUsingLoop(){
        Assert.assertEquals("pool_niltok",reverseUsingLoop("kotlin_loop"))
    }
}