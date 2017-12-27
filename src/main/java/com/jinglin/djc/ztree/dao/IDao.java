package com.jinglin.djc.ztree.dao;

import java.util.List;

public interface IDao<T> {

	int additem(T t);
	int delitem(Object id);
	int updateitem(T t);
	T getmodel(Object id);
	List<T> getlist(T t);
}
