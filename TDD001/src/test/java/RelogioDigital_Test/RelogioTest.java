package RelogioDigital_Test;

import RelogioDigital.Relogio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelogioTest {
    @Test
    public void testProgramarRelogio() {
        Relogio relogio = new Relogio();
        relogio.programarHorario(10,00,00);

        assertEquals("10:00:00", relogio.obterHorario());

    }
}
