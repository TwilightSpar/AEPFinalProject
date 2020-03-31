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

    public boolean canKill(Champion other) {
        int[] typeDifference = this.type.difference(other.type);
        int[] championDiffernece = new int[5];
        championDiffernece[0] = additionHealth  - additionHealth;
        championDiffernece[1] = this.additionArmor   - additionArmor;
        championDiffernece[2] = this.additionAD      - additionAD;
        championDiffernece[3] = this.additionAP      - additionAP;
        championDiffernece[4] = this.additionMove    - additionMove;

        int totalDifference = 0;
        for(int i = 0; i < typeDifference.length; i++)
            totalDifference += typeDifference[i] + championDiffernece[i];

        return totalDifference > 0;
    }

}
