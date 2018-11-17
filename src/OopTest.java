public class OopTest {
    public static void main(String[] args) {
        Monster monster = new Monster(10, 2, "Ork");
        Monster monster1 = new Monster(30, 5, "Elf");
        Monster monster2 = new Monster(35, 5, "Mag", 10);

        monster1.tryAttack(monster2);

        System.out.println(monster2);
    }
}
