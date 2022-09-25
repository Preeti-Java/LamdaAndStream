package com.interviewstreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethod {

	public static void main(String[] args) {
		
		Stream.of("PREETI","CHINU","ASHISH")
		.filter(e->e.length()>5)
		.peek(e -> System.out.println("Filtered value "+e))
		.map(String::toLowerCase)
		.peek(e -> System.out.println("Mapped value "+e))
		.collect(Collectors.toList());
		
	}
}
