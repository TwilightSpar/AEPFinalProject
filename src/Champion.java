public class Champion implements CanSumUpAbility{

    String name;
    int additionHealth;
    int additionArmor;
    int additionAD;
    int additionAP;
    int additionMove;
    ChampionType type;

    public Champion(String name, int additionHealth, int additionArmor, int additionAD, int additionAP, int additionMove, ChampionType type) {
        this.name = name;
        this.additionHealth  = additionHealth;
        this.additionArmor   = additionArmor;
        this.additionAD      = additionAD;
        this.additionAP      = additionAP;
        this.additionMove    = additionMove;
        this.type            = type;
    }

    public int ability(){
        return this.additionHealth+
                this.additionArmor+
                this.additionAD+
                this.additionAP+
                this.additionMove;
    }

    public boolean canKill(Champion other) {
        return (this.ability() - other.ability() + this.type.difference(other.type)) > 0;
    }

}
