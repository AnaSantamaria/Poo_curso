package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Cuenta;

public class CuentasService {
	
	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", Double.valueOf("125477.44")),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", Double.valueOf("9465.59")),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		   new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 
	
	//metodo que a partir de numero de cuenta nos indica si existe o no dicha cuenta
	//metodo que a partir de nombre de divisa, nos dice cuantas cuentas hay de dicha divisa
	////método que a partir de una fecha, nos indique cuantas
	//cuentas se crearon a partir de dicha fecha 
	
	//método que a partir de número de cuenta nos indica si existe o no dicha cuenta
		public boolean existeCuenta(String numeroCuenta) {
			return cuentas.stream()
			.anyMatch(c->c.getNumeroDeCuenta().equals(numeroCuenta));
		}
		//método que a partir de nombre de divisa, nos dice cuantas cuentas hay de dicha divisa
		public int cuentasPorDivisa(String divisa) {
			return (int)cuentas.stream()
					.filter(c->c.getDivisa().equalsIgnoreCase(divisa)) //Stream<Cuenta>
					.count();//long
		}
		
		//método que a partir de una fecha, nos indique cuantas
		//cuentas se crearon a partir de dicha fecha
		public int contarCuentasDespuesFecha(LocalDate fecha) {
			return (int)cuentas.stream()
					.filter(c->c.getFechaApertura().isAfter(fecha))
					.count();
		}
		
		public Stream<Cuenta> BuscarCueta(String titular) {
			return cuentas.stream()
		            .filter(c->c.getTitular().equals(titular));
		            
		}
		
		//Metodo con la cuenta con menor saldo
		
		public Cuenta cuentaConMenorSaldo(String saldo) {
		/*	return cuentas.stream()
					.sorted((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
					.findFirst()////optional cuenta
					.orElse(null);*/
			/*return cuentas.stream()
					.min(a,b)->Double.compare(a.getSaldo(), b.getSaldo())
                    .orElse(null);*/
			
			return cuentas.stream()
					.min(Comparator.comparingDouble(c->c.getSaldo()))
					.orElse(null);
			
			
		}
		//metodo que devuelva un map con los numeros de cuentas como claves saldo como valor
		public Map<String,Double> cuentasSaldos() {
			
			return cuentas.stream()
					.collect(Collectors.toMap(p->p.getTitular(), p->p.getSaldo()));
			
			//.collect(Collectors.toMap( p->p.getDni(),p->p.getNombre())); 

		}
		//método que devuelve una tabla ade cuentas agrupadas por divisa
		
				public Map<String,List<Cuenta>> cuentasPorDivisa(){
					return cuentas.stream()
							.collect(Collectors.groupingBy(d->d.getDivisa()));
					
					
				}
}
