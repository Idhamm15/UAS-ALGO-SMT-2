package JawabanNo3;

public class PokemonGo {
    private String bug;
    private String dark;
    private String dragon;
    private String electrik;
    private String fairy;
    private String fighting;
    private String flying;
    private String ghost;

    public PokemonGo (String Bug, String Dark, String Dragon, String Elektrik, String Fairy, String Fighting, String Flying, String Ghost) {
        this.bug = Bug;
        this.dark = Dark;
        this.dragon = Dragon;
        this.electrik = Elektrik;
        this.fairy = Fairy;
        this.fighting = Fighting;
        this.flying = Flying;
        this.ghost = Ghost;
    }

    public String getBug(){
        return this.bug;
    }
    public void setBug(String bug) {
        this.bug = bug;
    }

    public String getDark(){
        return this.dark;
    }
    public void setDark(String dark) {
        this.bug = dark;
    }

    public String getDragon(){
        return this.dragon;
    }
    public void setDragon(String dragon) {
        this.dragon = dragon;
    }

    public String getElectrik(){
        return this.electrik;
    }
    public void setElectrik(String electrik) {
        this.electrik = electrik;
    }

    public String getFairy(){
        return this.fairy;
    }
    public void setFairy(String fairy) {
        this.fairy = fairy;
    }

    public String getFighting(){
        return this.fighting;
    }
    public void setFighting(String fighting) {
        this.fighting = fighting;
    }

    public String getFlying(){
        return this.flying;
    }
    public void setFlying(String flying) {
        this.flying = flying;
    }

    public String getGhost(){
        return this.ghost;
    }
    public void setGhost(String ghost) {
        this.ghost = ghost;
    }

}
