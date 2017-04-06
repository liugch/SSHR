package edu.nf.JoyfulKitchen.service;

import edu.nf.JoyfulKitchen.bean.User;
import edu.nf.JoyfulKitchen.dao.imple.UserDao;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class UserService {

    @Resource
    private UserDao userDao;

    public List<User> getAllUser() throws ServiceException {
        List<User> list = null;
        list = userDao.getList();

        return list;
    }

}