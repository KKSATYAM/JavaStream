package Stream;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter_Stream {
	
class Product
{
	int id, price;
	String name;
	public Product(int id, int price, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.price=price;
		this.name=name;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Product> product=new ArrayList<Product>();
		product.add(new Filter_Stream().new Product(11, 25000, "HP Laptop"));
		product.add(new Filter_Stream().new Product(14, 40000, "Dell Laptop"));
		product.add(new Filter_Stream().new Product(31, 150000, "Apple Laptop"));
		product.add(new Filter_Stream().new Product(61, 20000, "Air Pods"));
		product.add(new Filter_Stream().new Product(13, 10000, "Lenevo Laptop"));
		
		product.stream().filter(pro->pro.price<=25000).forEach(pr->System.out.println(pr.name));
		
		
		
//		List<Integer> even_number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*
		 * List<Integer>
		 * even=even_number.stream().filter(n->n%2==0).collect(Collectors.toList());
		 * 
		 * System.out.println(even);
		 */
//		even_number.stream().filter(n->n%2==0).forEach(num->System.out.println(num));
		
//		List<String> names=Arrays.asList("Ramu",null,"Mohit",null,"Sneha","Satish","Ashish",null);
//		names.stream().filter(str->str.charAt(0)=='A'|| str.charAt(0)=='S').forEach(name->System.out.println(name));
		
		/*
		 * List<String>
		 * nam=names.stream().filter(str->str==null).collect(Collectors.toList());
		 * 
		 * for(String name:nam) { System.out.println(name); }
		 */
		
	
	}

}
