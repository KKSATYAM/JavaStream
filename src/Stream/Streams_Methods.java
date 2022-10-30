package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Streams_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List<String> vechile=Arrays. asList("car","bus","bike","car","bike",
		 * "truck","train","car","bike");
		 * 
		 * vechile.stream().distinct().forEach(vec->System.out.print(vec+" "));
		 * System.out.println();
		 * vechile.stream().distinct().limit(3).forEach(v->System.out.print(v+" "));
		 * System.out.println(); List<Integer> number=Arrays.asList(1,2,3,4,5,6,11,9);
		 * System.out.println(number.stream().filter(num->num%2==0).count());
		 * System.out.println();
		 */
//		number.stream().min((a,b)->{
//				return a.compareTo(b)};)
		/*
		 * Optional<Integer> opt=number.stream().max((a,b)->{return a.compareTo(b);});
		 * System.out.println(opt.get());
		 */
		/*
		 * number.stream().distinct().min((a,b)->{ return a.compareTo(b);} );
		 * 
		 * System.out.println(); List<String> word=Arrays.asList("A","X","Z","0");
		 * Optional<String> words=word.stream().reduce((a,b)->{return a+b;});
		 * System.out.println(words.get());
		 */
		
//		List<Integer> list=Arrays.asList(1,4,3,90,46,93,22);
		/*
		 * Optional<Integer> num=list.stream().distinct().limit(5).max((a,b)->{return
		 * a.compareTo(b);});
		 * 
		 * System.out.println(num.get());
		 */
		/*
		 * Optional<Integer>i=list.stream().min((a,b)->{return a.compareTo(b);});
		 * System.out.println(i.get()); List<String>
		 * str=Arrays.asList("A","M","R","10","44");
		 */
		/*
		 * Optional<String> st=str.stream().reduce((a,b)->{return a+b;});
		 * System.out.println(st.get()); System.out.println(); List<String> word=new
		 * ArrayList<String>(); word.add("Word"); word.add("C"); word.add("Two");
		 * word.add("Priya"); word.add("Raman"); word.add("Subha");
		 * 
		 * word.stream().filter(s->s.length()>=2).forEach(s->System.out.println(s));
		 * System.out.println(); List<Integer> Num=Arrays.asList(3,5,2,0,8); Object[]
		 * ar=Num.stream().toArray(); for(Object a:ar) System.out.print(a+"..");
		 */
		
//		Optional<String> s=str.stream().reduce((a,b)->{return a+b;});
//		System.out.println(s.get());
		
		/*
		 * Set<String> names=new HashSet<String>(); //
		 * "John 123","Aatma","Peter","Zoya","Java" names.add("John 123");
		 * names.add("Aatma"); names.add("Peter"); names.add("Zoya");
		 * names.add("Java xxx");
		 */
		List<String> names=Arrays.asList("xXJohn 123","AXatma","Peter","Zoya","Java");
//		names.stream().sorted(Comparator.reverseOrder()).forEach(name->System.out.print(name+" "));
//		
//		System.out.println("**********");
//		
		List<Integer> num1=Arrays.asList(1,4,2,5,6);
		List<Integer> num2=Arrays.asList(40,38,29,11,12);
		
		Stream.concat(num1.stream(), num2.stream()).filter(num->num%2==0).forEach(num->System.out.print(num+" "));
		System.out.println();
		//allmatch
		
		Boolean flag=names.stream().noneMatch(letter->{return letter.startsWith("x");});
		System.out.println(flag);
		
		System.out.println(names.stream().findAny().get());
		
		
		
	}

}
