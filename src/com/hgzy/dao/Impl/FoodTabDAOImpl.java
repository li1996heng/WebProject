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

import com.hgzy.dao.FoodTabDAO;
import com.hgzy.entity.FoodTab;

/**
 * A data access object (DAO) providing persistence and search support for
 * FoodTab entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hgzy.entity.FoodTab
 * @author MyEclipse Persistence Tools
 */
public class FoodTabDAOImpl extends HibernateDaoSupport implements FoodTabDAO{
	private static final Log log = LogFactory.getLog(FoodTabDAOImpl.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FoodTab transientInstance) {
		log.debug("saving FoodTab instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FoodTab persistentInstance) {
		log.debug("deleting FoodTab instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FoodTab findById(java.lang.Integer id) {
		log.debug("getting FoodTab instance with id: " + id);
		try {
			FoodTab instance = (FoodTab) getHibernateTemplate().get(
					"com.hgzy.entity.FoodTab", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FoodTab instance) {
		log.debug("finding FoodTab instance by example");
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
		log.debug("finding FoodTab instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FoodTab as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FoodTab instances");
		try {
			String queryString = "from FoodTab";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FoodTab merge(FoodTab detachedInstance) {
		log.debug("merging FoodTab instance");
		try {
			FoodTab result = (FoodTab) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FoodTab instance) {
		log.debug("attaching dirty FoodTab instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FoodTab instance) {
		log.debug("attaching clean FoodTab instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FoodTabDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (FoodTabDAOImpl) ctx.getBean("FoodTabDAO");
	}
	
	/*
	 * 查询总记录数
	 */
	public int findCount() {
		String hql = "select count(*) from FoodTab";
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
	 * 分页查询部门
	 */
	public List<FoodTab> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(FoodTab.class);
		List<FoodTab> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}
	
	
	/*
	 * 根据某一字段模糊查询
	 */
	public List<FoodTab> findFoodByLike(String key) {
		//定义HQL模糊查询语句
		String hql = "from FoodTab as f where f.foodName like ? " +
				"or f.discount like ? or f.hava like ? or f.shopId = " +
				"(select s.shopId from ShopTab as s where s.shopName like ?)";
		List<FoodTab> list = getHibernateTemplate().find(hql, new Object [] 
				{"%"+key+"%",key,"%"+key+"%","%"+key+"%"});
		if (list.size() > 0) {
			return list;
		}
		return null;
	}
}