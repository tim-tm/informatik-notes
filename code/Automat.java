public class Automat {
    private int zustand;

    public boolean isValid(String word) {
        zustand = 0;

        char[] arr = word.toCharArray();
        for (char c : arr) {
            switch (zustand) {
                case 0: {
                    if (c == '4') {
                        zustand = 1;
                    }
                    break;
                }
                case 1: {
                    if (c == '2') {
                        zustand = 2;
                    }
                    break;
                }
            }
        }

        return zustand == 2;
    }

    public int getZustand() {
        return zustand;
    }

    public static void main(String[] args) {
        Automat a = new Automat();
        System.out.println(a.isValid("42"));
        System.out.println(a.isValid("43"));
    }
}