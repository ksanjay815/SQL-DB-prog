package Demo;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;



public class A1 {

	

	public static void main(String[] args) {
		
			//List<Integer> num=Arrays.asList(10,9,8,7,6,5,4,3,2,1);
			//List<Integer> sortedList=num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			//sortedList. forEach(System.out::println);
			
			
		//List<String> slist = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");      
			//List<String>sortedList=slist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());  
			//sortedList.forEach(System.out::println);  
 
	
	//	List <Integer> num =Arrays.asList(1,27,456,234,235);
		//List<Integer> sortedList= num.stream().sorted(Comparator.reverseOrder()).map(n->n*2).collect(Collectors.toList());
		//sortedList.forEach(System.out::println);

		
	//	List<String> obj=Arrays.asList("sravan","siva","balu","naveen");
		//Optional<String> num=obj.stream() 
          //      .reduce((word1, word2) 
          //-> word1.length() > word2.length() 
                        //? word1 : word2); 

//num.ifPresent(System.out::println);
		
List<Object> obj=Arrays.asList("sravan",124,"naveen",1445,"siva",123);
	Optional<Object> num=obj.stream()
			.reduce((word1,word2)
					->((String) word1).length()> ((String) word2).length()
			?word1:word2);
		
		
//	ArrayList<String> t = new ArrayList<>();
	// t.add("java");
	// t.add("is");
	// t.add("awesome");
	// for (String s : t) {
		// System.out.println(s);
		
	
		
		
	}
		
		
		
		
	}
