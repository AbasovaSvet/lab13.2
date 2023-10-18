public class Nut { //орех
    double wt;

    @Override
    public String toString() {
        return "Nut{" +
                "wt=" + wt +
                '}';
    }

    public Nut(){
        wt= 12.5; //вес ореха
    }
}
