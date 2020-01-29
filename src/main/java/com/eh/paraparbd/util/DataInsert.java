//package com.eh.paraparbd.util;
//
//import java.util.Date;
//
//import javax.websocket.Session;
//
//import com.eh.paraparbd.entity.AllUser;
//
//public class DataInsert {
//
//	public static void loadData(){
//		Session session = HibernateSessionUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        
//        //Add new Employee object
//        AllUser emp = new AllUser();
//        emp.setActiveDate(new Date());
//        emp.setActiveStatus(1);
//        emp.setInactiveDate(new Date());
//        emp.setUserId(1);
//        emp.setUserRole("ADMIN");
//         
//        //Save the employee in database
//        session.save(emp);
//// 
////        //Commit the transaction
//        session.getTransaction().commit();
//        HibernateUtil.shutdown();
//		System.out.print("##########################################Hi############################");
//	}
//}
