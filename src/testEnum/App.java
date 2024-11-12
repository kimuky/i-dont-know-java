package testEnum;

public class App {
    public static void main(String[] args) {
        final Poker poker = Poker.test(9);

        switch (poker) {
            case CLOVER -> System.out.println("클로바");
            case SPADE -> System.out.println("쓰페이드");
            case HEART -> System.out.println("하트");
            case DIAMOND -> System.out.println("다이아");
            default -> System.out.println("암것도아님");
        }
    }
}
