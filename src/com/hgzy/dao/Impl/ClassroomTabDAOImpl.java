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

import com.hgzy.dao.ClassroomTabDAO;
import com.hgzy.entity.ClassroomTab;
import com.hgzy.entity.LibraryTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * ClassroomTab entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hgzy.entity.ClassroomTab
 * @author MyEclipse Persistence Tools
 */
public class ClassroomTabDAOImpl extends HibernateDaoSupport implements ClassroomTabDAO{
	private static final Log log = LogFactory.getLog(ClassroomTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ClassroomTab transientInstance) {
		log.debug("saving ClassroomTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ClassroomTab persistentInstance) {
		log.debug("deleting ClassroomTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ClassroomTab findById(java.lang.Integer id) {
		log.debug("getting ClassroomTab instance with id: " + id);
		try {
			ClassroomTab instance = (ClassroomTab) getHibernateTemplate().get(
					"com.hgzy.entity.ClassroomTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ClassroomTab instance) {
		log.debug("finding ClassroomTab instance by example");
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
		log.debug("finding ClassroomTab instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ClassroomTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ClassroomTab instances");
		try {
			String queryString = "from ClassroomTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ClassroomTab merge(ClassroomTab detachedInstance) {
		log.debug("merging ClassroomTab instance");
		try {
			ClassroomTab result = (ClassroomTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ClassroomTab instance) {
		log.debug("attaching dirty ClassroomTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ClassroomTab instance) {
		log.debug("attaching clean ClassroomTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ClassroomTabDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (ClassroomTabDAOImpl) ctx.getBean("ClassroomTabDAO");
	}

	/*
	 * 查询总记录数
	 */
	public int findCount() {
		String hql = "select count(*) from ClassroomTab";
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
	 * 分页查询教室
	 */
	public List<ClassroomTab> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(ClassroomTab.class);
		List<ClassroomTab> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	
	/*
	 * 根据某一字段模糊查询
	 */
	public List<ClassroomTab> findClassroomByLike(String key) {
		String hql = "from ClassroomTab as l where l.classroomName like ? or l.hava like ?" +
				"or l.teacher like ? or l.class_ like ?";
		List<ClassroomTab> list = getHibernateTemplate().find(hql,new Object []{"%"+key+"%","%"+key+"%","%"+key+"%","%"+key+"%"});
		if (list.size()>0) {
			return list;
		}
		return null;
	}
}