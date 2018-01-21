package com.hgzy.dao.Impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.LibraryTabDAO;
import com.hgzy.entity.FoodTab;
import com.hgzy.entity.LibraryTab;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * A data access object (DAO) providing persistence and search support for
 * LibraryTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.LibraryTab
 * @author MyEclipse Persistence Tools
 */
public class LibraryTabDAOImpl extends HibernateDaoSupport implements LibraryTabDAO{
	private static final Log log = LogFactory.getLog(LibraryTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}
	
	/*
	 * 根据某一字段模糊查询   
	 */
	public List<LibraryTab> findLibraryByLike(String key){
		String hql = "from LibraryTab as l where l.bookName like ? or l.bookClass like ?" +
				"or l.author like ? or l.press like ? or l.hava like ?";
		List<LibraryTab> list = getHibernateTemplate().find(hql,new Object []{"%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%"});
		if (list.size()>0) {
			return list;
		}
		return null;
	}
	
	public void save(LibraryTab transientInstance) {
		log.debug("saving LibraryTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LibraryTab persistentInstance) {
		log.debug("deleting LibraryTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LibraryTab findById(java.lang.Integer id) {
		log.debug("getting LibraryTab instance with id: " + id);
		try {
			LibraryTab instance = (LibraryTab) getHibernateTemplate().get(
					"com.hgzy.entity.LibraryTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LibraryTab instance) {
		log.debug("finding LibraryTab instance by example");
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
		log.debug("finding LibraryTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LibraryTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LibraryTab instances");
		try {
			String queryString = "from LibraryTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LibraryTab merge(LibraryTab detachedInstance) {
		log.debug("merging LibraryTab instance");
		try {
			LibraryTab result = (LibraryTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LibraryTab instance) {
		log.debug("attaching dirty LibraryTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LibraryTab instance) {
		log.debug("attaching clean LibraryTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LibraryTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (LibraryTabDAOImpl) ctx.getBean("LibraryTabDAO");
	}

	/*
	 * 查询总记录数
	 */
	public int findCount() {
		String hql = "select count(*) from LibraryTab";
		Session session = getSession();
		Query query = session.createQuery(hql);
		int count = ((Long) query.setCacheable(true).uniqueResult()).intValue();
		if(count > 0 ) {
			//System.out.println(count);
			return count;
		}
		session.close();
		return 0;
	}
	
	/*
	 * 分页查询图书信息
	 */
	public List<LibraryTab> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(LibraryTab.class);
		List<LibraryTab> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	/*
	 * 根据某一字段模糊查询
	 */
	public List<LibraryTab> findFoodByLike(String key) {
		String hql = "from LibraryTab as l where l.bookClass like ? or l.bookName like ? or l.hava like ? or l.author like ? or  l.press like ?";
		List<LibraryTab> list = getHibernateTemplate().find(hql,new Object []{"%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%"});
		if (list.size() > 0) {
			return list;
			
		}
		return null;
	}
}