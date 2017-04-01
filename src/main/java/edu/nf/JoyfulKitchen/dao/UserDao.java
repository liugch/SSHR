package edu.nf.JoyfulKitchen.dao;

import edu.nf.JoyfulKitchen.bean.User;
import edu.nf.JoyfulKitchen.dao.base.GenericDaoImpl;
import edu.nf.JoyfulKitchen.dao.intfac.IUserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao extends GenericDaoImpl<User,Long> implements IUserDao {


}
