/**
 * 
 */
package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.AtmDAO;
import com.entities.ATM;
@Service("atmService")
public class AtmService {
  @Autowired
  AtmDAO atmDAO;
  /**
   * @description: get data of atm from atmDAO.
   * @author User
   * @create:Dec 28, 2017 @modifier.
   * @modifined date :Dec 28, 2017
   * @return list atm.
   */
  @Transactional
  public List<ATM> getATM() {
    return atmDAO.getATM();
  }
}
