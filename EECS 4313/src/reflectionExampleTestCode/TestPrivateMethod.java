package reflectionExampleTestCode;

import java.lang.reflect.Method;

import reflectionExampleAppCode.ClassWithPrivateMethod;

public class TestPrivateMethod
{
  
    public static void main(String[] args) throws Exception {
        ClassWithPrivateMethod test = new ClassWithPrivateMethod();
        Method[] methods =
                 test.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; ++i) {
         if (methods[i].getName().equals("sayHello")) {
          Object params[] = {"Ross"};
          methods[i].setAccessible(true);
          Object ret = methods[i].invoke(test, params);
          System.out.println(ret);
         }
        }
    }}
