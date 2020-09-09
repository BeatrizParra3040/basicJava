package iLoops;

import libs.Input;

public class CancionElefantes2 {

    public static void main(String[] args) {
        int numelef=1;
        int totalelef=0;

        System.out.println("Ingrese cuantos elefantes quiere balancear:");
        totalelef= Input.get_int();

        while (numelef <= totalelef)
        {
          if(numelef <= 1)
          {
              System.out.println(numelef + " Elefante se balanceaba sobre la tela de una araña,\n  como veía que resistia fue a llamar otro elefante");
          }
           else
              System.out.println(numelef + " Elefantes Se balanceaban sobre la tela de una araña\n  como la tela no resistia fueron a llamar otro elefante");
        numelef+= 1;
        }
    }
}
