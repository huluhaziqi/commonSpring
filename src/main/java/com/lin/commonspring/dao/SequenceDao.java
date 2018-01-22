package com.lin.commonspring.dao;

import com.lin.commonspring.dao.generated.SequenceMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SequenceDao extends SequenceMapper {

	@Select("select nex_id from sequence where table_name = #{table_name}")
	Long getByTableName(@Param("table_name") String tableName);

	@Update("update sequence set nex_id = nex_id + 1 where table_name = #{table_name} and nex_id = #{id	}")
	int increaseNexId(@Param("table_name") String tableName, @Param("id") long id);
}
