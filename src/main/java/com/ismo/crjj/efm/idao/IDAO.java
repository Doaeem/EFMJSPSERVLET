package com.ismo.crjj.efm.idao;

import java.util.List;

public interface IDao<T> {
	List<T> getAll();
	T getOne(int id);
	boolean create(T obj);
	boolean update(T obj);
	boolean delete(T obj);
}
