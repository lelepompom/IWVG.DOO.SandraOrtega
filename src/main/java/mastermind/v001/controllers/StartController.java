package mastermind.v001.controllers;

import mastermind.v001.Logic;
import mastermind.v001.models.Key;
import mastermind.v001.utils.StartDialog;

public class StartController {

    public Key secretKey = new Key();
    public GenerateSecretKey generateSecretKey ;

    public void startController(){
        generateSecretKey = new GenerateSecretKey(this.secretKey);
        generateSecretKey.setSecretKey(this.secretKey);
        new StartDialog("Clave secreta generada", this.secretKey.getSecretKey()).read();
        new Logic().continueGame();
    }
}
