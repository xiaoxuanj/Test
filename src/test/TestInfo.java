package test;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

import inte.Info;

@Info(className = "pro.H",methodName = "h" )
public class TestInfo {
	   public static void main(String[] args) throws Exception {
		Info an = TestInfo.class.getAnnotation(Info.class);
		String className = an.className();
		String methodName = an.methodName();
		Class<?> aClass = Class.forName(className);
		Constructor<?> constructor = aClass.getConstructor(null);
		Object obj = constructor.newInstance();
		//Object object = aClass.newInstance();
		Method method = aClass.getMethod(methodName, null);
		method.invoke(obj, null);

	   }

}
