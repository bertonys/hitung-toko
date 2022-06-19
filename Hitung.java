import java.util.Scanner;

public class Hitung {
  public static void main(String[] args) {
    
	    Scanner tulisnama = new Scanner(System.in);
		System.out.println("Masukan nama anda");
		String nama = tulisnama.nextLine();

		System.out.println("Stok Gudang input Barang");
		System.out.println("########################");		 
		System.out.println("Selamat Datang" + nama);

		Scanner tulisbarang = new Scanner(System.in);
		System.out.println("Masukan nama barang yang ingin ditambah");
		String namabarang = tulisbarang.nextLine();

		Scanner tulisjumlah = new Scanner(System.in);
		System.out.println("Masukan Jumlah barang yang ingin ditambah");
		int jumlahbarang = tulisjumlah.nextInt();

		Scanner tulisbeli = new Scanner(System.in);
		System.out.println("Masukan harga beli untuk barang tersebut");
		double hargabeli = tulisbeli.nextDouble();

		Scanner tulisjual = new Scanner(System.in);
		System.out.println("Masukan harga jual untuk barang tersebut");
		double hargajual = tulisjual.nextDouble();

		System.out.println("Stock Gudang Rincian Barang");
		System.out.println("############################");
		System.out.println("Nama Barang  :" + namabarang);
		System.out.println("Jumlah Barang:" + jumlahbarang);
		System.out.println("Harga Beli   :" + hargabeli);
		System.out.println("Harga Jual   :" + hargajual);
  }
}
