public class LuckyNumber extends Game{
    private int min_number;
    private int max_number;
    private int lucky_number;

    public LuckyNumber (String name, int bet, int min_number, int max_number, int lucky_number) {
        super(name, bet);
        this.min_number = min_number;
        this.max_number = max_number;
        this.lucky_number = lucky_number;
    }

    public int getMin_number() {
        return min_number;
    }

    public void setMin_number(int min_number) {
        this.min_number = min_number;
    }

    public int getMax_number() {
        return max_number;
    }

    public void setMax_number(int max_number) {
        this.max_number = max_number;
    }

    public int getLucky_number() {
        return lucky_number;
    }

    public void setLucky_number(int lucky_number) {
        this.lucky_number = lucky_number;
    }
}
