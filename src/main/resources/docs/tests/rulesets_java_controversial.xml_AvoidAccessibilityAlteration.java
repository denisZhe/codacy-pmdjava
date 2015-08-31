//#Patterns: controversial_AvoidAccessibilityAlteration

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

public class Violation {
    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {

            // Possible call to forbidden getDeclaredConstructors
            Class[] arrayOfClass = new Class[1];
            //#Err: controversial_AvoidAccessibilityAlteration
            this.getClass().getDeclaredConstructors();
            //#Err: controversial_AvoidAccessibilityAlteration
            this.getClass().getDeclaredConstructor(arrayOfClass);
            Class clazz = this.getClass();
            //#Err: controversial_AvoidAccessibilityAlteration
            clazz.getDeclaredConstructor(arrayOfClass);
            //#Err: controversial_AvoidAccessibilityAlteration
            clazz.getDeclaredConstructors();

            //#Err: controversial_AvoidAccessibilityAlteration
            clazz.getMethod("", arrayOfClass).setAccessible(false);
            //#Err: controversial_AvoidAccessibilityAlteration
            AccessibleObject.setAccessible(null, false);
            Method.setAccessible(null, false);
            Method[] methodsArray = clazz.getMethods();
            int nbMethod;

            for ( nbMethod = 0; nbMethod < methodsArray.length; nbMethod++  ) {
                //#Err: controversial_AvoidAccessibilityAlteration
                methodsArray[nbMethod].setAccessible(false);
            }
            
            // Possible call to forbidden PrivilegedAction
            PrivilegedAction priv = (PrivilegedAction) new Object(); priv.run();
    }
}
