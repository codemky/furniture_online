package cn.itcast.mapper;

import cn.itcast.pojo.TbFeedback;

public interface TbFeedbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbFeedback record);

    int insertSelective(TbFeedback record);

    TbFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbFeedback record);

    int updateByPrimaryKey(TbFeedback record);
}