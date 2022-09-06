package com.example.jingdongdistribution.Util;


import java.sql.*;

public class SqlConnection {
    static String url="jdbc:mysql://rm-2vc9eqf1572jkn4vsoo.mysql.cn-chengdu.rds.aliyuncs.com:3306/jd?serverTimezone=UTC&useSSL=false&characterEncoding=UTF-8&useOldAliasMetadataBehavior=true";
    static String username="root";
    static String password="Jd123456";
    //初始化
    static Connection conn= null;//连接
    static ResultSet rs=null;//结果集
    static PreparedStatement ps=null;//预编译语句对象
    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动；
            conn= DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            System.out.println("sql驱动初始化失败！");
            e.printStackTrace();
        }
        return conn;
    }

}
