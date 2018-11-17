public class Monster {
    private int attack;
    private int def;
    private String name;
    private int hp;

    //Jezeli nie zapiszemy zadnego konstruktora recznie
    //tworzony jest konstruktor domyslny
//    public Monster() {
//
//    }

    Monster(int attack, int def, String name){
        this(attack, def, name, 0);
    }

    Monster(int attack, int def, String name, int hp){
        this.attack = attack;
        this.def = def;
        this.name = name;
        this.hp = hp;
    }

    void tryAttack(Monster who){
        who.hp = who.hp - attack;
        System.out.println("Atakuje " + who.name + " za " + attack + " puntków");
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
