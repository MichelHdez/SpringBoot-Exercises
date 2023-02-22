package Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "resultados", url = "localhost:9001")
public interface ResultadoCliente {

	@GetMapping("/resultado/{numero}")
	public String mostrarResultado(@PathVariable Float numero);

}
