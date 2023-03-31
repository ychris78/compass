/*
 * Copyright 2023 OPPO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oppo.cloud.mapper;

import com.oppo.cloud.model.TaskInstance;
import com.oppo.cloud.model.TaskInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskInstanceMapper {
    long countByExample(TaskInstanceExample example);

    int deleteByExample(TaskInstanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskInstance record);

    int insertSelective(TaskInstance record);

    List<TaskInstance> selectByExample(TaskInstanceExample example);

    TaskInstance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskInstance record, @Param("example") TaskInstanceExample example);

    int updateByExample(@Param("record") TaskInstance record, @Param("example") TaskInstanceExample example);

    int updateByPrimaryKeySelective(TaskInstance record);

    int updateByPrimaryKey(TaskInstance record);
}