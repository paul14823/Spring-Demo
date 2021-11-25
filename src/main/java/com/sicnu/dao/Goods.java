package com.sicnu.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Goods {
    void Buy(@Param("id") int id,@Param("mount") int mount);
}
