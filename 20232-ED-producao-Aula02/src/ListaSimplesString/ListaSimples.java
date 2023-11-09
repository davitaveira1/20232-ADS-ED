/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimplesString;

/**
 *
 * @author Davi
 */
public class ListaSimples {

    No primeiro = null;
    No ultimo = null;
    
    public void inserirNoInicio(No novoNo) {

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {

            novoNo.prox = primeiro;
            primeiro = novoNo;

        }

    }

    public void inserirNoFinal(No novoNo) {
        if (primeiro == null) {
            //lista vazia
            primeiro = novoNo;
        } else {
            ultimo.prox = novoNo;
        }
        ultimo = novoNo;
    }

    public void tamanhoLista() {
        
        if(primeiro==null){
            System.out.println("Lista vazia!");
        }else{  
            int cont=0;
            No aux=primeiro;
            while(aux!=null){
                cont++;
                aux=aux.prox;
            }
            System.out.println("Tamanho: "+cont);
            
        }

    }

}
