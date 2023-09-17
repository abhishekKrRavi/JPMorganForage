public class RewardValue {
    double cashValue;
    double milesValue;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    RewardValue(float milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        milesValue = (float) (cashValue / 0.0035);
        return milesValue;
    }


}
