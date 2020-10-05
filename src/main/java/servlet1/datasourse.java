package servlet1;

import org.apache.commons.dbcp.BasicDataSource;

public class datasourse {
    //创建一个datasouce 对象
    private  static BasicDataSource bds=new BasicDataSource();
    static {
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/ljjsb");
        bds.setUsername("root");
        bds.setPassword("a654320a");
        //连接池进行自定义
        bds.setInitialSize(10);//初始化的链接对象
        bds.setMaxActive(5);//最大链接
        bds.setMaxIdle(5);//最大空闲
        bds.setMaxIdle(1);//最小空闲
    }
    public  static  BasicDataSource getBds(){
        return bds;
    }
}
