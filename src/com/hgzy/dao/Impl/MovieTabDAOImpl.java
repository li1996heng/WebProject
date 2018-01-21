package com.hgzy.dao.Impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.MovieTabDAO;
import com.hgzy.entity.MovieTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * MovieTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.MovieTab
 * @author MyEclipse Persistence Tools
 */
public class MovieTabDAOImpl extends HibernateDaoSupport implements MovieTabDAO{
	private static final Log log = LogFactory.getLog(MovieTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MovieTab transientInstance) {
		log.debug("saving MovieTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MovieTab persistentInstance) {
		log.debug("deleting MovieTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MovieTab findById(java.lang.Integer id) {
		log.debug("getting MovieTab instance with id: " + id);
		try {
			MovieTab instance = (MovieTab) getHibernateTemplate().get(
					"com.hgzy.entity.MovieTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MovieTab instance) {
		log.debug("finding MovieTab instance by example");
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
		log.debug("finding MovieTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MovieTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MovieTab instances");
		try {
			String queryString = "from MovieTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MovieTab merge(MovieTab detachedInstance) {
		log.debug("merging MovieTab instance");
		try {
			MovieTab result = (MovieTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MovieTab instance) {
		log.debug("attaching dirty MovieTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MovieTab instance) {
		log.debug("attaching clean MovieTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MovieTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (MovieTabDAOImpl) ctx.getBean("MovieTabDAO");
	}
}