package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Eklendi");

    }

    @Override
    public void delete(User user) {
        System.out.println("Silindi");

    }

    @Override
    public void update(User user) {

    }
}
