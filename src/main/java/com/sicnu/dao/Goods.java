package com.sicnu.dao;

import com.sicnu.domain.Good;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Goods {
    void Buy(@Param("id") int id,@Param("mount") int mount);
    Good GetGoodById(@Param("id") int id);
    List<Good> GetAllGoods();
}
