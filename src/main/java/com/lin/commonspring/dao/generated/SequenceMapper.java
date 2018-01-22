package com.lin.commonspring.dao.generated;

import com.lin.commonspring.model.entity.SequenceEntity;
import com.lin.commonspring.model.entity.SequenceEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SequenceMapper {
    @SelectProvider(type=SequenceSqlProvider.class, method="countByExample")
    long countByExample(SequenceEntityExample example);

    @DeleteProvider(type=SequenceSqlProvider.class, method="deleteByExample")
    int deleteByExample(SequenceEntityExample example);

    @Insert({
        "insert into sequence (table_name, nex_id)",
        "values (#{tableName,jdbcType=VARCHAR}, #{nexId,jdbcType=BIGINT})"
    })
    int insert(SequenceEntity record);

    @InsertProvider(type=SequenceSqlProvider.class, method="insertSelective")
    int insertSelective(SequenceEntity record);

    @SelectProvider(type=SequenceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nex_id", property="nexId", jdbcType=JdbcType.BIGINT)
    })
    List<SequenceEntity> selectByExample(SequenceEntityExample example);

    @UpdateProvider(type=SequenceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SequenceEntity record, @Param("example") SequenceEntityExample example);

    @UpdateProvider(type=SequenceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SequenceEntity record, @Param("example") SequenceEntityExample example);
}