import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("program wczytuje liczby do momentu jak wpisze 20 wyswietlane jest cos tam co se wymysle");
    Scanner scan=new Scanner(System.in);
    int suma=0;
    int sredniapomoc=0;
    int[] tablica=new int[100];
    int srednia=0;
    for (int i=0;i<100;i++)
    {
      tablica[i]=scan.nextInt();
      if (tablica[i]!=20)
      {
      sredniapomoc=(sredniapomoc+tablica[i]);
      
      suma=(suma+tablica[i]);
      }
      else if (tablica[i]==20)
      {
        srednia=(sredniapomoc/i);
        System.out.println("sredia="+ srednia);
        System.out.println("suma="+ suma);
      }
      
    }    

    
  }
}