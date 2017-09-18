package com.service;

import java.util.List;
import com.model.Guan;
import com.model.Guan1;
import com.model.User;

public interface IUserService {
	// ���һ���û���Ϣ
	public boolean add(User user);
	
	public boolean add1(Guan1 guan1);

	// ɾ��һ���û���Ϣ
	public boolean delete(int id);

	// �޸�һ���û���Ϣ
	public boolean update(User user);

	// ��ѯȫ���û���Ϣ
	public List<User> queryAll();
	/*public int checkGuan(Guan guan);*/
	public int cun(Guan guan);
}
