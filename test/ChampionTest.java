import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChampionTest {
    @Test
    public void RIVENCanKillVN() {
        var riven = new Champion("riven", 0, 1, 2, -1, 3, ChampionType.WARRIOR);
        var VN = new Champion("VN", -1, 0, 1, -1, 2, ChampionType.ADC);
        assertEquals(true, riven.canKill(VN));
    }

    @Test
    public void TankCanKillSOFTSUPPORT() {
        var malphite = new Champion("malphite", 2, 3, 0, 2, -1, ChampionType.TANK);
        var janna = new Champion("janna", -1, 0, 0, 1, 3, ChampionType.SOFTSUPPORT);
        assertEquals(true, malphite.canKill(janna));
    }
}
