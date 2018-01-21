package com.hgzy.dao.Impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.StoreTabDAO;
import com.hgzy.entity.StoreTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * StoreTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.StoreTab
 * @author MyEclipse Persistence Tools
 */
public class StoreTabDAOImpl extends HibernateDaoSupport implements StoreTabDAO{
	private static final Log log = LogFactory.getLog(StoreTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(StoreTab transientInstance) {
		log.debug("saving StoreTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StoreTab persistentInstance) {
		log.debug("deleting StoreTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StoreTab findById(java.lang.Integer id) {
		log.debug("getting StoreTab instance with id: " + id);
		try {
			StoreTab instance = (StoreTab) getHibernateTemplate().get(
					"com.hgzy.entity.StoreTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StoreTab instance) {
		log.debug("finding StoreTab instance by example");
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
		log.debug("finding StoreTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from StoreTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all StoreTab instances");
		try {
			String queryString = "from StoreTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StoreTab merge(StoreTab detachedInstance) {
		log.debug("merging StoreTab instance");
		try {
			StoreTab result = (StoreTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StoreTab instance) {
		log.debug("attaching dirty StoreTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StoreTab instance) {
		log.debug("attaching clean StoreTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static StoreTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (StoreTabDAOImpl) ctx.getBean("StoreTabDAO");
	}
}