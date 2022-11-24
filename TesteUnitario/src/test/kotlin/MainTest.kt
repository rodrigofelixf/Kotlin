import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class MainTest {

    @DisplayName("Teste metodo xxoo")
    @Test
    fun testeCountXO() {
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xXOo"))},
            {Assertions.assertTrue(countXO("XxoO"))},
            
        )
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }
}