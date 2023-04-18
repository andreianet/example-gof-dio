package one.dio.gof.facade;

import sub.cep.CepApi;
import sub.crm.CrmService;

public class Facade {
    
    public void migrarCliente(String name, String cep) {
        String estado = CepApi.getInstancia().recuperarCep(cep);
        String cidade = CepApi.getInstancia().recuperarCep(cep);

        CrmService.gravarCliente(name, cep, cidade, estado);
    }
}
