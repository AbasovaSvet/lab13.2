public class Tree { //дерево

    Nut nut = new Nut();
    int col = 15;
    public Nut[] growNut(int k){
        Nut[] massNut = new Nut[col];
        massNut[k] = new Nut();
        return massNut;
    }
}
