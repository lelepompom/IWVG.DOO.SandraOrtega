package mastermind.v001.models;

public class Key {
    public Colors[] key ;
    public Key() {
        key = new Colors[4];
    }

    public void setTokenAt(Colors token, Integer position){
        key[position] = token;
    }

    public String getKey(){
        return ""+this.key[0]+this.key[1]+this.key[2]+this.key[3];
    }

    public String getSecretKey(){
        return "****";
    }
}
