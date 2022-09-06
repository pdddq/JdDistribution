package com.example.jingdongdistribution.dao;

import com.example.jingdongdistribution.Util.SqlConnection;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdDao {
    //连接
    Connection cn = SqlConnection.getConnection();
    ResultSet rs = null;//结果集
    //创建预编译对象
    PreparedStatement pstmt = null;
    int n = -1;

//    public int addRow(String PowerOfAttorneyNumber, String ConsignmentNoteNumber) {
//
//        // 创建sql语句
//        String sql = "insert into testjd(PowerOfAttorneyNumber,ConsignmentNoteNum) values(" + PowerOfAttorneyNumber + ","
//                + ConsignmentNoteNumber + ")";
//        //将sql语句绑定到对象中,可能抛出异常,返回int值表明查询结果
//        try {
//            pstmt = cn.prepareStatement(sql);
//            //发送给mysql执行
//            n = pstmt.executeUpdate();//执行并更新，返回int
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        //如果连接成功，不管是否插入，都要关闭数据库
//        finally {
//            if (cn != null) {
//                try {
//                    cn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return n;
//    }
//
//        //可参考方法
////        step3:执行查询
////        ResultSet rs = stmt.executeQuery(); //rs就是SQL查询语句返回的结果集
////        step4:处理结果(java 获取SQL查询语句返回的结果)
////        List list = new ArrayList();
//////遍历结果集，这样写就可以了，就是一个循环，有多少条记录，这里就会循环多少次，
//////一次就是一条记录，想像一下就像一个表的一条记录
//////在这里可以做查询出来的数据处理，可以封装成对象之类的（就是把值给它）
////        if(rs.next()) { //遍历结果集，这样写就可以了
////            User u = new User();
////            String username = rs.getString("username");
////            String address = rs.getString("password ");
////            u.setUsername(username);
////            u.setAddress(address);
////            list.add(u);
//
//
//    public int selectRow(String PowerOfAttorneyNumber, String ConsignmentNoteNumber) {
//
//        // 创建sql语句
//        String sql = "select PowerOfAttorneyNumber,ConsignmentNoteNumber from testjd" +
//                "where PowerOfAttorneyNumber=" + PowerOfAttorneyNumber + "" +
//                ", ConsignmentNoteNumber=" + ConsignmentNoteNumber + " ";
//
//        //将sql语句绑定到对象中,可能抛出异常,返回int值表明查询结果
//        try {
//            pstmt = cn.prepareStatement(sql);
//            //发送给mysql执行
//            n = pstmt.executeUpdate();//执行并更新，返回int
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        //如果连接成功，不管是否插入，都要关闭数据库
//        finally {
//            if (cn != null) {
//                try {
//                    cn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return n;
//    }

    public  int addUpdDel(String sql) {
        int i = -1;
        try {
            pstmt = cn.prepareStatement(sql);
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("sql数据库增删改异常");
            e.printStackTrace();
        }
        //如果连接成功，不管是否插入，都要关闭数据库

        return i;
    }

    public  int selectSql(String sql) {
        int i = -1;
        try {
            pstmt = cn.prepareStatement(sql);
            i= pstmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
        //如果连接成功，不管是否插入，都要关闭数据库

        return i;
    }

    public  ResultSet selectsetSql(String sql){
        try {
             pstmt=  cn.prepareStatement(sql);
            rs =  pstmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
//        finally {
//            if (cn != null) {
//                try {
//                    cn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        return rs;
    }

//    public void closeConn() {
//        try {
//            cn.close();
//        } catch (SQLException e) {
//            System.out.println("sql数据库关闭异常");
//            e.printStackTrace();
//        }
//    }
}

