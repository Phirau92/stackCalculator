package at.edu.c02.calculator;


public interface Calculator {

	enum Operation {
		// Fabian + Philip: mod operation added
		add, sub, mul, div, mod
	};
	//test
	//test
	void push(double value);
	
	double pop() throws CalculatorException;
	
	double perform(Operation op) throws CalculatorException;
	
	void clear(); 
}
