package criacionais.abstractfactory;

import criacionais.factorymethod.Emissor;

public interface ComunicadorFactory {
	
	Emissor createEmissor();
	Receptor createReceptor();

}
