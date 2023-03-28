import java.util.*;

/**
 * Kegiatan1
 * author: Alvin Suwarno Putra
 */

public class kegiatan1 {

    static ArrayList<String> hewan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        hewan.add("angsa");
        hewan.add("bebek");
        hewan.add("cicak");
        hewan.add("domba");
        hewan.add("elang");
        hewan.add("gajah");

        while (true) {
            System.out.println("Pilih gan: ");
            String in = input.nextLine().toUpperCase();
            Pilih option;

            try {
                option = Pilih.valueOf(in);
                switch (option) {
                    case TAMBAH:
                        tambah();
                        break;
                    case BACA:
                        baca();
                        break;
                    case BACAINDEX:
                        bacaIndex();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case DELETE:
                        delete();
                        break;
                    case DELETELANGSUNG:
                        deleteLangsung();
                        break;
                    case LASTCALL:
                        lastCall();
                        break;
                    case KELUAR:
                        System.exit(0);
                    default:
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }

    }

    enum Pilih {
        TAMBAH,
        BACA,
        BACAINDEX,
        UPDATE,
        DELETE,
        DELETELANGSUNG,
        LASTCALL,
        KELUAR;
    }

    public static void tambah() {
        System.out.println("Masukkan Hewan yang ingin ditambah: ");
        hewan.add(input.nextLine());
        System.out.println(hewan);
    }

    public static void baca() {
        System.out.println("Masukkan Hewan yang ingin dicari jumlahnya: ");
        String animal = input.nextLine();
        int occurrences = Collections.frequency(hewan, animal);
        System.out.println("Jumlah hewan " + animal + " : " + occurrences);

        System.out.println("Hewan yang ingin dicari indexnya: ");
        animal = input.nextLine();

        ArrayList<Integer> indexAnimal = new ArrayList<Integer>();
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).compareTo(animal) == 0) {
                indexAnimal.add(i);
            }
        }
        System.out.print(indexAnimal);
        System.out.println();

    }

    public static void bacaIndex() {
        System.out.println("Cari index ke berapa: ");
        int index = input.nextInt();

        if (index < 0 || index >= hewan.size()) {
            System.out.println("gaada");
        } else {
            String nama = hewan.get(index);
            System.out.print("Nama hewan dari index ke-" + index + " : " + nama);
            System.out.println();
        }
    }

    public static void update() {
        int index;
        String animal;
        System.out.println("Masukkan index yang ingin di update: ");
        index = input.nextInt();
        System.out.println("Masukkan nama Hewan yang ingin ditambah: ");
        animal = input.next();
        hewan.set(index, animal);
        System.out.print(hewan);
        System.out.println();
        System.out.println("\nMasukkan index yang ingin di update: ");
        index = input.nextInt();
        System.out.println("Masukkan nama Hewan yang ingin ditambah: ");
        animal = input.next();
        hewan.add(index, animal);
        System.out.print(hewan);
        System.out.println();
    }

    public static void delete() {
        System.out.println("Masukkan index yang ingin dihapus: ");
        int index = input.nextInt();
        hewan.remove(index);
        System.out.print(hewan);
        System.out.println();
    }

    public static void deleteLangsung() {
        System.out.println("Masukkan index yang ingin dihapus dari index: ");
        int fromIndex = input.nextInt();
        System.out.println("ke index: ");
        int toIndex = input.nextInt();
        hewan.subList(fromIndex, toIndex).clear();
        System.out.println(hewan);
    }

    public static void lastCall() {
        System.out.println("elemen pertama: " + hewan.get(0));
        System.out.println("elemen terakhir: " + hewan.get(hewan.size() - 1));
        System.out.println("jumlah elemen: " + hewan.size());
        System.out.print("Posisi Badak: " + hewan.indexOf("badak"));
        System.out.println();
    }

}
