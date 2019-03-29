package cn.itcast.mapper;

import cn.itcast.pojo.TbProduct;

public interface TbProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbProduct record);

    int insertSelective(TbProduct record);

    TbProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbProduct record);

    int updateByPrimaryKey(TbProduct record);
}