package com.base.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.base.persistence.Test;
import com.base.service.HomeService;
import com.base.service.repository.TestMapper;

@Service
public class HomeServiceImpl  implements HomeService {
	@Autowired
	private TestMapper testMapper;
 
	/*@Autowired
	RedisTemplate<String, String> redisTemplate;
	@Autowired
	private MongoTemplate mongoTemplate;*/
  	
	@Override
	public List<Map> showindexs() {
		/*redisTemplate.opsForValue().set("liuli", "liuli123");
		redisTemplate.convertAndSend("java", "java我发布的消息!");
		redisTemplate.convertAndSend("okjava", "okjava");
		redisTemplate.convertAndSend("CCCC", "CCC");
		System.out.println(mongoTemplate.toString());*/
		Test t=new Test();
		t.setIautoId(100);
		t.setItset(123123);
		t.setIvalue(1111111);
		t.setSname("haode");
		/*mongoTemplate.insert(t);
		Query qy=new Query();
		qy.query(new Criteria("{'iautoId':100}"));
		List<Test> rest=mongoTemplate.find(new Query(), Test.class);
		System.err.println(">>>>>sname:"+rest);
		 System.out.println(">>>>into service");
		 List<Test> list=testMapper.showindex();
		 System.out.println(list);*/
		List<Test> list= testMapper.showindex();
		for(Test temp:list){
			System.out.println(temp.getSname());
		}
		System.out.println("����������"+list);
		// System.out.println(0/0);
		 testMapper.updateindex();
		 System.out.println("SUCCESS");
		return null;
	}

}
