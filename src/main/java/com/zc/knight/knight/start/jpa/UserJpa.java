package com.zc.knight.knight.start.jpa;

import com.zc.knight.knight.start.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserJpa  extends JpaRepository<UserEntity,Long>, JpaSpecificationExecutor<UserEntity>, Serializable{

}
