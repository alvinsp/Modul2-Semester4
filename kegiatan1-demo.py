import sys

# author = Alvin Suwarno Putra

hewan = ['angsa', 'bebek', 'cicak', 'domba', 'elang', 'gajah']
deleteHewan = []

def create():
    print("Hewan: ", hewan)
    namaHewan = str(input("Masukkan nama hewan: "))
    hewan.append(namaHewan)
    print("hewan: ", hewan)


def read():
    hitung = hewan.count(input("Nama hewan yang ingin dicari jumlahnya: "))
    print(hitung)
    search = input('masukkan nama hewan yang ingin dicari indexnya: ')

    baru = []
    for i in range(len(hewan)):
        if hewan[i] == search:
            baru.append(i)
    print(baru)


def read_index():
    search = int(input('Cari index ke berapa: '))
    if search < len(hewan):
        index = hewan[search]
        print('Nilai darir indeks', search, ' = ', index)

    else:
        print('Nilai', search, 'tidak ditemukan')


def delete_program():
    namaHapus = input("Nama Hewan yang dihapus: ")
    currentAnimal = namaHapus.split(",")
    for i in range(len(currentAnimal)):
        hewan.remove(currentAnimal[i])
        deleteHewan.append(currentAnimal[i])
        print(hewan)


def delete_index():
    indeksHapus = int(input('Masukkan indeks yang ingin dihapus: '))
    if indeksHapus < len(hewan):
        del hewan[indeksHapus]
        print(hewan)


def update():
    indeks = int(input('masukkan index yang ingin di update? '))
    namaHewanBaru = input('Masukkan nama hewan baru: ')
    hewan[indeks] = namaHewanBaru
    print(hewan)

    indeks = int(input('masukkan index yang ingin ditambah: '))
    inputHewan = input('masukkan hewan yang ingin ditambahkan: ')
    hewan.insert(indeks, inputHewan)
    print(hewan)


while True:
    print("\nPlease select an operation")
    print("[1] create")
    print('[2] read')
    print("[3] read with index")
    print("[4] update")
    print("[5] delete")
    print("[6] last call")

    CHOICE = int(input("Pilih gan: "))
    if CHOICE == 1:
        create()
    elif CHOICE == 2:
        read()
    elif CHOICE == 3:
        read_index()
    elif CHOICE == 4:
        update()
    elif CHOICE == 5:
        delete_index()
    elif CHOICE == 6:
        print('elemen pertama:', hewan[0])
        print('last element: ', hewan[-1])
        print('jumlah elemen: ', len(hewan))
        print('index dari badak: ', hewan.index('badak'))
        sys.exit()
