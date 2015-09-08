package news.dao;

import java.io.Serializable;
import java.util.List;

/**
 * DAO 接口
 *
 * @param <T>
 * @author gqy
 */
public interface MysqlDao<T> {
    /**
     *
     *
     * @param o  保存的对象
     * @return Serializable
     */
    Serializable save(T o);

    /**
     * 删除一个对象
     * @param o 删除的对象
     *
     */
    void delete(T o);

    /**
     * 更新一个对象
     *
     * @param o 更新的对象
     */
    void update(T o);

    /**
     * 保存或更新对象
     *
     * @param o 保存/更新的对象
     */
    void saveOrUpdate(T o);

    /**
     * 查询
     *
     * @param hql 查询语句
     * @return 结果集（List）
     */
    List<T> find(String hql);

    /**
     * 查询集合
     *
     * @param hql 查询语句
     * @param param  obj 数组
     * @return 结果集（List）
     */
    List<T> find(String hql, Object[] param);

    /**
     * 查询集合
     *
     * @param hql 查询语句
     * @param param obj 集合
     * @return 结果集
     */
    List<T> find(String hql, List<Object> param);

    /**
     * 查询集合(带分页)
     *
     * @param hql  语句
     * @param param 哦比较集合
     * @param page  查询第几页
     * @param rows  每页显示几条记录
     * @return 结果集
     */
    List<T> find(String hql, Object[] param, Integer page, Integer rows);

    /**
     * 查询集合(带分页)
     *
     * @param hql 语句
     * @param param 查询集合
     * @param page 查询第几页
     * @param rows 每页显示几条记录
     * @return 结果集
     */
    List<T> find(String hql, List<Object> param, Integer page, Integer rows);

    /**
     * 获得一个对象
     *
     * @param c  对象类型
     * @param id id
     * @return Object 结果对象
     */
    T get(Class<T> c, Serializable id);

    /**
     * 获得一个对象
     *
     * @param hql 语句
     * @param param 对象数组
     * @return Object 结果对象
     */
    T get(String hql, Object[] param);

    /**
     * 获得一个对象
     *
     * @param hql  语句
     * @param param 对象集合
     * @return  结果对象
     */
    T get(String hql, List<Object> param);

    /**
     * select count(*) from 类
     *
     * @param hql 语句
     * @return count数量
     */
    Long count(String hql);

    /**
     * select count(*) from 类
     *
     * @param hql 语句
     * @param param 对象数组
     * @return count数量
     */
    Long count(String hql, Object[] param);

    /**
     * select count(*) from 类
     *
     * @param hql 语句
     * @param param 对象集合
     * @return count数两
     */
    Long count(String hql, List<Object> param);

    /**
     * 执行HQL语句
     *
     * @param hql 语句
     * @return 响应数目
     */
    Integer executeHql(String hql);

    /**
     * 执行HQL语句
     *
     * @param hql 语句
     * @param param obj 数组
     * @return 响应数目
     */
    Integer executeHql(String hql, Object[] param);

    /**
     * 执行HQL语句
     *
     * @param hql 语句
     * @param param ojb集合
     * @return 响应数目
     */
    Integer executeHql(String hql, List<Object> param);
}
