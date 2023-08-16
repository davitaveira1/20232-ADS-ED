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
    int qtdAlunosVetor = 0;

    //Inserção em vetor descompactado
    public void inserirFinalVetorV1(Aluno a) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = a;
                break;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Pos: " + i + " Nome: " + alunos[i].nome);
            }
        }
    }

    //Inserção em vetor compactado e posição igual a null
    public void inserirFinalVetorV2(Aluno a) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = a;
                break;
            }
        }
    }

    //Inserção em vetor compactado e posição igual qtd alunos
    public void inserirFinalVetorV3(Aluno a) {
        if (qtdAlunosVetor < 100) {
            alunos[qtdAlunosVetor] = a;
            qtdAlunosVetor++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public void tamanhoLista() {
        System.out.println("Tamanho: " + qtdAlunosVetor);
    }

    public boolean verificarAlunoLista(String nome) {
        for (int i = 0; i < qtdAlunosVetor; i++) {
            if (alunos[i].nome.equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public String buscarAlunoPorPosicao(int pos) {
        if (pos >= 0 && pos < (qtdAlunosVetor - 1)) {
            return "Nome: "+alunos[pos].nome;
        } else {
            return "Posição inválida!";
        }
    }

    public static void main(String[] args) {

        Vetor v = new Vetor();

        Aluno a1 = new Aluno("Davi");
        Aluno a2 = new Aluno("Daniel");

        v.inserirFinalVetorV3(a1);
        v.inserirFinalVetorV3(a2);
        v.imprimir();

        if (v.verificarAlunoLista("Ricardo")) {
            System.out.println("Aluno existe no vetor!");
        } else {
            System.out.println("Aluno não existe no vetor!");
        }

        System.out.println(v.buscarAlunoPorPosicao(0));

    }

}
