// understand champion type from game LOL.
public enum ChampionType {

    WARRIOR(3, 3, 4, 1, 5, Position.TOP),
    TANK(5, 5, 3, 2, 2, Position.TOP),
    ADC(1, 1, 5, 1, 3, Position.BOT),
    SOFTSUPPORT(1, 1, 2, 4, 5, Position.SUP)
    ;

    private enum Position { BOT("bottom"), SUP("support"), MID("mid"), JUNGLE("jungle"), TOP("top");
        String position;
        Position(String pos){
            this.position = pos;
        }
        @Override
        public String toString() {
            return position;
        }
    }

    private final int health;
    private final int armor;
    private final int ad;
    private final int ap;
    private final int movement;
    private final Position position;

    ChampionType(int health, int armor, int ad, int ap, int movement, Position usualPostion) {
        this.health = health;
        this.armor = armor;
        this.ad = ad;
        this.ap = ap;
        this.movement = movement;
        this.position = usualPostion;
    }

    public boolean hasMoreHealthThan(ChampionType other) throws Exception {
        if (other.position != this.position)
            throw new IllegalArgumentException("Cannot compare " + this.position + " to " + other.position);
        return this.health > other.health;
    }

    public boolean hasMoreDamageThan(ChampionType other) {
        return (this.ad+this.ap) > (other.ad+other.ap);
    }
    public int[] difference(ChampionType other){
        int[] diff = new int[5];
        diff[0] = this.health - other.health;
        diff[1] = this.armor - other.armor;
        diff[2] = this.ad - other.ad;
        diff[3] = this.ap - other.ap;
        diff[4] = this.movement - other.movement;
        return diff;
    }
}