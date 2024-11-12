package testEnum;

public enum Poker {
    HEART(10), DIAMOND(9), CLOVER(8), SPADE(7);

    private final int value;

    Poker(int value) {
        this.value =value;
    }

    public int getValue() {
        return value;
    }

    public static Poker test(int i) {
        for(Poker poker : Poker.values()) {
            if (poker.getValue() == i) {
                return poker;
            }
        }
        throw new  IllegalArgumentException();
    }

}
