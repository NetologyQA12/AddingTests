public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 5 : 1;
        long bonus = amount * percent / 100;
        long limit = 1500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
