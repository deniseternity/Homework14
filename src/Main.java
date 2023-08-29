public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Griffindor(1, 2, 3, 4,5 ), //"Harry"
                new Griffindor(1, 2, 2, 4,5 ), // "German"
                new Griffindor(1, 1, 3, 1,3 ), // "Ron"
                new Griffindor(4, 5, 5, 4,5 ), // "Lin"
        };

        for (int i = 0; i < hogwarts.length; i++) {
            for (int j = i + 1; j < hogwarts.length - 1; j++) {
                    hogwarts[i].compare(hogwarts[j]);
                }
            }

        Griffindor harry = (Griffindor) hogwarts[0];
        Griffindor germ = (Griffindor) hogwarts[1];

        harry.compare(germ);
        }
    }
