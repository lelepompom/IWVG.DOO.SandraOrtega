package mastermind.v001.controllers;

import mastermind.v001.models.Key;
import mastermind.v001.views.console.GeneratePlayedKey;

public class ContinueController {

    public Key playedKey = new Key();
    public GeneratePlayedKey generatePlayedKey;

    public void continueController(){
        generatePlayedKey = new GeneratePlayedKey();

    }
}
