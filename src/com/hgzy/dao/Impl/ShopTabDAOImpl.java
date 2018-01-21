package com.hgzy.dao.Impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.ShopTabDAO;
import com.hgzy.entity.ShopTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShopTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.ShopTab
 * @author MyEclipse Persistence Tools
 */
public class ShopTabDAOImpl extends HibernateDaoSupport implements ShopTabDAO{
	private static final Log log = LogFactory.getLog(ShopTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShopTab transientInstance) {
		log.debug("saving ShopTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShopTab persistentInstance) {
		log.debug("deleting ShopTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShopTab findById(java.lang.Integer id) {
		log.debug("getting ShopTab instance with id: " + id);
		try {
			ShopTab instance = (ShopTab) getHibernateTemplate().get(
					"com.hgzy.entity.ShopTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShopTab instance) {
		log.debug("finding ShopTab instance by example");
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
		log.debug("finding ShopTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShopTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShopTab instances");
		try {
			String queryString = "from ShopTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShopTab merge(ShopTab detachedInstance) {
		log.debug("merging ShopTab instance");
		try {
			ShopTab result = (ShopTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShopTab instance) {
		log.debug("attaching dirty ShopTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShopTab instance) {
		log.debug("attaching clean ShopTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShopTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (ShopTabDAOImpl) ctx.getBean("ShopTabDAO");
	}
}