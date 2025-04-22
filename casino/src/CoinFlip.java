public class CoinFlip extends Game {
    private int side;

    public CoinFlip (String name, int bet, int side) {
        super(name, bet);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
