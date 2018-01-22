package com.lin.commonspring.service.impl;

import com.lin.commonspring.dao.SequenceDao;
import com.lin.commonspring.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequenceServiceImpl implements SequenceService {

	@Autowired
	private SequenceDao sequenceDao;

	@Override
	public Long getNexIdByTableName(String tableName) {
		synchronized (sequenceDao) {// 只能锁住进程内，不能锁住分布式，所以需要重试。
			int updateResult;
			Long id;
			do {
				id = sequenceDao.getByTableName(tableName);
				if (id == null) {
					break;
				}
				updateResult = sequenceDao.increaseNexId(tableName, id);
			} while (updateResult == 0);
			return id;
		}
	}

}
