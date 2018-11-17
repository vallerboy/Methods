package task1mem;

public class Main {
    public static void main(String[] args) {
        Mem mem1 = new Mem("Image1", "asd", "asd", true);
        Mem mem2 = new Mem("Image2", "asd", "asd", false);
        Mem mem3 = new Mem("Image3", "asd", "asd", true);

        Mem[] mems = {mem1, mem2, mem3};

        for (Mem mem : mems) {
            if(mem.isFavourite()){
                System.out.println(mem.getName());
            }
        }
    }
}
