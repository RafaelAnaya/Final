/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.espec;

import java.util.List;

/**
 *
 * @author RAFAEL
 */
public interface CrudDaoEspc <T>{
    T getForId(String id);

  List<T> getForAll();

  List<T> getForCriteria(T bean);

  void insert(T bean);

  void update(T bean);

  void delete(String id);
}
