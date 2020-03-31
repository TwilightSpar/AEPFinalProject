import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChampionTest {
    @Test
    public void RIVENCanKillVN() throws Exception{
        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);
        var VN = new Champion("VN", -1, 0, 1, -1, 2, ChampionType.ADC);
        assertEquals(true, riven.canKill(VN));
    }
}
