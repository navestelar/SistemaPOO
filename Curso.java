import java.util.HashMap;
import java.util.Map;

public class Curso {
    
    private String nome;
    private HashMap<Integer, Fase> fases = new HashMap<>();

    public void listarDisciplinasOfertadas() {
        
    }

    public void listarFases() {
    for (Map.Entry<Integer, Fase> entry : fases.entrySet()) {
        Fase fase = entry.getValue();
        System.out.println(fase.getNumeroFase());
        }
    }

    public void adicionarDisciplina(int Fase, Disciplina disciplina) {
        

    }

    public void listarDisciplinas() {

    }

    public void listarAlunosMatriculados() {


    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public HashMap<Integer, Fase> getFases() {
        return fases;
    }
    public Fase getFaseByNumber(Integer fase) {
        return fases.get(fase);
    }
    public boolean adicionarFase(int numeroFase, HashMap<String, Disciplina> disciplinas) {
        if (getFaseByNumber(numeroFase) == null) {
            return false;
        }
        Fase fase = new Fase();
        fase.setNumeroFase(numeroFase);
        fase.setDisciplinas(disciplinas);
        fases.put(fase.getNumeroFase(), fase);
        return true;
    }
    public void setFases(HashMap<Integer ,Fase> fases) {
        this.fases = fases;
    }
}
