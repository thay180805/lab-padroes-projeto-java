package subsistema2.cep;

/**
 * Singleton que simula a consulta de CEP.
 * Facade poderá utilizar essa classe para obter cidade e estado.
 */
public class CepApi {

    // Instância única (eager initialization)
    private static final CepApi instancia = new CepApi();

    // Construtor privado para impedir instanciamento externo
    private CepApi() {
    }

    // Método público para obter a instância única
    public static CepApi getInstancia() {
        return instancia;
    }

    /**
     * Recupera a cidade baseada no CEP.
     * @param cep CEP informado
     * @return Nome da cidade
     */
    public String recuperarCidade(String cep) {
        // Aqui você poderia simular CEPs diferentes
        switch (cep) {
            case "14801788":
                return "Araraquara";
            case "01001000":
                return "São Paulo";
            default:
                return "Cidade desconhecida";
        }
    }

    /**
     * Recupera o estado baseada no CEP.
     * @param cep CEP informado
     * @return Sigla do estado
     */
    public String recuperarEstado(String cep) {
        // Simulação simples de acordo com o CEP
        switch (cep) {
            case "14801788":
                return "SP";
            case "01001000":
                return "SP";
            default:
                return "Estado desconhecido";
        }
    }
}
