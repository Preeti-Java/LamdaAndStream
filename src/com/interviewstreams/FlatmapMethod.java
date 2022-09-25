package com.interviewstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapMethod {

	public static void main(String[] args) {
		
		List<String> str=Arrays.asList("Preeti", "Ashish", "Manish");
		List<String> str1=Arrays.asList("Preeti1", "Ashish1", "Manish1");
		List<String> str2=Arrays.asList("Preeti2", "Ashish2", "Manish2");
		
		List<List<String>> list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		list.add(str2);
		//list[str[],str1[],str2[]]
		List<String> newList=new ArrayList<>();
		for(List<String> list1:list) {
			for(String list2:list1) {
				newList.add(list2);
				
			}
		}
		System.out.println("Without Stream API :"+newList);
		
		List<String> flatMapLIst=list.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println("With Stream API :"+flatMapLIst);
	}
}
