package com.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.entities.ATM;

@Repository
public class AtmDAO {
  @Autowired
  private SessionFactory sessionFactory;
  
  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }
  
  /**
   * @description: get list ATM from database.
   * @author NHDUONG
   * @create:Dec 28, 2017
   * @return list atm.
   */
  @SuppressWarnings("unchecked")
  public List<ATM> getATM() {
    Session session = this.sessionFactory.getCurrentSession();
    List<ATM> query = session.createNativeQuery("spGetATM").addEntity(ATM.class).list();
    return query;
  }
}
