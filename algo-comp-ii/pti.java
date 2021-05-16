import java.util.Scanner;

class Main {
    //Função para ler os dados fornecidos pelo usuário
    public static void main(String[] args){
      Scanner leitor = new Scanner(System.in);
      System.out.print("Quantos elementos terá o seu vetor? ");
      int v[] = new int[leitor.nextInt()];

      for (int i = 0; i < v.length; i++){
      System.out.print("Adicione um número: ");
      v[i] = leitor.nextInt();
      }

      int maior = 0;
      int menor = 0;

      diferenca(v, maior, menor);
      ordem(v);
    } 

    //Função para verificar o valor da maior diferença entre dois elementos distintos do vetor
     public static int diferenca(int[] v, int maior, int menor){   
      for (int i = 0; i < v.length; i++){
        if (i == 0){
          maior = v[i];
          menor = v[i];
        }

        if (v[i] > maior){
          maior = v[i];
        }

        if (v[i] < menor){
          menor = v[i];
        }  
      } 
      int d = maior-menor;
      System.out.println("A maior diferença entre dois números do vetor é: " + d);
      return d;
    }

    //Função para verificar se o vetor está em ordem crescente
    public static boolean ordem(int[] v){
      int x = v[0];
      int status = 0;

      if(v.length > 1){
        if(x >= v[1]){
          status = -1;
        }
      }
      else {
        return false;
      }      

      for(int i = 0; i < v.length; i++){
        if(x <= v[1] && status !=(-1)){
          x = v[i];
          System.out.println("O vetor está em ordem crescente");
          return true;
        } 
      }
      System.out.println("O vetor não está em ordem crescente");
      return false;
  }           
}
