
public class Consulta {
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

public final class ConsultaEspecialista extends Consulta {
    private String codigoEspecialidade;
    private String nomeEspecialidade;

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Especialidade: " + nomeEspecialidade);
    }
}
