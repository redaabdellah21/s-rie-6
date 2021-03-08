package exo14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exo14 {

	public static void main(String[] args) {
		List<String> words= new ArrayList<>();
		words.add("one");
		words.add("two");
		words.add("three");
		words.add("four");
		words.add("five");
		words.add("six");
		words.add("seven");
		words.add("eight");
		words.add("nine");
		words.add("ten");
		words.add("eleven");
		words.add("twelve");
		
		System.out.println("\n Question 1 \n");
				words.stream()
					 .forEach( System.out::println);
		
		System.out.println("\n Question 2 \n");
				words.stream()
					 .map(String::toUpperCase)
					 .forEach( System.out::println);
		
		System.out.println("\n Question 3 \n");
				words.stream()
					 .map(s-> s.substring(0,1).toUpperCase())
					 .distinct()
					 .forEach( System.out::println);
		
		System.out.println("\n Question 4 \n");
				words.stream()
					 .map(String::length)
					 .distinct()
					 .forEach(System.out::println);
		
		System.out.println("\n Question 5 \n");
		System.out.println("Nombre d'éléments du stream: "+
				words.stream()
					 .count());
		
		System.out.println("\n Question 6 \n");
		System.out.println("Nombre d'éléments du stream qui ont une longueur paire: "+
				words.stream()
					 .filter( s-> s.length()%2==0)
					 .count());
		
		System.out.println("\n Question 7 \n");
		System.out.println("Taille de la plus lognue chaine: "+
				words.stream()
					 .map(String::length)
					 .max(Integer::compare)
					 .get());
		
		System.out.println("\n Question 8 \n");
		System.out.println("Les éléments qui ont une taille impare misent en majuscules: "+
				words.stream()
					 .map(String::toUpperCase)
					 .filter(s-> s.length()%2!=0)
					 .collect(Collectors.toList()));
		
		System.out.println("\n Question 9 \n");
		System.out.println("Les élements qui ont une taille infèrieure ou égale à 5: "+
				words.stream()
					 .sorted()
					 .filter(  s-> s.length()<=5)
					 .collect(Collectors.joining(", ","{","}")));
	
		System.out.println("\n Question 10 \n");
		System.out.println("Listes des éléments regrouper par leur taille:\n "+
				words.stream()
					 .sorted()
					 .filter(  s-> s.length()<=5)
					 .collect(Collectors.groupingBy(String::length)));
		System.out.println("\n Question 11 \n");
		System.out.println("Listes des éléments regrouper par leur premiere lettres et concaténés:\n "+
				words.stream()
					 .sorted()
					 .filter(  s-> s.length()<=5)
					 .collect(Collectors.groupingBy(s -> s.substring(0,1),Collectors.joining(", ","{","}"))));
	}

}
