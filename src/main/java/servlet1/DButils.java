package servlet1;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.util.List;


public class DButils {
    private  static QueryRunner qr=new QueryRunner(datasourse.getBds());
    public DButils(){

    }
    public  static  boolean login(String username,String password){
        boolean flag=false;
        String sql="select * from users where username=? and password=?";
        String []b={username,password};
        try {
            List<Object[]> a=qr.query(sql,new ArrayListHandler(),b);
            if(a.size()>0){
                flag=true;
            }
            else {
                flag=false;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
