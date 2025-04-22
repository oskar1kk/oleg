public class SlotMachine extends Game {
    private int win_probability;
    private int reel_count;

    public SlotMachine(String name, int bet, int win_probability, int reel_count) {
        super(name, bet);
        this.win_probability = win_probability;
        this.reel_count = reel_count;
    }

    public int getWin_probability() {
        return win_probability;
    }

    public void setWin_probability(int win_probability) {
        this.win_probability = win_probability;
    }

    public int getReel_count() {
        return reel_count;
    }

    public void setReel_count(int reel_count) {
        this.reel_count = reel_count;
    }
}

