package com.github.wesleyegberto.mathlib;

/**
 * with exported public interface
 * we can access a non-exported class
*/
public interface Operation<T, E> {
	public T apply(E x, E y);
}