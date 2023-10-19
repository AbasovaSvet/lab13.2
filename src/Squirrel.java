public class Squirrel { //белка
    public static int PickingNuts(Nut[] massNut, int rezz) {
        for (int i = 0; i < massNut.length; i++) {
            rezz++;
            System.out.println("ура, еще орех!");
        }
        return rezz;
    }
}
