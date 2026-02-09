# Inialisasi Batas Array pada Program [Fixed-Size Array]
Max = 10
# Membuat [Fixed-size Array] dengan nilai awal kosong
arrayNIMMahasiwa = [None] * Max
arrayNamaMahasiwa = [None] * Max

# Variable untuk melacak kondisi jumlah data
n = 0

while True:
    print("\n ======== MENU ========")
    print("1. Masukkan Data Pada Index Pertama")
    print("2. Masukkan Data Pada Index Sesuai Pilihan")
    print("3. Masukkan Data Pada Index Terakhir")
    print("4. Hapus Data Dari Index Pertama")
    print("5. Hapus Data Pada Index Yang Dipilih")
    print("6. Hapus Data dari Index Terakhir")
    print("7. Hapus 1 Data Jika Data Bernilai Sama")
    print("8. Lihat Seluruh Data Mahasiswa")
    print("9. Keluar")

    pilihan = int(input("Pilih Menu: "))

    match pilihan:

        # Insert At Beginning
        case 1: 
            inpNIMMahasiswa = int(input("Masukkan NIM Mahasiswa: "))
            inpNamaMahasiswa = input("Masukkan Nama Mahasiswa: ")

            if n < Max:
                for i in range(n,0,-1):
                    arrayNIMMahasiwa[i] = arrayNIMMahasiwa[i-1]
                    arrayNamaMahasiwa[i] = arrayNamaMahasiwa[i-1]

            arrayNIMMahasiwa[0] = inpNIMMahasiswa
            arrayNamaMahasiwa[0] = f"Nama: {inpNamaMahasiswa}"
            n+=1
            print("Data Berhasil Ditambahkan :)")

        # Insert At Given Position
        case 2: 
            inpIndexMahasiswa = int(input(f"Masukkan Index: (0-{n}): "))
            if n < Max and 0 <= inpIndexMahasiswa <= n:
                inpNIMMahasiswa = int(input("Masukkan NIM Mahasiswa: "))
                inpNamaMahasiswa = input("Masukkan Nama Mahasiswa: ")

                for i in range(n, inpIndexMahasiswa, -1):
                    arrayNIMMahasiwa[i] = arrayNIMMahasiwa[i-1]
                    arrayNamaMahasiwa[i] = arrayNamaMahasiwa[i-1]
                
                arrayNIMMahasiwa[inpIndexMahasiswa] = inpNIMMahasiswa
                arrayNamaMahasiwa[inpIndexMahasiswa] = f"Nama: {inpNamaMahasiswa}"
                n+=1
                print(f"Data Berhasil Ditambahkan pada Index {inpIndexMahasiswa}")
            else:
                print(f"Index pada {inpIndexMahasiswa}, Gagal Ditambahkan")

        # Insert At End
        case 3:
            if n < Max:
                inpNIMMahasiswa = int(input("Masukkan NIM Mahasiswa: "))
                inpNamaMahasiswa = input("Masukkan Nama Mahasiswa: ")

                arrayNIMMahasiwa[n] = inpNIMMahasiswa
                arrayNamaMahasiwa[n] = f"Nama: {inpNamaMahasiswa}"
                n += 1

                print("Data Berhasil Ditambahkan")
            else:
                print("Data Gagal Ditambahkan")

        # Delete From Beginning
        case 4:
            if n > 0:
                for i in range(0,n -1):
                    arrayNIMMahasiwa[i] = arrayNIMMahasiwa[i+1]
                    arrayNamaMahasiwa[i] = arrayNamaMahasiwa[i+1]

                arrayNIMMahasiwa[n-1]  = None
                arrayNamaMahasiwa[n-1] = None
                n -=1
                print("Data Berhasil Dihapus")
            else:
                print("Gagal Dihapus")

        # Delete Given Position
        case 5:
            inpIndexDeleteMahasiswa = int(input(f"Masukkan Index [0-{n-1}]: "))
            if 0 <= inpIndexDeleteMahasiswa < n:
                for i in range(inpIndexDeleteMahasiswa,n-1):
                    arrayNIMMahasiwa[i] = arrayNIMMahasiwa[i+1]
                    arrayNamaMahasiwa[i] = arrayNamaMahasiwa[i+1]
                
                arrayNIMMahasiwa[n-1]  = None
                arrayNamaMahasiwa[n-1] = None
                n-=1
                print(f"Data pada Index{inpIndexDeleteMahasiswa} Berhasil Dihapus")
            else:
                print("Data Gagal Dihapus")

        # Delete From End
        case 6:
            if n > 0:
                arrayNIMMahasiwa[n-1] = None
                arrayNamaMahasiwa[i-1] = None
                n-=1
                print("Index Terakhir Berhasil Dihapus")
            else:
                print("Index Gagal Dihapus")

        # Delete First Occurrence 
        case 7:
            inpIndexMahasiswa = int(input("Masukkan NIM Index Sama: "))
            found = -1

            for i in range(n):
                if arrayNIMMahasiwa[i] == inpIndexMahasiswa:
                    found = i
                    break

            if found != -1:
                for i in range(found, n-1):
                    arrayNIMMahasiwa[i] = arrayNIMMahasiwa[i+1]
                    arrayNamaMahasiwa[i] = arrayNamaMahasiwa[i+1]

                arrayNIMMahasiwa[n-1] = None
                arrayNamaMahasiwa[n-1] = None
                n -= 1
                print(f"Data pada Index {inpIndexMahasiswa} berhasil dihapus")
            else:
                print("gagal Menghapus Data")

        # Show Data
        case 8: 
            print("\nData Mahasiswa:")
            for i in range(n):
                print(f"Index [{i}] {arrayNIMMahasiwa[i]} {arrayNamaMahasiwa[i ]}")

        # Exit Program
        case 9:
            break

