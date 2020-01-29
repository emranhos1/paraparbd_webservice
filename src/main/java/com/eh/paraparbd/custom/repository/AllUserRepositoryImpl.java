//package com.eh.paraparbd.custom.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.eh.paraparbd.entity.AllUser;
//
//@Repository
//@Transactional(readOnly = true)
//public class AllUserRepositoryImpl implements AllUserRepositoryCustom {
//
//    @PersistenceContext
//    EntityManager entityManager;
//    
//    @Override
//    public AllUser activeUser(int allUserId) {
//      Query query = entityManager.createNativeQuery("SELECT MAX(all_user_id) as all_user_id FROM all_user", AllUser.class);
////      query.setParameter(1, firstName + "%");
//      return query.getResultList();
//    }
//}
