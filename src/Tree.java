public class Tree { //дерево
    public Nut[] growNut(int k){
        Nut[] massNut = new Nut[k];
        for (int i = 0; i < k; i++) {
        massNut[i] = new Nut();}
        return massNut;
    }
}
