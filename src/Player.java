public class Player {

    String name;
    int additionHealth;
    int additionArmor;
    int additionAD;
    int additionAP;
    int additionMove;
    Champion mayorChampion;
    public Player(String name, int additionHealth, int additionArmor, int additionAD, int additionAP, int additionMove, Champion mayorChampion) {
        this.name = name;
        this.additionHealth  = additionHealth;
        this.additionArmor   = additionArmor;
        this.additionAD      = additionAD;
        this.additionAP      = additionAP;
        this.additionMove    = additionMove;
        this.mayorChampion   = mayorChampion;
    }

    public int ability(){
        return this.additionHealth+
                this.additionArmor+
                this.additionAD+
                this.additionAP+
                this.additionMove;
    }

    public boolean isBetterThan(Player other) {
//        if (!other.mayorChampion.name.equals(this.mayorChampion.name))
//            throw new IllegalArgumentException("Cannot compare player who plays " + this.mayorChampion.name + " to others who plays " + other.mayorChampion.name);
//
        return this.ability() > other.ability();
    }
}
