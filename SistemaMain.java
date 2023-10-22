import java.util.HashMap;
import java.util.Map;

public class SistemaMain {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("disciplina1");
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("disciplina2");
       
        HashMap<String, Disciplina> disciplinas = new HashMap<>();
        disciplinas.put(disciplina1.getNome(), disciplina1);
        disciplinas.put(disciplina2.getNome(), disciplina2);
        
        Curso curso = new Curso();
        curso.setNome("CiênciaDaComputação");
        HashMap<Integer, Fase> fases = new HashMap<>();
        Fase fase = new Fase();
        fase.setNumeroFase(1);
        fase.setDisciplinas(disciplinas);
        fases.put(1, fase);
        curso.setFases(fases);

        for (Map.Entry<String, Disciplina> entry : disciplinas.entrySet()) {
            System.out.println(entry.getKey());
        }

        Fase primeiraFase = new Fase();
        primeiraFase.setNumeroFase(1);

        Aluno aluno = new Aluno();
        aluno.setNome("nomeAluno1");
        aluno.setCpf("cpfAluno1");
        aluno.setCurso(curso);
        aluno.setDisciplinasMatriculadas(disciplinas);
        System.out.println(aluno.getCurso().getNome());
        
        System.out.println(aluno.getCurso().getNome()); 
        
        
        HashMap<String, Professor> professores = new HashMap<>();
        Professor p1 = new Professor();
        p1.setNome("prof1");
        Professor p2 = new Professor();
        p2.setNome("prof2");
        Professor p3 = new Professor();
        p3.setNome("prof3");
        Professor p4 = new Professor();
        p4.setNome("prof4");
        Professor p5 = new Professor();
        p5.setNome("prof5");

        professores.put("prof1", p1);
        System.out.println(disciplina1.setProfessores(professores));
        professores.put("prof2", p2);
        professores.put("prof3", p3);
        professores.put("prof4", p4);
        System.out.println(disciplina1.setProfessores(professores));
        professores.put("prof5", p5);
        System.out.println(disciplina1.setProfessores(professores));

        aluno.registrarFrequencia("disciplina1", "prof1", 0.8f);
        System.out.println(aluno.getFrequenciaByProfessor("prof1").getPorcentagemFrequencia());      
        
    }
}
