package com.hgzy.dao.Impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.PlayTabDAO;
import com.hgzy.entity.PlayTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * PlayTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.PlayTab
 * @author MyEclipse Persistence Tools
 */
public class PlayTabDAOImpl extends HibernateDaoSupport implements PlayTabDAO{
	private static final Log log = LogFactory.getLog(PlayTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PlayTab transientInstance) {
		log.debug("saving PlayTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PlayTab persistentInstance) {
		log.debug("deleting PlayTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PlayTab findById(java.lang.Integer id) {
		log.debug("getting PlayTab instance with id: " + id);
		try {
			PlayTab instance = (PlayTab) getHibernateTemplate().get(
					"com.hgzy.entity.PlayTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PlayTab instance) {
		log.debug("finding PlayTab instance by example");
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
		log.debug("finding PlayTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PlayTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PlayTab instances");
		try {
			String queryString = "from PlayTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PlayTab merge(PlayTab detachedInstance) {
		log.debug("merging PlayTab instance");
		try {
			PlayTab result = (PlayTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PlayTab instance) {
		log.debug("attaching dirty PlayTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PlayTab instance) {
		log.debug("attaching clean PlayTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PlayTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (PlayTabDAOImpl) ctx.getBean("PlayTabDAO");
	}
}