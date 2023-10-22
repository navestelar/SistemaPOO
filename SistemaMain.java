import java.util.HashMap;
import java.util.Scanner;


public class SistemaMain {
    public static void main(String[] args) {


        Curso curso = new Curso();
        curso.setNome("nomeCurso");
        Aluno aluno = new Aluno();
        aluno.setNome("nomeAluno1");
        aluno.setCpf("cpfAluno1");
        aluno.setCurso(curso);
        System.out.println(aluno.getCurso().getNome());
        
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("disciplina1");
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
        System.out.println(disciplina.setProfessores(professores));
        professores.put("prof2", p2);
        professores.put("prof3", p3);
        professores.put("prof4", p4);
        System.out.println(disciplina.setProfessores(professores));
        professores.put("prof5", p5);
        System.out.println(disciplina.setProfessores(professores));

        aluno.matricular("disciplina1", 1);
        
        
        // Scanner scanner = new Scanner(System.in);
        

        // boolean verificador = true;

        // System.out.println("Olá, seja bem vindo! selecione a opção desejada: ");
        // System.out.println("[1] - Professor ");
        // System.out.println("[2] - Aluno");
        // int option = scanner.nextInt();


        // switch (option) {
        //     case 1:
        
                    System.out.println("Ações disponíveis: ");
                    System.out.println("[1] - Listar disciplinas lecionadas");
                    System.out.println("[2] - Registrar frequência");
                    System.out.println("[3] - Registrar avaliação");


        //     break;

        //     case 2:

                    System.out.println("[1] - ");

        //     break;

        //     default:

        //     break;
        // }

        // do {

        //     System.out.println("Seja bem vindo(a), selecione a opção desejada: ");
        //     System.out.println("[1] - Cadastrar novo aluno");
        //     System.out.println("[2] - Remover aluno");
        //     System.out.println("[3] - Cadastrar novo curso");
        //     System.out.println("[3] - Registrar frequência/avaliação");
        //     System.out.println("[5] - Informações sobre disciplina");
        //     System.out.println("[6] - Informações sobre curso");
        //     System.out.println("[7] - Sair do programa");

        //     int answ = scanner.nextInt();
        //     scanner.nextLine();
                    
        //     switch (answ) {

        //         case 1:

        //             System.out.println("Insira as seguintes informações do aluno:");

        //             System.out.print("Nome:");
        //             String nomeAluno = scanner.nextLine();
        //             System.out.print("CPF: ");
        //             String cpf = scanner.nextLine();

        //             Aluno novoAluno = new Aluno();
        //             novoAluno.setNome(nomeAluno);
        //             novoAluno.setCpf(cpf);

        //             alunos.put(nomeAluno, novoAluno);

                    
                    
        //             break;
                    
        //             case 2:
                    
        //             break;
                    
        //             case 3:
                    
        //             break;
                    
        //             case 4:

        //             System.out.print("Informe o nome do aluno:");
        //             String nomeProcurarAluno = scanner.nextLine();

        //             Aluno alunoEncontrado = alunos.get(nomeProcurarAluno);
        
        //             if (alunoEncontrado != null) {
        //             System.out.println("Informações do aluno:");
        //             System.out.println("Nome: " + alunoEncontrado.getNome());
        //             System.out.println("CPF: " + alunoEncontrado.getCpf());
        //             } else {
        //             System.out.println("Aluno não encontrado.");
        //             }


        //         break;

        //         case 5: 

        //         break;

        //         case 6:

        //         break;

        //         case 7:

        //             System.out.println("Até logo! :D");
        //             verificador = false;

        //         break;

        //     default:

        //     break;
        //     }

        // } while (verificador);


        
    }
}
