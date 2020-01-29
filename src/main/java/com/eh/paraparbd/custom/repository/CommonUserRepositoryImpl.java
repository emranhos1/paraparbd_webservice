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
//import com.eh.paraparbd.entity.CommonUser;
//
//@Repository
//@Transactional(readOnly = true)
//public class CommonUserRepositoryImpl implements CommonUserRepositoryCustom {
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Override
//    public List<CommonUser> getMaxId() {
//        Query query = entityManager.createNativeQuery("SELECT MAX(common_user_id) as common_user_id FROM common_user", CommonUser.class);
////        query.setParameter(1, firstName + "%");
//        return query.getResultList();
//    }
//}
