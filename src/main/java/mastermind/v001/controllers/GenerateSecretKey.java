package mastermind.v001.controllers;

import mastermind.v001.models.Colors;
import mastermind.v001.models.Key;

public class GenerateSecretKey {
    public Key secretKey;
    public GenerateSecretKey(Key secretKey){
        this.secretKey = secretKey;
    }

    public Colors generateToken(){
        int random1to4 = (int)(Math.random()*6)+1;
        Colors token;
        switch(random1to4){
            case 1:
                token = Colors.A;
                break;
            case 2:
                token = Colors.R;
                break;
            case 3:
                token = Colors.V;
                break;
            case 4:
                token = Colors.Z;
                break;
            case 5:
                token = Colors.B;
                break;
            case 6:
                token = Colors.N;
                break;
            default:
                token = Colors.R;
        }
        return token;
    }

    public void setSecretKey(Key secretKey){
        for (int i=0; i<4; i++){
            secretKey.setTokenAt(this.generateToken(), i);
        }
    }
}
