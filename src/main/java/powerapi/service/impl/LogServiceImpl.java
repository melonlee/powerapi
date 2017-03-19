package powerapi.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import powerapi.entity.Log;
import powerapi.mapper.LogMapper;
import powerapi.service.LogService;

import java.util.List;

/**
 * Created by Melon on 17/2/22.
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {


    @Override
    public List<Log> findLogByUser(Long id) {
        return this.selectList(new EntityWrapper<Log>().eq("user_id", id).orderBy("createdate", false));
    }
}
