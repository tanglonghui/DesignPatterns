package StructuralPatterns.Bridge;

interface Color{
	<T extends Shape> void paint(T t);
}
