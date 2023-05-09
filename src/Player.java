public class Player {
    private String name;
    private String move;
    private int point;

    public Player(String name) {
        this.name = name;
        this.move = "";
        this.point = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    public void makeMove(String move1) {
        setMove(move1.toLowerCase());
    }

    public String makeRandomMove() {
        String[] moves = {"rock", "paper", "scissors"};
        int randomNumber = (int) (Math.random() * moves.length);
        return moves[randomNumber];
    }
}
