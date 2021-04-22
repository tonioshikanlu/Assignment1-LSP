package org.howard.edu.lsp.exam.question40;

public interface Animals 
{
	default void speak() {
		System.out.println("This Animal speaks");
	};
	default void move() {
		System.out.println("This Animal moves");
	};
}