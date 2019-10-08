package pbo2.pkg10118066.latihan29.warnakepribadian;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Tegar Lucky'q Oakley
 * KELAS  : IF 2
 * NIM    : 10118066
 */
public class PBO210118066Latihan29WarnaKepribadian {

    
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // BG
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    
    // Data Warna
    public static final String[] DATA_MERAH =  {
        "Periang",
        "Pemberani",
        "Berani mengambil resiko dalam setiap langkah",
        "Menyukai tantangan",
        "Kurang sabar",
        "Dapat menahan marah namun jika sudah tahap puncak"
                + " toleransi, kemarahannya akan sulit dikontrol",
        "Memiliki energi kehangatan dan cinta"
    };

    public static final String[] DATA_HIJAU =  {
        "Romantis",
        "Menyukai hal yang berbau alami dan keindahan",
        "Teguh pada prinsip",
        "Menginginkan kesempuranaan",
        "Mudah cemburu",
        "Mudah merasa iri",
        "Menjunjung tinggi suatu nilai toleransi dan kepercayaan"
    };

    public static final String[] DATA_KUNING =  {
        "Optimis",
        "Suka bergaul",
        "Periang",
        "Senang menolong",
        "Lincah dan aktif",
        "Tidak suka meremehkan kekurangan orang lain",
        "Loyal",
        "Hangat",
        "Meskipun karakternya optimis dan idealis, seringkali goyah dan"
            + " tidak stabil",
        "Cenderung Penakut"
    };

    public static final String[] DATA_BIRU =  {
        "Menyenangkan",
        "Bijaksana",
        "Pembawaan diri tenang saat menghadapi masalah",
        "Dinamis",
        "Senang berbagi",
        "Bersahabat",
        "Tidak terlalu suka menjadi sorotan banyak orang",
        "Menyembunyikan perasaan karena karakternya yang cenderung mencari"
            + " jalan damai"
    };

    public static final String[] DATA_UNGU =  {
        "Optimis",
        "Tidak pernah ragu",
        "Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat",
        "Memiliki ambisi yang besar",
        "Memiliki empati yang besar",
        "Memiliki sisi misterius sebab seringkali menutupi perasaannya",
        "Terkadang bersikap keras kepala dan angkuh"
    };

    /**
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED + "YUK " + GREEN + "CEK"
                + YELLOW + " KEPRIBADIANMU" + CYAN + " DARI"
                + MAGENTA + " WARNA " + BLUE + " FAVORITMU" + RESET);

        System.out.println();
        System.out.println(BG_RED + WHITE + "\tMERAH\t\t");
        System.out.println(BG_GREEN + WHITE + "\tHIJAU\t\t");
        System.out.println(BG_YELLOW + WHITE + "\tKUNING\t\t");
        System.out.println(BG_BLUE + WHITE + "\tBIRU\t\t");
        System.out.println(BG_MAGENTA + WHITE + "\tUNGU\t\t");
        
        System.out.println();
        System.out.print(RESET + "PILIH WARNA FAVORITMU : ");
        String warna = scanner.next();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();
        System.out.println();
        
        System.out.println("====== HASIL TEST KEPRIBADIAN " + nama + " ======");
        
        switch(warna.toLowerCase()) {
            case "merah": printData(warna, DATA_MERAH); break;
            case "hijau": printData(warna, DATA_HIJAU); break;
            case "kuning": printData(warna, DATA_KUNING); break;
            case "biru": printData(warna, DATA_BIRU); break;
            case "ungu": printData(warna, DATA_UNGU); break;
            default: System.out.println("Oops.. Belum teridentifikasi");
        }
    }
    
    public static final void printData(String warna, String[] data) {
        
        System.out.println("Warna Favorit Kamu adalah "
                + getWarna("color", warna) + warna.toUpperCase() + RESET);
        
        for(int i = 0; i<data.length; i++) {
            System.out.print((i+1) + ". " + data[i]);
            if(i+1 < data.length) {
                System.out.println(",");
            } else {
                System.out.println(".");
            }
        }
    }

    public static final String getWarna(String type, String warna) {
        String result = "";
        
        switch(warna.toLowerCase()) {
            case "merah": result = type.equals("bg") ? BG_RED : RED; break;
            case "hijau": result = type.equals("bg") ? BG_GREEN : GREEN; break;
            case "kuning": result = type.equals("bg") ? BG_YELLOW : YELLOW; break;
            case "biru": result = type.equals("bg") ? BG_BLUE : BLUE; break;
            case "ungu": result = type.equals("bg") ? BG_MAGENTA : MAGENTA; break;
        }
        
        return result;
    }
}