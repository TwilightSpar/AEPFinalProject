public class Player implements CanSumUpAbility {

    String name;
    int additionHealth;
    int additionArmor;
    int additionAD;
    int additionAP;
    int additionMove;
    Champion mayorChampion;
    private  Player(String name, int additionHealth, int additionArmor, int additionAD, int additionAP, int additionMove, Champion mayorChampion) {
        this.name = name;
        this.additionHealth  = additionHealth;
        this.additionArmor   = additionArmor;
        this.additionAD      = additionAD;
        this.additionAP      = additionAP;
        this.additionMove    = additionMove;
        this.mayorChampion   = mayorChampion;
    }

    public static Player createPlayer(String name, int additionHealth, int additionArmor, int additionAD, int additionAP, int additionMove, Champion mayorChampion) {
        return new Player(name, additionHealth, additionArmor, additionAD, additionAP, additionMove, mayorChampion);
    }

    public int ability(){
        return this.additionHealth+
                this.additionArmor+
                this.additionAD+
                this.additionAP+
                this.additionMove;
    }

    public boolean isBetterThan(Player other) throws IllegalArgumentException {
        if (!other.mayorChampion.name.equals(this.mayorChampion.name))
            throw new IllegalArgumentException("Cannot compare player who plays " + this.mayorChampion.name + " to others who plays " + other.mayorChampion.name);
        return this.ability() > other.ability();
    }

    @Override
    public boolean equals(Object other) {
        if(other == this) return true;
        else if(!(other instanceof Player)) return false;
        return  (this.additionHealth  == ((Player) other).additionHealth) &&
                (this.additionArmor  == ((Player) other).additionArmor) &&
                (this.additionAD     == ((Player) other).additionAD) &&
                (this.additionAP == ((Player) other).additionAP) &&
                (this.additionMove   == ((Player) other).additionMove) &&
                (this.mayorChampion.name == ((Player) other).mayorChampion.name);
    }
}
