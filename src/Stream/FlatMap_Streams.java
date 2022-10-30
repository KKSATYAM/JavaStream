package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(1,2,5);
		List<Integer> list2=Arrays.asList(3,7,8);
		List<Integer> list3=Arrays.asList(10,11,12);
		
		List<List<Integer>> lists=Arrays.asList(list1,list2,list3);
		List<Integer> result=lists.stream().flatMap(l->l.stream().map(num->num*2)).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> name1=Arrays.asList("Ram","Shyam","Rohit");
		List<String> name2=Arrays.asList("Auto","John","Vitalik");
		List<String> name3=Arrays.asList("Ben","Rob","James");
		System.out.println();
		List<List<String>> names=Arrays.asList(name1,name2,name3);
		for(List<String> n: names)
		{
			for(String name:n)
			{
				System.out.print(name.toUpperCase()+" ");
			}
		}
		System.out.println();
		List<String> n=names.stream().flatMap(x->x.stream().map(a->a.toUpperCase())).collect(Collectors.toList());
		System.out.println(n);
	
		
	}

}
