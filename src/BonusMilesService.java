public class BonusMilesService {
    int bonus;

    public int calculate(int cost) {
        bonus = cost / 20;
        return bonus;
    }
}
