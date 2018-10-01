package mastermind.v001;

public class Mastermind {

    private Logic logic;

    public Mastermind(Logic logic) {
        this.logic = logic;
    }


    public void play(){
        this.logic.initGame();
    }

    public static void main(String[] args) {
        new Mastermind(new Logic()).play();
    }
}
