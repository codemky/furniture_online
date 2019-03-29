package cn.itcast.mapper;

import cn.itcast.pojo.TbProductOrder;

public interface TbProductOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbProductOrder record);

    int insertSelective(TbProductOrder record);

    TbProductOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbProductOrder record);

    int updateByPrimaryKey(TbProductOrder record);
}