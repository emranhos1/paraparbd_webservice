//package com.eh.paraparbd.custom.repository;
//
//import org.springframework.data.jpa.repository.Query;
//
//import com.eh.paraparbd.entity.AllUser;
//
//public interface AllUserRepositoryCustom {
//
//    @Query("SELECT a FROM allUser a WHERE a.activeStatus = 1 AND a.allUserId = ?1")
//    AllUser activeUser(int allUserId);
//}
