
public class ConsultaEspecializada_LifeBeatTech extends Consulta_LifeBeatTech {
    private String codigoEspecialidade;
    private String nomeEspecialidade;

  
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Especialidade: " + nomeEspecialidade);
    }
}