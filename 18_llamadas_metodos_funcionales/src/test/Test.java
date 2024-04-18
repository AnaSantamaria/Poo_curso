package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		
		FuncionalesService service=new FuncionalesService();
		
		service.m1(Set.of(8,4,7), s->s.length());
		service.m2(()->"ciudad", c->System.out.println("ciudad"));
        service.m3((a,b)->a+b, (a,b)->a);//El primero recibe 2 parametros Double y devuelve un resultado double, el segundo recibe un integer(a) y un String(b) y me devuelve un integer (a)
        service.m4((a,b)->System.out.println(a+b),(a,b)->a.length()>b);
        service.m5(()->5, List.of("casa","coche","ciudad","pais"));
        service.m6(Map.of("a",1,"b",2), (a,b)->System.out.println(a+b));
        service.m7(a->List.of(3,5,1));
        }

}
