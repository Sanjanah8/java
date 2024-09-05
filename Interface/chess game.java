// ChessPiece interface
interface ChessPiece {
    void move();
    void capture();
}

// King class
class King implements ChessPiece {
    @Override
    public void move() {
        System.out.println("King moves one square in any direction.");
    }

    @Override
    public void capture() {
        System.out.println("King captures one square in any direction.");
    }
}

// Queen class
class Queen implements ChessPiece {
    @Override
    public void move() {
        System.out.println("Queen moves any number of squares in any direction.");
    }

    @Override
    public void capture() {
        System.out.println("Queen captures any piece in any direction.");
    }
}

// Knight class
class Knight implements ChessPiece {
    @Override
    public void move() {
        System.out.println("Knight moves in an L-shape (two squares in one direction, then one perpendicular).");
    }

    @Override
    public void capture() {
        System.out.println("Knight captures by landing on an enemy piece in its L-shape movement.");
    }
}

// Main class
public class ChessGame {
    public static void main(String[] args) {
        ChessPiece king = new King();
        ChessPiece queen = new Queen();
        ChessPiece knight = new Knight();

        king.move();
        queen.move();
        knight.capture();
    }
}
