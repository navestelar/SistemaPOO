public class Frequencia {

    private float porcentagemFrequencia;
    private Professor professor;
    private Disciplina disciplina;
    
    public Frequencia(float porcentagemFrequencia, Professor professor, Disciplina disciplina) {
        this.porcentagemFrequencia = porcentagemFrequencia;
        this.professor = professor;
        this.disciplina = disciplina;
    }


    public Frequencia() {
    }


    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }


    public float getPorcentagemFrequencia() {
        return porcentagemFrequencia;
    }


    public void setPorcentagemFrequencia(float porcentagemFrequencia) {
        this.porcentagemFrequencia = porcentagemFrequencia;
    }
}
