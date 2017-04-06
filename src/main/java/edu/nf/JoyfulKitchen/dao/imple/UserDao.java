package edu.nf.JoyfulKitchen.dao.imple;

import edu.nf.JoyfulKitchen.bean.User;
import edu.nf.JoyfulKitchen.dao.base.GenericDaoImpl;
import edu.nf.JoyfulKitchen.dao.intface.IUserDao;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/5.
 */
@Component("userDao")
public class UserDao extends GenericDaoImpl<User,Long> implements IUserDao {

}
