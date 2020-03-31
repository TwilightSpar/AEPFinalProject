import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChampionTypeTest {
    @Test
    public void TANKShouldHaveMoreHealthThanWARRIOR() throws Exception{
        assertEquals(true, ChampionType.TANK.hasMoreHealthThan(ChampionType.WARRIOR));
    }

    @Test(expected = IllegalArgumentException.class)
    public void CompareWARRIORWithADCWillThrowException() throws Exception{
        assertEquals(true, ChampionType.WARRIOR.hasMoreHealthThan(ChampionType.ADC));
    }

}
