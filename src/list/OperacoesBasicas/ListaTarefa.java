package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributos
    private List <Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRememover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRememover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRememover);
    }
    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    };
    public void ObterDescricaoDeTodasAsTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        //listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("o numero toltal é " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.ObterDescricaoDeTodasAsTarefas();
    }
    }
