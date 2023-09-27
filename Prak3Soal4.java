package prak3soal4;

import java.util.Scanner;

public class Prak3Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, waktu, stok, pembelian, diskon, fdiskon, buy, jam, potongan = 0;

        harga = 100000;
        waktu = 420;
        stok = 150;

        System.out.println("==========Toko Buah Pro=========");
        System.out.println("Masukkan Jumlah Pembelian : ");
        buy = input.nextInt();
        if (buy <= 0 || buy > stok) {
            System.out.println("Error");
        } else {
            System.out.println("masukkan waktu : ");
            jam = input.nextInt();

            if (jam <= 0) {
                System.out.println("error salah waktu!");
            } else if (jam > 420) {
                System.out.println("Toko sudah tutup");
            } else {
                potongan = (jam / 40) * 5;
            }
            pembelian = buy * harga;
            stok -= buy;
            fdiskon = (pembelian * potongan) / 100;
            pembelian -= fdiskon;

            int totalHarga = pembelian;
            System.out.println("===============================");
            System.out.println("Jumlah Pembelian : " + buy);
            System.out.println("Stok Tersisa : " + stok);
            System.out.println("Hasil Pembelian : Rp" + totalHarga);
        }
    }
}
