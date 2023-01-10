public class Zadanie2 extends Exception {
    public Zadanie2(final String message) {
        super(message);
    }

    public Zadanie2() {
        try {
            throw new Zadanie2("Ошибка!");
        } catch (Zadanie2 e) {
            System.out.println(e.getMessage());
        }
    }
}

