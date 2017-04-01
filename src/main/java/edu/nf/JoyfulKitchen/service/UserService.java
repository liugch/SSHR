package edu.nf.JoyfulKitchen.service;

import edu.nf.JoyfulKitchen.bean.User;
import edu.nf.JoyfulKitchen.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class UserService {

    @Resource
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> allUser(){
        List<User> list = userDao.getList();
        return list;
    }


}
