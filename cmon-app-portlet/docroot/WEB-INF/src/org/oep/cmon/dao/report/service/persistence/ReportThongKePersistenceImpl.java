/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.cmon.dao.report.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.cmon.dao.report.NoSuchReportThongKeException;
import org.oep.cmon.dao.report.model.ReportThongKe;
import org.oep.cmon.dao.report.model.impl.ReportThongKeImpl;
import org.oep.cmon.dao.report.model.impl.ReportThongKeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the report thong ke service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author VIENPN
 * @see ReportThongKePersistence
 * @see ReportThongKeUtil
 * @generated
 */
public class ReportThongKePersistenceImpl extends BasePersistenceImpl<ReportThongKe>
	implements ReportThongKePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ReportThongKeUtil} to access the report thong ke persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ReportThongKeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
			ReportThongKeModelImpl.FINDER_CACHE_ENABLED,
			ReportThongKeImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
			ReportThongKeModelImpl.FINDER_CACHE_ENABLED,
			ReportThongKeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
			ReportThongKeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the report thong ke in the entity cache if it is enabled.
	 *
	 * @param reportThongKe the report thong ke
	 */
	public void cacheResult(ReportThongKe reportThongKe) {
		EntityCacheUtil.putResult(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
			ReportThongKeImpl.class, reportThongKe.getPrimaryKey(),
			reportThongKe);

		reportThongKe.resetOriginalValues();
	}

	/**
	 * Caches the report thong kes in the entity cache if it is enabled.
	 *
	 * @param reportThongKes the report thong kes
	 */
	public void cacheResult(List<ReportThongKe> reportThongKes) {
		for (ReportThongKe reportThongKe : reportThongKes) {
			if (EntityCacheUtil.getResult(
						ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
						ReportThongKeImpl.class, reportThongKe.getPrimaryKey()) == null) {
				cacheResult(reportThongKe);
			}
			else {
				reportThongKe.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all report thong kes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ReportThongKeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ReportThongKeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the report thong ke.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ReportThongKe reportThongKe) {
		EntityCacheUtil.removeResult(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
			ReportThongKeImpl.class, reportThongKe.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ReportThongKe> reportThongKes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ReportThongKe reportThongKe : reportThongKes) {
			EntityCacheUtil.removeResult(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
				ReportThongKeImpl.class, reportThongKe.getPrimaryKey());
		}
	}

	/**
	 * Creates a new report thong ke with the primary key. Does not add the report thong ke to the database.
	 *
	 * @param reportThongKePK the primary key for the new report thong ke
	 * @return the new report thong ke
	 */
	public ReportThongKe create(ReportThongKePK reportThongKePK) {
		ReportThongKe reportThongKe = new ReportThongKeImpl();

		reportThongKe.setNew(true);
		reportThongKe.setPrimaryKey(reportThongKePK);

		return reportThongKe;
	}

	/**
	 * Removes the report thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reportThongKePK the primary key of the report thong ke
	 * @return the report thong ke that was removed
	 * @throws org.oep.cmon.dao.report.NoSuchReportThongKeException if a report thong ke with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ReportThongKe remove(ReportThongKePK reportThongKePK)
		throws NoSuchReportThongKeException, SystemException {
		return remove((Serializable)reportThongKePK);
	}

	/**
	 * Removes the report thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the report thong ke
	 * @return the report thong ke that was removed
	 * @throws org.oep.cmon.dao.report.NoSuchReportThongKeException if a report thong ke with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportThongKe remove(Serializable primaryKey)
		throws NoSuchReportThongKeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ReportThongKe reportThongKe = (ReportThongKe)session.get(ReportThongKeImpl.class,
					primaryKey);

			if (reportThongKe == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchReportThongKeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(reportThongKe);
		}
		catch (NoSuchReportThongKeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ReportThongKe removeImpl(ReportThongKe reportThongKe)
		throws SystemException {
		reportThongKe = toUnwrappedModel(reportThongKe);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, reportThongKe);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(reportThongKe);

		return reportThongKe;
	}

	@Override
	public ReportThongKe updateImpl(
		org.oep.cmon.dao.report.model.ReportThongKe reportThongKe, boolean merge)
		throws SystemException {
		reportThongKe = toUnwrappedModel(reportThongKe);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, reportThongKe, merge);

			reportThongKe.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		EntityCacheUtil.putResult(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
			ReportThongKeImpl.class, reportThongKe.getPrimaryKey(),
			reportThongKe);

		return reportThongKe;
	}

	protected ReportThongKe toUnwrappedModel(ReportThongKe reportThongKe) {
		if (reportThongKe instanceof ReportThongKeImpl) {
			return reportThongKe;
		}

		ReportThongKeImpl reportThongKeImpl = new ReportThongKeImpl();

		reportThongKeImpl.setNew(reportThongKe.isNew());
		reportThongKeImpl.setPrimaryKey(reportThongKe.getPrimaryKey());

		reportThongKeImpl.setCAPCOQUANQUANLYID(reportThongKe.getCAPCOQUANQUANLYID());
		reportThongKeImpl.setCOQUANQUANLYID(reportThongKe.getCOQUANQUANLYID());
		reportThongKeImpl.setTHANG(reportThongKe.getTHANG());
		reportThongKeImpl.setNAM(reportThongKe.getNAM());
		reportThongKeImpl.setTONGNHAN(reportThongKe.getTONGNHAN());
		reportThongKeImpl.setTIEPNHAN(reportThongKe.getTIEPNHAN());
		reportThongKeImpl.setTONDAU(reportThongKe.getTONDAU());
		reportThongKeImpl.setTONGDAGIAIQUYET(reportThongKe.getTONGDAGIAIQUYET());
		reportThongKeImpl.setSOM(reportThongKe.getSOM());
		reportThongKeImpl.setDUNG(reportThongKe.getDUNG());
		reportThongKeImpl.setTRE(reportThongKe.getTRE());
		reportThongKeImpl.setTONGDANGGIAIQUYET(reportThongKe.getTONGDANGGIAIQUYET());
		reportThongKeImpl.setCHUADENHAN(reportThongKe.getCHUADENHAN());
		reportThongKeImpl.setQUAHAN(reportThongKe.getQUAHAN());
		reportThongKeImpl.setRUTHOSO(reportThongKe.getRUTHOSO());
		reportThongKeImpl.setKHONGHOPLE(reportThongKe.getKHONGHOPLE());
		reportThongKeImpl.setTYLE(reportThongKe.getTYLE());
		reportThongKeImpl.setTONCUOI(reportThongKe.getTONCUOI());

		return reportThongKeImpl;
	}

	/**
	 * Returns the report thong ke with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the report thong ke
	 * @return the report thong ke
	 * @throws com.liferay.portal.NoSuchModelException if a report thong ke with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportThongKe findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((ReportThongKePK)primaryKey);
	}

	/**
	 * Returns the report thong ke with the primary key or throws a {@link org.oep.cmon.dao.report.NoSuchReportThongKeException} if it could not be found.
	 *
	 * @param reportThongKePK the primary key of the report thong ke
	 * @return the report thong ke
	 * @throws org.oep.cmon.dao.report.NoSuchReportThongKeException if a report thong ke with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ReportThongKe findByPrimaryKey(ReportThongKePK reportThongKePK)
		throws NoSuchReportThongKeException, SystemException {
		ReportThongKe reportThongKe = fetchByPrimaryKey(reportThongKePK);

		if (reportThongKe == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + reportThongKePK);
			}

			throw new NoSuchReportThongKeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				reportThongKePK);
		}

		return reportThongKe;
	}

	/**
	 * Returns the report thong ke with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the report thong ke
	 * @return the report thong ke, or <code>null</code> if a report thong ke with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportThongKe fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((ReportThongKePK)primaryKey);
	}

	/**
	 * Returns the report thong ke with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reportThongKePK the primary key of the report thong ke
	 * @return the report thong ke, or <code>null</code> if a report thong ke with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ReportThongKe fetchByPrimaryKey(ReportThongKePK reportThongKePK)
		throws SystemException {
		ReportThongKe reportThongKe = (ReportThongKe)EntityCacheUtil.getResult(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
				ReportThongKeImpl.class, reportThongKePK);

		if (reportThongKe == _nullReportThongKe) {
			return null;
		}

		if (reportThongKe == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				reportThongKe = (ReportThongKe)session.get(ReportThongKeImpl.class,
						reportThongKePK);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (reportThongKe != null) {
					cacheResult(reportThongKe);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ReportThongKeModelImpl.ENTITY_CACHE_ENABLED,
						ReportThongKeImpl.class, reportThongKePK,
						_nullReportThongKe);
				}

				closeSession(session);
			}
		}

		return reportThongKe;
	}

	/**
	 * Returns all the report thong kes.
	 *
	 * @return the report thong kes
	 * @throws SystemException if a system exception occurred
	 */
	public List<ReportThongKe> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the report thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of report thong kes
	 * @param end the upper bound of the range of report thong kes (not inclusive)
	 * @return the range of report thong kes
	 * @throws SystemException if a system exception occurred
	 */
	public List<ReportThongKe> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the report thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of report thong kes
	 * @param end the upper bound of the range of report thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of report thong kes
	 * @throws SystemException if a system exception occurred
	 */
	public List<ReportThongKe> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ReportThongKe> list = (List<ReportThongKe>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REPORTTHONGKE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REPORTTHONGKE.concat(ReportThongKeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ReportThongKe>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ReportThongKe>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the report thong kes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ReportThongKe reportThongKe : findAll()) {
			remove(reportThongKe);
		}
	}

	/**
	 * Returns the number of report thong kes.
	 *
	 * @return the number of report thong kes
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REPORTTHONGKE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the report thong ke persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.cmon.dao.report.model.ReportThongKe")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ReportThongKe>> listenersList = new ArrayList<ModelListener<ReportThongKe>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ReportThongKe>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ReportThongKeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = BaocaochitietPersistence.class)
	protected BaocaochitietPersistence baocaochitietPersistence;
	@BeanReference(type = CongChuc2RolePersistence.class)
	protected CongChuc2RolePersistence congChuc2RolePersistence;
	@BeanReference(type = CoQuanQuanLy2LinhVucPersistence.class)
	protected CoQuanQuanLy2LinhVucPersistence coQuanQuanLy2LinhVucPersistence;
	@BeanReference(type = DanhMucBaoCaoPersistence.class)
	protected DanhMucBaoCaoPersistence danhMucBaoCaoPersistence;
	@BeanReference(type = DanhMucRolePersistence.class)
	protected DanhMucRolePersistence danhMucRolePersistence;
	@BeanReference(type = Lephi_chitietPersistence.class)
	protected Lephi_chitietPersistence lephi_chitietPersistence;
	@BeanReference(type = Lephi_linhvucPersistence.class)
	protected Lephi_linhvucPersistence lephi_linhvucPersistence;
	@BeanReference(type = Lephi_tonghopPersistence.class)
	protected Lephi_tonghopPersistence lephi_tonghopPersistence;
	@BeanReference(type = ReportThongKePersistence.class)
	protected ReportThongKePersistence reportThongKePersistence;
	@BeanReference(type = ReportTongHopPersistence.class)
	protected ReportTongHopPersistence reportTongHopPersistence;
	@BeanReference(type = ReportTongHopChiTietPersistence.class)
	protected ReportTongHopChiTietPersistence reportTongHopChiTietPersistence;
	@BeanReference(type = Role2BaoCaoPersistence.class)
	protected Role2BaoCaoPersistence role2BaoCaoPersistence;
	@BeanReference(type = Role2DonViBaoCaoPersistence.class)
	protected Role2DonViBaoCaoPersistence role2DonViBaoCaoPersistence;
	@BeanReference(type = Role2NhomTTHCPersistence.class)
	protected Role2NhomTTHCPersistence role2NhomTTHCPersistence;
	@BeanReference(type = Role2TTHCPersistence.class)
	protected Role2TTHCPersistence role2TTHCPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_REPORTTHONGKE = "SELECT reportThongKe FROM ReportThongKe reportThongKe";
	private static final String _SQL_COUNT_REPORTTHONGKE = "SELECT COUNT(reportThongKe) FROM ReportThongKe reportThongKe";
	private static final String _ORDER_BY_ENTITY_ALIAS = "reportThongKe.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ReportThongKe exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ReportThongKePersistenceImpl.class);
	private static ReportThongKe _nullReportThongKe = new ReportThongKeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ReportThongKe> toCacheModel() {
				return _nullReportThongKeCacheModel;
			}
		};

	private static CacheModel<ReportThongKe> _nullReportThongKeCacheModel = new CacheModel<ReportThongKe>() {
			public ReportThongKe toEntityModel() {
				return _nullReportThongKe;
			}
		};
}