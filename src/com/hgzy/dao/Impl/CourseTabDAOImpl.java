package com.hgzy.dao.Impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hgzy.dao.CourseTabDAO;
import com.hgzy.entity.CourseTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * CourseTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.CourseTab
 * @author MyEclipse Persistence Tools
 */
public class CourseTabDAOImpl extends HibernateDaoSupport implements CourseTabDAO{
	private static final Log log = LogFactory.getLog(CourseTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CourseTab transientInstance) {
		log.debug("saving CourseTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CourseTab persistentInstance) {
		log.debug("deleting CourseTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CourseTab findById(java.lang.Integer id) {
		log.debug("getting CourseTab instance with id: " + id);
		try {
			CourseTab instance = (CourseTab) getHibernateTemplate().get(
					"com.hgzy.entity.CourseTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	
	public List<CourseTab> findByUserId(java.lang.Integer id) {
		try {
			String sql = "from CourseTab where userId = ?";
			List<CourseTab> Courses = getHibernateTemplate().find(sql,id);
			if (Courses.size()>0) {
				return Courses;
			}
			return null;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CourseTab instance) {
		log.debug("finding CourseTab instance by example");
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
		log.debug("finding CourseTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CourseTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CourseTab instances");
		try {
			String queryString = "from CourseTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CourseTab merge(CourseTab detachedInstance) {
		log.debug("merging CourseTab instance");
		try {
			CourseTab result = (CourseTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CourseTab instance) {
		log.debug("attaching dirty CourseTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CourseTab instance) {
		log.debug("attaching clean CourseTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CourseTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (CourseTabDAOImpl) ctx.getBean("CourseTabDAO");
	}
}