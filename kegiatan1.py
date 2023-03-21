hewan = ["Sapi", "Kelinci", "Kambing", "Domba"]
deleteHewan = []


def create():
    print("Hewan: ", hewan)
    namaHewan = str(input("Masukkan nama hewan: "))
    hewan.append(namaHewan)
    print("hewan: ", hewan)


def delete_program():
    namaHapus = input("Nama Hewan yang dihapus: ")
    currentAnimal = namaHapus.split(",")
    for i in range(len(currentAnimal)):
        hewan.remove(currentAnimal[i])
        deleteHewan.append(currentAnimal[i])
        print(hewan)


while True:
    print("\nPlease select an operation")
    print("[1] create")
    print("[2] delete")

    choice = int(input("Enter your choice: "))
    if choice == 1:
        create()
    elif choice == 2:
        delete_program()
