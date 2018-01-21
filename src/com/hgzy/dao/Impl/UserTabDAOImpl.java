package com.hgzy.dao.Impl;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.UserTabDAO;
import com.hgzy.entity.UserTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.UserTab
 * @author MyEclipse Persistence Tools
 */
public class UserTabDAOImpl extends HibernateDaoSupport implements UserTabDAO{
	private static final Log log = LogFactory.getLog(UserTabDAOImpl.class);
	// property constants
	public static final String UNAME = "uname";
	public static final String PWD = "pwd";
	public static final String ROLES = "roles";

	protected void initDao() {
		// do nothing
	}
	
	/**
	 * 通过账户和密码查询用户
	 * @param user
	 * @return
	 */
	public UserTab findUserByNameAndPwd(UserTab user){
		try {
			//定义查询SQL语句
			String sql = "from UserTab where username = ? and pwd = ?";
			List<UserTab> usertab = getHibernateTemplate().find(sql, user.getUsername(),user.getPwd());
			if (usertab.size()>0) {
				return usertab.get(0);
			}
			return null;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		
	}
	
	/**
	 * 根据code查询用户
	 * @param code
	 * @return
	 */
	public UserTab findUserByCode(String code){
		try {
			//定义查询SQL语句
			String sql = "from UserTab where code = ?";
			List<UserTab> usertab = getHibernateTemplate().find(sql,code);
			if (usertab.size()>0) {
				return usertab.get(0);
			}
			return null;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		
	}

	public void save(UserTab transientInstance) {
		log.debug("saving UserTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserTab persistentInstance) {
		log.debug("deleting UserTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserTab findById(java.lang.Integer id) {
		log.debug("getting UserTab instance with id: " + id);
		try {
			UserTab instance = (UserTab) getHibernateTemplate().get(
					"com.hgzy.entity.UserTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserTab instance) {
		log.debug("finding UserTab instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUname(Object uname) {
		return findByProperty(UNAME, uname);
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findByRoles(Object roles) {
		return findByProperty(ROLES, roles);
	}

	public List findAll() {
		log.debug("finding all UserTab instances");
		try {
			String queryString = "from UserTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserTab merge(UserTab detachedInstance) {
		log.debug("merging UserTab instance");
		try {
			UserTab result = (UserTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserTab instance) {
		log.debug("attaching dirty UserTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserTab instance) {
		log.debug("attaching clean UserTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	
	
	public static UserTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (UserTabDAOImpl) ctx.getBean("UserTabDAO");
	}

	/**
	 * 修改密码
	
	public void update(String pwd,Integer id) {
		try {
			//定义修改密码查询语句
			String hql = "update UserTab set pwd = "+pwd+" where id = "+id.toString();
			//得到session对象
			Session session = getSession();
			//开启事务
			session.beginTransaction();
			//执行修改密码的查询语句
			Query query = session.createQuery(hql);
			query.executeUpdate();
			//提交事务
			session.getTransaction().commit();
			//关闭session
			session.close();
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	} */

}