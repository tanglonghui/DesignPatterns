package BehavioralPatterns.Interpreter;

import java.util.HashMap;
import java.util.Stack;

/*
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，
 * 它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文。
 * 这种模式被用在 SQL 解析、符号处理引擎等。
 */
/*
 * 包含对象：
 * AbstractExpression（抽象表达式）
 * TerminalExpression（终结符表达式）
 * NonterminalExpression（非终结符表达式）
 * Context（环境类）
 * Client（客户类）
 */
public class Test {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		String str="1 + 12 - 1";
		calculator.build(str);
		System.out.println(calculator.compute());
	}
}
//解释器封装类Calculator（计算器类）

