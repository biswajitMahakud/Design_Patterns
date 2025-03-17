package SingletonDesignPattern;
import java.lang.reflect.Constructor;
class InfosysEmployee{
    private static InfosysEmployee emp;
    private InfosysEmployee(){
        if(emp != null){
            throw new RuntimeException("Trying to break singleton design pattern! BEST OF LUCK");
        }
        
    }

    public static InfosysEmployee getEmployee(){
        if(emp == null)
            emp = new InfosysEmployee();
        
        return emp;
    }
}
public class BreakSingletonDesign{
    public static void main(String[] args) throws Exception{
        /*
         * 1. By using Reflection API
         * 2. By using enum
         * 3. By using Serialization and Deserialization
         * 4. By using cloneable
         * 
         * Check both 3 & 4 to break Singleton Design pattern...
         */

         InfosysEmployee emp1 = InfosysEmployee.getEmployee();
         System.out.println(emp1.hashCode());
         Constructor<InfosysEmployee> constructor = InfosysEmployee.class.getDeclaredConstructor();
         constructor.setAccessible(true);
         InfosysEmployee emp2 = constructor.newInstance();
         System.out.println(emp2.hashCode());
    }
}
