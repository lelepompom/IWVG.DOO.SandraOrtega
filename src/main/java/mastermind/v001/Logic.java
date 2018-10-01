package mastermind.v001;

import mastermind.v001.controllers.ContinueController;
import mastermind.v001.controllers.StartController;

public class Logic {

    public StartController startController = new StartController();
    public ContinueController continueController = new ContinueController();

    public void initGame(){
        this.startController.startController();
    }

    public void continueGame(){
        this.continueController.continueController();
    }
}
