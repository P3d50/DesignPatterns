package abstractfactory;

import factorymethod.Emissor;

public interface ComunicadorFactory {
	
	Emissor createEmissor();
	Receptor createReceptor();

}
