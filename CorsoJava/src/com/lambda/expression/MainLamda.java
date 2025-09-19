package com.lambda.expression;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class MainLamda {

	public static void main(String[] args) {
		{
			Supplier<Double> f = () ->Math.random();
			System.out.println(f.get());
			
		}
		{
			List<Integer> lista = List.of(1,2,3);
			lista.stream().filter(a->a>1).forEach(elementoFiltrato -> System.out.println(elementoFiltrato));
		}
		{
			List<Integer> lista1 = List.of(1,2,3);
			List<Integer> listaPlus = lista1.stream().map(n ->n+1).collect(Collectors.toList());
			System.out.println(listaPlus);
		}
		{
			List<String> nomi = List.of("Andrea","Fabio","Luca");
			nomi.forEach(a -> System.out.println(a));
		}
		{
			
			Supplier<Double> RandomSupplier  = () -> Math.random();
			System.out.println(RandomSupplier.get());
			System.out.println(RandomSupplier.get());
			System.out.println(RandomSupplier.get());
			System.out.println(RandomSupplier.get());
		}
		{
			List<String> nomi1 = List.of("Andrea1","Fabio1","Luca1");
			String frase = nomi1.stream().reduce("", (a,b) -> a+""+b).trim();
			System.out.println(frase);
		}
		{
			List<Integer> n1 = List.of(75,12,38);
//			List<Integer> nM = n1.stream().map(n -> n * 2).toList();
			List<Integer> nM = n1.stream().map(n -> n * n).collect(Collectors.toList());
			System.out.println(n1);
			System.out.println(nM);
		}
		{
			List<String> parole = List.of("a","bc","def","ghil");
			Map<Integer,List<String>>Grouped = parole.stream().collect(Collectors.groupingBy(String :: length));
			System.out.println(Grouped);
		}	
	}
}


