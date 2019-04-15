package kr.co.jsphomme.purchaselist.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jsphomme.member.vo.MemberVo;
import kr.co.jsphomme.purchaselist.vo.PurchaseListVo;

@Repository
public class PurchaseListDaoImpl implements PurchaseListDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	String namespace = "kr.co.jsphomme.member.";
	
	@Override
	public PurchaseListVo purchaseListInsert(PurchaseListVo purchaseListVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo purchaseListView() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"memberListView");
	}

	@Override
	public int purchaseListDelete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
