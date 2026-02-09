
import java.util.Scanner;

public class taskOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ArrayMahasiswa = new String[10];
            ArrayMahasiswa[0] = "NIM: 101, Nama: Aji Saka";
            ArrayMahasiswa[1] = "NIM: 102, Nama: Burhan";
            ArrayMahasiswa[2] = "NIM: 103, Nama: Comel";
            ArrayMahasiswa[3] = "NIM: 104, Nama: Dion";
            ArrayMahasiswa[4] = "NIM: 105, Nama: Erita";
            ArrayMahasiswa[5] = "NIM: 106, Nama: Fine";
            ArrayMahasiswa[6] = "NIM: 106, Nama: Fine";
            ArrayMahasiswa[7] = "NIM: 108, Nama: Himalaya";
            ArrayMahasiswa[8] = "NIM: 109, Nama: Irlan Sana";
            ArrayMahasiswa[9] = "NIM: 110, Nama: Tiup Sini";

            int n = ArrayMahasiswa.length;
            int lasIndexRTerisi = 0;

            for(int i = 0; i < n; i++){
                if (ArrayMahasiswa[i] != null) {
                    lasIndexRTerisi = i;
                }
            }
            
            int pilihanMenu;
            System.out.println("\n=== SELAMAT DATANG DI PROGRAM OLAH DATA ====");

            do { 
                System.out.println("===============================================");
                System.out.println("MENU UTAMA PROGRAM");
                System.out.println("===============================================");
                    System.out.println("1. Masukkan Data Pada Index Pertama (Beginning)");
                    System.out.println("2. Masukkan Data Pada Index Sesuai Pilihan (Given Position)");
                    System.out.println("3. Masukkan Data Pada Index Terakhir (End)");
                    System.out.println("4. Hapus Data Dari Index Pertama");
                    System.out.println("5. Hapus Data Pada Index Yang Dipilih");
                    System.out.println("6. Hapus Data dari Index Terakhir");
                    System.out.println("7. Hapus 1 Data Jika Data Bernilai Sama (First Occurrence)");
                    System.out.println("8. Lihat Seluruh Data Mahasiswa");
                    System.out.println("9. Keluar");
                System.out.println("===============================================");
            
                pilihanMenu = scanner.nextInt();
                scanner.nextLine();
                        switch (pilihanMenu) 
                        {
                            // Insert At Beginning
                            case 1:{
                                    System.out.println("===============================================");
                                    System.out.println("Index Terisi: " + lasIndexRTerisi);
                                    System.out.println("===============================================");

                                    if (lasIndexRTerisi >= n - 1) {
                                        System.out.println("Array sudah penuh! Tidak bisa menambah data lagi.");
                                        break;
                                    }

                                    System.out.println("Masukkan NIM Mahasiswa Baru: ");
                                    String nimBaru  =  scanner.nextLine();

                                    System.out.println("Masukkan Nama Mahasiswa Baru: ");
                                    String namaMahasiswaBaru = scanner.nextLine();

                                    String dataMahasiswaBaru = "NIM: " + nimBaru + ", Nama: " + namaMahasiswaBaru;
                                    System.out.println("Data Mahasiswa Baru: " + dataMahasiswaBaru);  
                                    System.out.println("===============================================");
                                    
                                    for (int j = n - 1; j > 0; j--){
                                        ArrayMahasiswa[j] = ArrayMahasiswa[j - 1];

                                    } 
                                    ArrayMahasiswa[0] = dataMahasiswaBaru;
                                    lasIndexRTerisi++;

                                    System.out.println("Data Mahasiswa Setelah Penambahan Data Baru: ");    
                                    for (int i = 0; i <= lasIndexRTerisi; i++) {
                                        System.out.println(" " + ArrayMahasiswa[i]);
                                    }
                                    System.out.println("===============================================");
                                    System.out.println("Index Terisi Saat ini: " + lasIndexRTerisi);
                                    System.out.println("===============================================");
                                    break;
                            }
                            
                            // Insert At Given Position
                            case 2:{
                            System.out.println("===============================================");
                            System.out.println("Index Terisi: " + lasIndexRTerisi);
                            System.out.println("===============================================");

                            if (lasIndexRTerisi >= ArrayMahasiswa.length - 1) {
                                System.out.println("Array sudah penuh! Tidak bisa menambah data lagi.");
                                break;
                            }

                            System.out.println("Masukkan Index (0-" + (ArrayMahasiswa.length - 1) + "): ");
                            int indexBaru = scanner.nextInt();
                            scanner.nextLine();

                            if (indexBaru < 0 || indexBaru > ArrayMahasiswa.length - 1) {
                                System.out.println("Index tidak valid!");
                                break;
                            }

                            System.out.println("Masukkan NIM Mahasiswa Baru: ");
                            String nimBaru = scanner.nextLine();
                            System.out.println("Masukkan Nama Mahasiswa Baru: ");
                            String namaMahasiswa = scanner.nextLine();

                            String mahasiswaBaru = "NIM: " + nimBaru + ", Nama: "+ namaMahasiswa;
                            System.out.println("===============================================");
                            System.out.println("Data Mahasiswa Baru: "+ mahasiswaBaru);
                            System.out.println("===============================================");

                            ArrayMahasiswa[indexBaru] = mahasiswaBaru;
                            if (indexBaru > lasIndexRTerisi) {
                                lasIndexRTerisi = indexBaru;
                            }

                            for(int i = 0; i <= lasIndexRTerisi; i++){
                                System.out.println("" + ArrayMahasiswa[i]);
                            }

                            System.out.println("===============================================");
                            System.out.println("Index Terisi Saat Ini: " + lasIndexRTerisi);
                            System.out.println("===============================================");
                            break;
                            }
                        
                            // Insert At End
                            case 3:{
                                System.out.println("===============================================");
                                System.out.println("Data saat ini:");
                                for(int i = 0; i <= lasIndexRTerisi; i++){
                                    System.out.println(""+ ArrayMahasiswa[i]);
                                }
                                System.out.println("===============================================");
                                    System.out.println("Masukkan NIM yang diganti: ");
                                    String cariNIM = scanner.nextLine();
                                    boolean ditemukan = false;

                                    for(int i = 0; i <= lasIndexRTerisi; i++){
                                        if (ArrayMahasiswa[i] != null && ArrayMahasiswa[i].contains("NIM: "+cariNIM)) {
                                            
                                            System.out.println("Masukkan NIM baru: ");
                                            String nimBaru = scanner.nextLine();
                                            System.out.println("Masukkan Nama Mahasiswa: ");
                                            String namaMahasiswa = scanner.nextLine();

                                            String mahasiswaBaru = "NIM: " + nimBaru + ", Nama: " + namaMahasiswa;
                                            System.out.println("Data Mahasiswa Baru: "+ mahasiswaBaru);

                                            ArrayMahasiswa[i] = mahasiswaBaru;
                                            ditemukan = true;
                                        }
                                    }

                                    if (!ditemukan) {
                                        System.out.println("NIM tidak ditemukan!");
                                    }

                                    for(int i = 0; i <= lasIndexRTerisi; i++){
                                        System.out.println(" "+ ArrayMahasiswa[i]);
                                    }

                                    System.out.println("===============================================");
                                    System.out.println("Index Terisi Saat ini: " + lasIndexRTerisi);
                                    System.out.println("===============================================");
                                    break;
                            }

                            // Delete From Beginning
                            case 4:{
                                if (lasIndexRTerisi < 0) {
                                    System.out.println("Array kosong!");
                                    break;
                                }

                                System.out.println("===============================================");
                                System.out.println("Data sebelum dihapus:");
                                for(int i = 0; i <= lasIndexRTerisi; i++){
                                    System.out.println(" " + ArrayMahasiswa[i]);
                                }

                                for(int i = 0; i < lasIndexRTerisi; i++){
                                    ArrayMahasiswa[i] = ArrayMahasiswa[i + 1];
                                }

                                ArrayMahasiswa[lasIndexRTerisi] = null;
                                lasIndexRTerisi--;
                                
                                System.out.println("===============================================");
                                System.out.println("Data setelah dihapus:");
                                for(int i = 0; i <= lasIndexRTerisi; i++){
                                    System.out.println("" + ArrayMahasiswa[i]);
                                }

                                System.out.println("===============================================");
                                System.out.println("Data Index saat ini: " + lasIndexRTerisi);
                                System.out.println("===============================================");
                                break;
                            }

                            // Delete Given Position
                            case 5:{
                                    System.out.println("===============================================");
                                    System.out.println("Masukkan NIM yang dihapus: ");
                                    String hapusData = scanner.nextLine();
                                    System.out.println("Data yang akan di hapus: "+ hapusData);

                                    boolean dihapus = false;
                                    for(int i = 0; i <= lasIndexRTerisi; i++){
                                        if (ArrayMahasiswa[i] != null && ArrayMahasiswa[i].contains("NIM: " + hapusData)) {
                                            for(int j = i; j < lasIndexRTerisi; j++){
                                                ArrayMahasiswa[j] = ArrayMahasiswa[j + 1];
                                            }
                                            ArrayMahasiswa[lasIndexRTerisi] = null;
                                            lasIndexRTerisi--;
                                            dihapus = true;
                                            break;
                                        }
                                    }
                                    
                                    if (!dihapus) {
                                        System.out.println("NIM tidak ditemukan!");
                                    }
                                    
                                    for(int i = 0; i <= lasIndexRTerisi; i++){
                                        System.out.println("" + ArrayMahasiswa[i]);
                                    }

                                    System.out.println("===============================================");
                                    System.out.println("Data index terakhir: "+ lasIndexRTerisi);
                                    System.out.println("===============================================");
                                    break;
                            }

                            // Delete From End
                            case 6:{
                                if (lasIndexRTerisi < 0) {
                                    System.out.println("Array kosong!");
                                    break;
                                }
                                
                                ArrayMahasiswa[lasIndexRTerisi] = null;
                                lasIndexRTerisi --;

                                System.out.println("===============================================");
                                for(int i = 0; i <= lasIndexRTerisi; i++){
                                    System.out.println("" + ArrayMahasiswa[i]);
                                }
                                System.out.println("Data index terakhir: "+ lasIndexRTerisi);
                                break;
                            }

                            case 7:{
                                    System.out.println("===============================================");
                                    for (int e = 0; e < lasIndexRTerisi; e++){
                                        for(int f = e + 1; f < lasIndexRTerisi; f++){
                                            if (ArrayMahasiswa[e] != null && ArrayMahasiswa[e].equals(ArrayMahasiswa[f])) {
                                                System.out.println("===============================================");
                                                System.out.println(" Nilai Sama: "+ ArrayMahasiswa[e]);
                                            }
                                        }
                                    }
                                    for(int i = 0; i < lasIndexRTerisi; i++){
                                        for(int j = i+1; j < lasIndexRTerisi; j++){
                                            if (ArrayMahasiswa[i] != null && ArrayMahasiswa[i].equals(ArrayMahasiswa[j])) {

                                                for(int k = j; k < lasIndexRTerisi-1; k++){
                                                    ArrayMahasiswa[k] = ArrayMahasiswa[k+1];
                                                }
                                                ArrayMahasiswa[lasIndexRTerisi - 1] = null;

                                                lasIndexRTerisi--;

                                                j--;
                                            }

                                        }
                                    }
                                    System.out.println("===============================================");
                                    System.out.println("\nData Setelah Dihapus");
                                    for(int i = 0; i < lasIndexRTerisi; i++){
                                        System.out.println(""+ ArrayMahasiswa[i]);
                                    }
                                    System.out.println("===============================================");
                                break;
                            }

                            // Show All Data
                            case 8:
                                System.out.println("===============================================");
                                System.out.println("\nData Mahasiswa: ");
                                for(int i = 0; i < lasIndexRTerisi; i++){
                                    System.out.println("" + ArrayMahasiswa[i]);
                                }
                                System.out.println("===============================================");
                            break;

                            // Exit Program
                            case 9:
                                System.out.println("Program Selesai");
                                scanner.close();
                                break;

                        }
            } while (pilihanMenu != 0);

            scanner.close();
}

}