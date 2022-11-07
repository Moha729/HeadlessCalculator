package calculatorTest;

import calculator.Calculator;
import calculator.NumberSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class CalculatorTest {

    @Mock
    private NumberSource numberSource;
    private Calculator calculator;

/*
    @BeforeAll
    public  void beforeAll(){
    }
*/

    @BeforeEach
    public void beforeEach(){
        openMocks(this);
        calculator = new Calculator(numberSource);

    }

    @ParameterizedTest
    @ValueSource(longs = {1L, 10L, 100L, Long.MAX_VALUE})
    public void calculator_Multiply_PositiveAndPositive_ReturnsPositive(){

        //Arrange
        when(numberSource.next()).thenReturn(10L, 10L);

        //Act
        long result = calculator.multiply();

        //Assert
        assertTrue(result > 0);

    }
}
