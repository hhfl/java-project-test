package subsistema2.cep;

import com.dio.singleton.SingletonF;

public class CepApi {
    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
