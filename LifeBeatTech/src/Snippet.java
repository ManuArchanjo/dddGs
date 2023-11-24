

public class Snippet {
	ublic static void main(String[] args) {
	        // Exemplo de uso das classes
	        Paciente_LifeBeatTech paciente = new Paciente_LifeBeatTech();
	        paciente.setNome("João");
	        paciente.setCpf("123.456.789-01");
	
	        Medico_LifeBeatTech medico = new Medico_LifeBeatTech();
	        medico.setNome("Doutor Silva");
	        medico.setEspecialidade("Cardiologia");
	
	        Consulta_LifeBeatTech consulta = new Consulta_LifeBeatTech();
	        consulta.setNomePaciente(paciente.getNome());
	        consulta.setNomeMedico(medico.getNome());
	        consulta.setDescricao("Check-up anual");
	        consulta.setDataConsulta("2023-11-22");
	
	        ConsultaEspecializada_LifeBeatTech consultaEspecializada = new ConsultaEspecializada_LifeBeatTech();
	        consultaEspecializada.setNomePaciente(paciente.getNome());
	        consultaEspecializada.setNomeMedico(medico.getNome());
	        consultaEspecializada.setDescricao("Consulta especializada");
	        consultaEspecializada.setDataConsulta("2023-11-23");
	        consultaEspecializada.setNomeEspecialidade("Cardiologia");
	
	        // Exibindo detalhes das consultas
	        System.out.println("Detalhes da Consulta:");
	        consulta.exibirDetalhes();
	
	        System.out.println("\nDetalhes da Consulta Especializada:");
	        consultaEspecializada.exibirDetalhes();
	    }
	}}