import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        int k =15;
        Nut[] mas = tree.growNut(k);
        int sumNut=0;
        System.out.println("На дереве выросло "+k+" орехов");
        System.out.println(Arrays.toString(mas));
        sumNut = Squirrel.PickingNuts(mas,sumNut);
        //double sum = IntStream.of(mas).sum();//неработает
        System.out.println("Радостная белка насобирала вес орехов: "+sumNut*12.5);
    }

}