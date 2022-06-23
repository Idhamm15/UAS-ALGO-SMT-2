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

}
