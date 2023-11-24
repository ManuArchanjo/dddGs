
public class Consulta_LifeBeatTech {
    private int identificacao;
    private int idMedico;
    private String nomePaciente;
    private String nomeMedico;
    private String descricao;
    private String dataConsulta;

 
    public void exibirDetalhes() {
        System.out.println("Consulta: " + identificacao);
        System.out.println("Paciente: " + nomePaciente);
        System.out.println("Médico: " + nomeMedico);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data: " + dataConsulta);
    }
}