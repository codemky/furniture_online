package cn.itcast.service.impl;

import cn.itcast.pojo.TbAdmin;
import cn.itcast.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2019-03-29 9:34
 */
@Service
public class TestServiceImpl implements TestService {
    /*@Resource
    private TbAdminMapper tbAdminMapper;*/

    @Override
    public TbAdmin findById(int id) {
        /*TbAdmin tbAdmin = tbAdminMapper.selectByPrimaryKey(id);
        return tbAdmin;*/

        System.out.println("-------");


        return null;
    }
}
