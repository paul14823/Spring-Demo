package com.sicnu.services.interfaces;

import com.sicnu.domain.Good;

import java.util.List;

public interface IShop {
    void BuySometh(int goodid,int mount);
    List<Good> GetKC();
}
