package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

import inte.Check;
import pro.Calculator;

public class TestCheck {
	public static void main(String[] args) throws IOException {
	Calculator calculator = new Calculator();
	Class<? extends Calculator> aClass = calculator.getClass();
	Method[] methods = aClass.getMethods();
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("log,txt"));
	int num = 0 ;
	for(Method method:methods) {
		if(method.isAnnotationPresent(Check.class)) {
			try {
				method.invoke(calculator);
			} catch (Exception e) {
				num++;
				bufferedWriter.write(method.getName()+"�����쳣");
				bufferedWriter.newLine();
				bufferedWriter.write("�쳣���ƣ�"+e.getCause().getClass().getSimpleName());
				bufferedWriter.newLine();
				bufferedWriter.write("�쳣ԭ��"+e.getCause().getMessage());
				bufferedWriter.newLine();
				bufferedWriter.write("=========================================");
				bufferedWriter.newLine();
				// TODO: handle exception
			}
		}
	}
	bufferedWriter.write("���β���һ������"+num+"���쳣");
	bufferedWriter.flush();
	bufferedWriter.close();
}
}
