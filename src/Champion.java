public class Champion {

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

//    public boolean canKill(Champion other) {
//        this.type.
//    }

}
