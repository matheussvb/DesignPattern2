package facadeEsingletons;

public class Programa {

    String cpf = "123";

    EmpresaFacade empresaFacade = new EmpresaFacadeSigleton().getInstancia();


}
