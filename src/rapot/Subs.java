/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapot;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Subs extends Super {
    
    @Override 
    public void tampilan(){
        
    //data
        int jmlh = 5;
        int tes = 5;
        String nama;
        float jumlah[];
        
    //boolean
    boolean run =true;
    
    //untuk scan
        Scanner first = new Scanner(System.in);
        
        int Nilai[][];
        Nilai = new int[4][5];
   
        
    //memanggil kelas lain
        
        
    while(run){    
        System.out.println("*------------------------*");
        System.out.println("|         RAPOT          |");
        System.out.println("|    *** PILIHAN ***     |");
        System.out.println("*------------------------*");
        System.out.println("|1. Memasukan Nilai Mapel|\n"
                         + "|2. Menampilkan Data     |");
        System.out.println("*------------------------*");
        
        System.out.println("");
        
        System.out.print("Masukan Pilihan anda (Angka) : ");
        int data = first.nextInt();
        
        switch(data){
            case 1 :
                System.out.println("*--------------------------------*");
                System.out.println("Berapa Data yang akan anda Inputkan : ");
                jmlh = first.nextInt();
                    for (int i = 0; i < jmlh; i++) {
                        System.out.println("Murid ke- " +(i+1)+" :");
                        for (int j = 0; j < tes; j++) {
                            System.out.print("Nilai Tes " + (i+1) + " : ");
                            Nilai[i][j] = first.nextInt();
                        }
                    }
                break;
            case 2 :
                 //Output judul
                    System.out.println("---------------------------");
                    System.out.println("Daftar Nilai Mahasiswa : ");
                    System.out.println("---------------------------");
                    System.out.println();
        
                    System.out.println("\t\tMatematika \tFisika \tKimia \tBInggris \tBIndonesia \tRata-rata");
        
                //Output nilai
                for(int j=0;j<jmlh;j++){
                    System.out.print("Murid Ke- " + (j+1));
                        for(int k=0;k<tes;k++){
                        System.out.print("\t\t" + Nilai[j][k]);
                    }
                System.out.println();
                }
                
                break;
            default :System.out.println("Maaf angka yang anda masukan tidak tersedia !");
                break;
        }
        System.out.println("Apakah anda ingin Memilih menu lain ? ya / tidak ");
            String krik = first.next();
            if(krik.equalsIgnoreCase("ya")){
                run = true;
            }else if(krik.equalsIgnoreCase("tidak")){
                System.out.println("Terima Kasih Telah Mengisi data");
                run = false;
            }else{
                System.out.println("MAAF!,Kata Yang Anda Masukan Salah!");
                run = false;
            }
        //akhiran while            
        }
    }
}

