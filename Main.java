import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
    int[] tablica = new int[10];
    int podstawa = 2;
    for(int i = 0; i < 10; i++)
      {
        tablica[i] = Math.pow(podstawa, i);
      }
        for(int j = 10; 0 < j; j--)
      {
        System.out.println(tablica[j]);
      }

    
    
  }
}