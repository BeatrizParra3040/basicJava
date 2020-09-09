package iLoops;

import libs.Input;

public class cancionElefantes {

   public static void main(String[] args) {
        int numelefantes = 1;
        while (numelefantes <= 3)
        {
           if (numelefantes <=1)
           {
               System.out.println(numelefantes + " Elefante se balanceaba sobre la tela de una araña,\n  como veía que resistia fue a llamar otro elefante");
           }
           else
               System.out.println(numelefantes + " Elefantes Se balanceaban sobre la tela de una araña\n  como la tela no resistia fueron a llamar otro elefante");
           numelefantes += 1;
        }
    }
}
