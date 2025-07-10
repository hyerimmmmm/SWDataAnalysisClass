package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MemberDAO {
	SqlSessionFactory sessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	public int join(MemberVO member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		
		int res = sqlSession.insert("com.smhrd.database.MemberMapper.join", member);
		
		sqlSession.close();
		
		return res;
	}
	
	public MemberVO login(MemberVO member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		
		MemberVO res = sqlSession.selectOne("com.smhrd.database.MemberMapper.login", member);
		
		sqlSession.close();
		
		return res;
	}
	
	public int idCheck(String id) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		int count = sqlSession.selectOne("com.smhrd.database.MemberMapper.idCheck", id);
		sqlSession.close();
		return count;
	}
	
	public int update(MemberVO member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		int res = sqlSession.update("com.smhrd.database.MemberMapper.update", member);
		sqlSession.close();
		
		return res;
		
	}
}
 