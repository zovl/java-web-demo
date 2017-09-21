package zovlzhongguanhua.demo.mybatis;

import java.util.List;

public interface SystemUserMapper {

    SystemUserBean selectById(Long id);

    SystemUserBean selectByIds(List<Long> ids);

    List<SystemUserBean> selectAll(SystemUserBean systemUserBean);

    Long insert(SystemUserBean systemUserBean);

    void update(SystemUserBean systemUserBean);

    void delete(Long id);
}
