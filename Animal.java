import java .util.ArrayList;
import java.util.Collections;

public class Animal {

    public Animal Hewan() {
        ArrayList<String> Hewan = new ArrayList<>();

        Hewan.add("Angsa");
        Hewan.add("Bebek");
        Hewan.add("Cicak");
        Hewan.add("Domba");
        Hewan.add("Elang");
        Hewan.add("Gajah");
        System.out.println("\nOutput : \n" + Hewan);

        ArrayList<String> temp = new ArrayList<>();

        temp.add("Badak");
        temp.add("Bebek");
        Hewan.addAll(temp);
        System.out.println("\nOutput : \n" + Hewan);

        System.out.println("Bebek = " + Collections.frequency(Hewan, "Bebek"));
        System.out.println("Posisi Index : " + Hewan.indexOf("Bebek") + "," + Hewan.lastIndexOf("Bebek"));

        Hewan.remove(1);
        System.out.println("\nOutput : \n" + Hewan);

        System.out.println("Index ke-0 : " + Hewan.get(0) + "Index ke-2 : " + Hewan.get(2));
        Hewan.remove(0);
        System.out.println("\nOutput : \n" + Hewan);

        Hewan.set(0, "Ular");
        Hewan.add(2, "Itik");
        System.out.println("\nOutput : \n" + Hewan);

        Hewan.remove(2);
        Hewan.remove(3);
        Hewan.remove(4);
        System.out.println("\nOutput : \n" + Hewan);

        System.out.println("Elemen Pertama : " + Hewan.get(0) + "\nElemen Terakhir : " + Hewan.get(3));

        System.out.println("\nJumlah ArrayList : " + Hewan.size());
        System.out.println("Index dari Badak : " + Hewan.indexOf("Badak"));
        return null;
    }

        public static void main(String[] args) {
            Animal hewan = new Animal();
            hewan.Hewan();
        }
    }




