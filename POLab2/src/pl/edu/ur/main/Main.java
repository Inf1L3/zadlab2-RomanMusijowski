package pl.edu.ur.main;
import java.util.Scanner;
/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        Scanner scanner = new Scanner(System.in);
        
        //Zadanie 3
        float[] tabl = new float[10];
        
        for(int i =0;i<10;i++){
            System.out.println("podaj znaczenie elementu tablicy "+i);
            tabl[i] = scanner.nextFloat();
        }
    
        for(int j = 0;j<10;j++){
            System.out.println("Element "+ j+" = "+tabl[j]);
        }
        
        for(int q = 9;q>=0;q--){
            System.out.println("Element "+ q+" = "+tabl[q]);
        }
        
        for(int k = 0 ; k<10;k++){
            if(k%2==0){
                continue;
            }else
                System.out.println("Element  nieparzysty - "+ k +" = "+ tabl[k]);
        }
        
        for(int k = 0 ; k<10;k++){
            if(k%2==0){
                System.out.println("Element parzysty - "+ k +" = "+ tabl[k]);
            }else
                continue;
        }
        
        
        
        //Zadanie 4
        System.out.println("Zadanie 4");
        
        int[] zadanie_4 = new int[10];

        for(int z_4 =0;z_4<10;z_4++){
            System.out.println("podaj znaczenie elementu tablicy "+z_4);
            zadanie_4[z_4] = scanner.nextInt();
        }

        int suma = 0, iloczyn = 1,srednie = 0,min = zadanie_4[0],max = zadanie_4[0];

        for (int zad_4=0;zad_4<10;zad_4++){

            suma+=zadanie_4[zad_4];
            iloczyn*=zadanie_4[zad_4];

            if(min>zadanie_4[zad_4]){
                min = zadanie_4[zad_4];
            }else if (max<zadanie_4[zad_4]){
                max = zadanie_4[zad_4];
            }
        }
        System.out.println("Suma - "+suma);
        System.out.println("iloczyn - "+iloczyn);
        System.out.println("Srednie - "+ suma/10);
        System.out.println("Min - "+min);
        System.out.println("Max - "+max);
        
        
//        //Zadanie 6
        System.out.println("Zadanie 6");
        
        int zad_5 = 1;
        
        while (zad_5>=0){
            System.out.println("Podaj liczbe");
            zad_5 = scanner.nextInt();
            if(zad_5<0){
                break;
            }
        }
        System.out.println("program sie skonczyw");
    
    
            //Zadanie 7
        System.out.println("Zadanie 7");
        int ilosc=0;


        //Przypisanie ilosci elementow tablicy i znaczen
        System.out.println("podaj ilosc elementow tablicy");
        ilosc = scanner.nextInt();

        int[] sortowanie = new int[ilosc];

        for (int Z_7 = 0 ;Z_7<ilosc;Z_7++){
            System.out.println("Podaj zanaczenie elentu "+Z_7);
            sortowanie[Z_7]=scanner.nextInt();
        }

        //Wyswietlenie
        for (int j_7 = 0 ;j_7<ilosc;j_7++){
            System.out.print(sortowanie[j_7]+"  ");
        }
        System.out.println();


        //Sortowanie
        int Dlugosc_tab = sortowanie.length-1;
        boolean sort = false;


        while (!sort) { //kiedy prawda to dziala
            sort = true;

                        for (int s_7 = 0; s_7 < Dlugosc_tab; s_7++) {
                            int zmienna;

                            if (sortowanie[s_7] > sortowanie[s_7 + 1]) {
                                swap(sortowanie, s_7, s_7+1);
                                sort = false;
                            }

                        }
            Dlugosc_tab--;
        }

        for (int u_7 = 0 ;u_7<ilosc;u_7++){
            System.out.print(sortowanie[u_7]+"  ");
        }
    }


    
    private static void swap(int[]array, int i_7, int j_7) {
        int two = array[i_7];
        array[i_7]=array[j_7];
        array[j_7]= two;
    }
    
}
 
