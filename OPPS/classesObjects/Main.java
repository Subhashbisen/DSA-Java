package OPPS.classesObjects;

public class Main {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();
    }

}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up , down , left , right, diagonal (in All 4 dirns");
    }
}

class Rook implements Chessplayer {
    public void moves() {
        System.out.println("up , down , left , right,");
    }
}

class King implements Chessplayer {
    public void moves() {
        System.out.println("up , down , left , right, diagonal - (by 1 step)");
    }
}
