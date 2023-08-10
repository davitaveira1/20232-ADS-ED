/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Vetor {
    
    Aluno[] alunos = new Aluno[100];
    
    public void inserirFinalVetorV1(Aluno a){
        for(int i=0;i<alunos.length;i++){
            if(alunos[i]==null){
                alunos[i]=a;
                break;
            }
        }
    }
    
    public void imprimirV1(){
        for(int i=0;i<alunos.length;i++){
            if(alunos[i]!=null){
                System.out.println("Pos: "+i+" Nome: "+alunos[i].nome);
            }
        }
    }
    
    public static void main(String[] args) {
        
        Vetor v = new Vetor();
        
        Aluno a1 = new Aluno("Davi");
        Aluno a2 = new Aluno("Daniel");
        
        v.inserirFinalVetorV1(a1);
        v.inserirFinalVetorV1(a2);
        v.imprimirV1();
        
    }
    
   
}
