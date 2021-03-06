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

package org.oep.cmon.dao.tlct.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException;
import org.oep.cmon.dao.tlct.model.DanhMucGiayTo;
import org.oep.cmon.dao.tlct.model.impl.DanhMucGiayToImpl;
import org.oep.cmon.dao.tlct.model.impl.DanhMucGiayToModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the danh muc giay to service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Liemnn
 * @see DanhMucGiayToPersistence
 * @see DanhMucGiayToUtil
 * @generated
 */
public class DanhMucGiayToPersistenceImpl extends BasePersistenceImpl<DanhMucGiayTo>
	implements DanhMucGiayToPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DanhMucGiayToUtil} to access the danh muc giay to persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DanhMucGiayToImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_MA = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED,
			DanhMucGiayToImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByMa",
			new String[] { String.class.getName() },
			DanhMucGiayToModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MA = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMa",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_BYMA = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED,
			DanhMucGiayToImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByByMa",
			new String[] { String.class.getName() },
			DanhMucGiayToModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BYMA = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByByMa",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAI =
		new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED,
			DanhMucGiayToImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTrangThai",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI =
		new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED,
			DanhMucGiayToImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTrangThai", new String[] { Integer.class.getName() },
			DanhMucGiayToModelImpl.DAXOA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAI = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTrangThai",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED,
			DanhMucGiayToImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED,
			DanhMucGiayToImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the danh muc giay to in the entity cache if it is enabled.
	 *
	 * @param danhMucGiayTo the danh muc giay to
	 */
	public void cacheResult(DanhMucGiayTo danhMucGiayTo) {
		EntityCacheUtil.putResult(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToImpl.class, danhMucGiayTo.getPrimaryKey(),
			danhMucGiayTo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
			new Object[] { danhMucGiayTo.getMa() }, danhMucGiayTo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BYMA,
			new Object[] { danhMucGiayTo.getMa() }, danhMucGiayTo);

		danhMucGiayTo.resetOriginalValues();
	}

	/**
	 * Caches the danh muc giay tos in the entity cache if it is enabled.
	 *
	 * @param danhMucGiayTos the danh muc giay tos
	 */
	public void cacheResult(List<DanhMucGiayTo> danhMucGiayTos) {
		for (DanhMucGiayTo danhMucGiayTo : danhMucGiayTos) {
			if (EntityCacheUtil.getResult(
						DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
						DanhMucGiayToImpl.class, danhMucGiayTo.getPrimaryKey()) == null) {
				cacheResult(danhMucGiayTo);
			}
			else {
				danhMucGiayTo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all danh muc giay tos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DanhMucGiayToImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DanhMucGiayToImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the danh muc giay to.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DanhMucGiayTo danhMucGiayTo) {
		EntityCacheUtil.removeResult(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToImpl.class, danhMucGiayTo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(danhMucGiayTo);
	}

	@Override
	public void clearCache(List<DanhMucGiayTo> danhMucGiayTos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DanhMucGiayTo danhMucGiayTo : danhMucGiayTos) {
			EntityCacheUtil.removeResult(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
				DanhMucGiayToImpl.class, danhMucGiayTo.getPrimaryKey());

			clearUniqueFindersCache(danhMucGiayTo);
		}
	}

	protected void clearUniqueFindersCache(DanhMucGiayTo danhMucGiayTo) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA,
			new Object[] { danhMucGiayTo.getMa() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BYMA,
			new Object[] { danhMucGiayTo.getMa() });
	}

	/**
	 * Creates a new danh muc giay to with the primary key. Does not add the danh muc giay to to the database.
	 *
	 * @param id the primary key for the new danh muc giay to
	 * @return the new danh muc giay to
	 */
	public DanhMucGiayTo create(long id) {
		DanhMucGiayTo danhMucGiayTo = new DanhMucGiayToImpl();

		danhMucGiayTo.setNew(true);
		danhMucGiayTo.setPrimaryKey(id);

		return danhMucGiayTo;
	}

	/**
	 * Removes the danh muc giay to with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the danh muc giay to
	 * @return the danh muc giay to that was removed
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo remove(long id)
		throws NoSuchDanhMucGiayToException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the danh muc giay to with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the danh muc giay to
	 * @return the danh muc giay to that was removed
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhMucGiayTo remove(Serializable primaryKey)
		throws NoSuchDanhMucGiayToException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DanhMucGiayTo danhMucGiayTo = (DanhMucGiayTo)session.get(DanhMucGiayToImpl.class,
					primaryKey);

			if (danhMucGiayTo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDanhMucGiayToException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(danhMucGiayTo);
		}
		catch (NoSuchDanhMucGiayToException nsee) {
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
	protected DanhMucGiayTo removeImpl(DanhMucGiayTo danhMucGiayTo)
		throws SystemException {
		danhMucGiayTo = toUnwrappedModel(danhMucGiayTo);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, danhMucGiayTo);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(danhMucGiayTo);

		return danhMucGiayTo;
	}

	@Override
	public DanhMucGiayTo updateImpl(
		org.oep.cmon.dao.tlct.model.DanhMucGiayTo danhMucGiayTo, boolean merge)
		throws SystemException {
		danhMucGiayTo = toUnwrappedModel(danhMucGiayTo);

		boolean isNew = danhMucGiayTo.isNew();

		DanhMucGiayToModelImpl danhMucGiayToModelImpl = (DanhMucGiayToModelImpl)danhMucGiayTo;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, danhMucGiayTo, merge);

			danhMucGiayTo.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DanhMucGiayToModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((danhMucGiayToModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(danhMucGiayToModelImpl.getOriginalDaXoa())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI,
					args);

				args = new Object[] {
						Integer.valueOf(danhMucGiayToModelImpl.getDaXoa())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI,
					args);
			}
		}

		EntityCacheUtil.putResult(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
			DanhMucGiayToImpl.class, danhMucGiayTo.getPrimaryKey(),
			danhMucGiayTo);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
				new Object[] { danhMucGiayTo.getMa() }, danhMucGiayTo);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BYMA,
				new Object[] { danhMucGiayTo.getMa() }, danhMucGiayTo);
		}
		else {
			if ((danhMucGiayToModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhMucGiayToModelImpl.getOriginalMa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
					new Object[] { danhMucGiayTo.getMa() }, danhMucGiayTo);
			}

			if ((danhMucGiayToModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BYMA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						danhMucGiayToModelImpl.getOriginalMa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BYMA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BYMA, args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BYMA,
					new Object[] { danhMucGiayTo.getMa() }, danhMucGiayTo);
			}
		}

		return danhMucGiayTo;
	}

	protected DanhMucGiayTo toUnwrappedModel(DanhMucGiayTo danhMucGiayTo) {
		if (danhMucGiayTo instanceof DanhMucGiayToImpl) {
			return danhMucGiayTo;
		}

		DanhMucGiayToImpl danhMucGiayToImpl = new DanhMucGiayToImpl();

		danhMucGiayToImpl.setNew(danhMucGiayTo.isNew());
		danhMucGiayToImpl.setPrimaryKey(danhMucGiayTo.getPrimaryKey());

		danhMucGiayToImpl.setId(danhMucGiayTo.getId());
		danhMucGiayToImpl.setMa(danhMucGiayTo.getMa());
		danhMucGiayToImpl.setTen(danhMucGiayTo.getTen());
		danhMucGiayToImpl.setMota(danhMucGiayTo.getMota());
		danhMucGiayToImpl.setGioiHanDungLuong(danhMucGiayTo.getGioiHanDungLuong());
		danhMucGiayToImpl.setKieuTaiLieu(danhMucGiayTo.getKieuTaiLieu());
		danhMucGiayToImpl.setNguoiTao(danhMucGiayTo.getNguoiTao());
		danhMucGiayToImpl.setNgayTao(danhMucGiayTo.getNgayTao());
		danhMucGiayToImpl.setNguoiSua(danhMucGiayTo.getNguoiSua());
		danhMucGiayToImpl.setNgaySua(danhMucGiayTo.getNgaySua());
		danhMucGiayToImpl.setDaXoa(danhMucGiayTo.getDaXoa());
		danhMucGiayToImpl.setPhienBan(danhMucGiayTo.getPhienBan());
		danhMucGiayToImpl.setTailieuThayTheId(danhMucGiayTo.getTailieuThayTheId());

		return danhMucGiayToImpl;
	}

	/**
	 * Returns the danh muc giay to with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh muc giay to
	 * @return the danh muc giay to
	 * @throws com.liferay.portal.NoSuchModelException if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhMucGiayTo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the danh muc giay to with the primary key or throws a {@link org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException} if it could not be found.
	 *
	 * @param id the primary key of the danh muc giay to
	 * @return the danh muc giay to
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo findByPrimaryKey(long id)
		throws NoSuchDanhMucGiayToException, SystemException {
		DanhMucGiayTo danhMucGiayTo = fetchByPrimaryKey(id);

		if (danhMucGiayTo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchDanhMucGiayToException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return danhMucGiayTo;
	}

	/**
	 * Returns the danh muc giay to with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the danh muc giay to
	 * @return the danh muc giay to, or <code>null</code> if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DanhMucGiayTo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the danh muc giay to with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the danh muc giay to
	 * @return the danh muc giay to, or <code>null</code> if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo fetchByPrimaryKey(long id) throws SystemException {
		DanhMucGiayTo danhMucGiayTo = (DanhMucGiayTo)EntityCacheUtil.getResult(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
				DanhMucGiayToImpl.class, id);

		if (danhMucGiayTo == _nullDanhMucGiayTo) {
			return null;
		}

		if (danhMucGiayTo == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				danhMucGiayTo = (DanhMucGiayTo)session.get(DanhMucGiayToImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (danhMucGiayTo != null) {
					cacheResult(danhMucGiayTo);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DanhMucGiayToModelImpl.ENTITY_CACHE_ENABLED,
						DanhMucGiayToImpl.class, id, _nullDanhMucGiayTo);
				}

				closeSession(session);
			}
		}

		return danhMucGiayTo;
	}

	/**
	 * Returns the danh muc giay to where ma = &#63; or throws a {@link org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException} if it could not be found.
	 *
	 * @param ma the ma
	 * @return the matching danh muc giay to
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo findByMa(String ma)
		throws NoSuchDanhMucGiayToException, SystemException {
		DanhMucGiayTo danhMucGiayTo = fetchByMa(ma);

		if (danhMucGiayTo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDanhMucGiayToException(msg.toString());
		}

		return danhMucGiayTo;
	}

	/**
	 * Returns the danh muc giay to where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ma the ma
	 * @return the matching danh muc giay to, or <code>null</code> if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo fetchByMa(String ma) throws SystemException {
		return fetchByMa(ma, true);
	}

	/**
	 * Returns the danh muc giay to where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching danh muc giay to, or <code>null</code> if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo fetchByMa(String ma, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MA,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DANHMUCGIAYTO_WHERE);

			if (ma == null) {
				query.append(_FINDER_COLUMN_MA_MA_1);
			}
			else {
				if (ma.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MA_MA_3);
				}
				else {
					query.append(_FINDER_COLUMN_MA_MA_2);
				}
			}

			query.append(DanhMucGiayToModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ma != null) {
					qPos.add(ma);
				}

				List<DanhMucGiayTo> list = q.list();

				result = list;

				DanhMucGiayTo danhMucGiayTo = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
						finderArgs, list);
				}
				else {
					danhMucGiayTo = list.get(0);

					cacheResult(danhMucGiayTo);

					if ((danhMucGiayTo.getMa() == null) ||
							!danhMucGiayTo.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
							finderArgs, danhMucGiayTo);
					}
				}

				return danhMucGiayTo;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (DanhMucGiayTo)result;
			}
		}
	}

	/**
	 * Returns the danh muc giay to where ma = &#63; or throws a {@link org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException} if it could not be found.
	 *
	 * @param ma the ma
	 * @return the matching danh muc giay to
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo findByByMa(String ma)
		throws NoSuchDanhMucGiayToException, SystemException {
		DanhMucGiayTo danhMucGiayTo = fetchByByMa(ma);

		if (danhMucGiayTo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDanhMucGiayToException(msg.toString());
		}

		return danhMucGiayTo;
	}

	/**
	 * Returns the danh muc giay to where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ma the ma
	 * @return the matching danh muc giay to, or <code>null</code> if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo fetchByByMa(String ma) throws SystemException {
		return fetchByByMa(ma, true);
	}

	/**
	 * Returns the danh muc giay to where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching danh muc giay to, or <code>null</code> if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo fetchByByMa(String ma, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BYMA,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DANHMUCGIAYTO_WHERE);

			if (ma == null) {
				query.append(_FINDER_COLUMN_BYMA_MA_1);
			}
			else {
				if (ma.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_BYMA_MA_3);
				}
				else {
					query.append(_FINDER_COLUMN_BYMA_MA_2);
				}
			}

			query.append(DanhMucGiayToModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ma != null) {
					qPos.add(ma);
				}

				List<DanhMucGiayTo> list = q.list();

				result = list;

				DanhMucGiayTo danhMucGiayTo = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BYMA,
						finderArgs, list);
				}
				else {
					danhMucGiayTo = list.get(0);

					cacheResult(danhMucGiayTo);

					if ((danhMucGiayTo.getMa() == null) ||
							!danhMucGiayTo.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BYMA,
							finderArgs, danhMucGiayTo);
					}
				}

				return danhMucGiayTo;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BYMA,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (DanhMucGiayTo)result;
			}
		}
	}

	/**
	 * Returns all the danh muc giay tos where daXoa = &#63;.
	 *
	 * @param daXoa the da xoa
	 * @return the matching danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public List<DanhMucGiayTo> findByTrangThai(int daXoa)
		throws SystemException {
		return findByTrangThai(daXoa, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh muc giay tos where daXoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param daXoa the da xoa
	 * @param start the lower bound of the range of danh muc giay tos
	 * @param end the upper bound of the range of danh muc giay tos (not inclusive)
	 * @return the range of matching danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public List<DanhMucGiayTo> findByTrangThai(int daXoa, int start, int end)
		throws SystemException {
		return findByTrangThai(daXoa, start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh muc giay tos where daXoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param daXoa the da xoa
	 * @param start the lower bound of the range of danh muc giay tos
	 * @param end the upper bound of the range of danh muc giay tos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public List<DanhMucGiayTo> findByTrangThai(int daXoa, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAI;
			finderArgs = new Object[] { daXoa };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAI;
			finderArgs = new Object[] { daXoa, start, end, orderByComparator };
		}

		List<DanhMucGiayTo> list = (List<DanhMucGiayTo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DANHMUCGIAYTO_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAI_DAXOA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(DanhMucGiayToModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(daXoa);

				list = (List<DanhMucGiayTo>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first danh muc giay to in the ordered set where daXoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param daXoa the da xoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching danh muc giay to
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo findByTrangThai_First(int daXoa,
		OrderByComparator orderByComparator)
		throws NoSuchDanhMucGiayToException, SystemException {
		List<DanhMucGiayTo> list = findByTrangThai(daXoa, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("daXoa=");
			msg.append(daXoa);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDanhMucGiayToException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the last danh muc giay to in the ordered set where daXoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param daXoa the da xoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching danh muc giay to
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a matching danh muc giay to could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo findByTrangThai_Last(int daXoa,
		OrderByComparator orderByComparator)
		throws NoSuchDanhMucGiayToException, SystemException {
		int count = countByTrangThai(daXoa);

		List<DanhMucGiayTo> list = findByTrangThai(daXoa, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("daXoa=");
			msg.append(daXoa);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchDanhMucGiayToException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Returns the danh muc giay tos before and after the current danh muc giay to in the ordered set where daXoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current danh muc giay to
	 * @param daXoa the da xoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next danh muc giay to
	 * @throws org.oep.cmon.dao.tlct.NoSuchDanhMucGiayToException if a danh muc giay to with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DanhMucGiayTo[] findByTrangThai_PrevAndNext(long id, int daXoa,
		OrderByComparator orderByComparator)
		throws NoSuchDanhMucGiayToException, SystemException {
		DanhMucGiayTo danhMucGiayTo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DanhMucGiayTo[] array = new DanhMucGiayToImpl[3];

			array[0] = getByTrangThai_PrevAndNext(session, danhMucGiayTo,
					daXoa, orderByComparator, true);

			array[1] = danhMucGiayTo;

			array[2] = getByTrangThai_PrevAndNext(session, danhMucGiayTo,
					daXoa, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DanhMucGiayTo getByTrangThai_PrevAndNext(Session session,
		DanhMucGiayTo danhMucGiayTo, int daXoa,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DANHMUCGIAYTO_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAI_DAXOA_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(DanhMucGiayToModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(daXoa);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(danhMucGiayTo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DanhMucGiayTo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the danh muc giay tos.
	 *
	 * @return the danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public List<DanhMucGiayTo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the danh muc giay tos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh muc giay tos
	 * @param end the upper bound of the range of danh muc giay tos (not inclusive)
	 * @return the range of danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public List<DanhMucGiayTo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the danh muc giay tos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of danh muc giay tos
	 * @param end the upper bound of the range of danh muc giay tos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public List<DanhMucGiayTo> findAll(int start, int end,
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

		List<DanhMucGiayTo> list = (List<DanhMucGiayTo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DANHMUCGIAYTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DANHMUCGIAYTO.concat(DanhMucGiayToModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DanhMucGiayTo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DanhMucGiayTo>)QueryUtil.list(q, getDialect(),
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
	 * Removes the danh muc giay to where ma = &#63; from the database.
	 *
	 * @param ma the ma
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByMa(String ma)
		throws NoSuchDanhMucGiayToException, SystemException {
		DanhMucGiayTo danhMucGiayTo = findByMa(ma);

		remove(danhMucGiayTo);
	}

	/**
	 * Removes the danh muc giay to where ma = &#63; from the database.
	 *
	 * @param ma the ma
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByByMa(String ma)
		throws NoSuchDanhMucGiayToException, SystemException {
		DanhMucGiayTo danhMucGiayTo = findByByMa(ma);

		remove(danhMucGiayTo);
	}

	/**
	 * Removes all the danh muc giay tos where daXoa = &#63; from the database.
	 *
	 * @param daXoa the da xoa
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTrangThai(int daXoa) throws SystemException {
		for (DanhMucGiayTo danhMucGiayTo : findByTrangThai(daXoa)) {
			remove(danhMucGiayTo);
		}
	}

	/**
	 * Removes all the danh muc giay tos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DanhMucGiayTo danhMucGiayTo : findAll()) {
			remove(danhMucGiayTo);
		}
	}

	/**
	 * Returns the number of danh muc giay tos where ma = &#63;.
	 *
	 * @param ma the ma
	 * @return the number of matching danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByMa(String ma) throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_MA,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHMUCGIAYTO_WHERE);

			if (ma == null) {
				query.append(_FINDER_COLUMN_MA_MA_1);
			}
			else {
				if (ma.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_MA_MA_3);
				}
				else {
					query.append(_FINDER_COLUMN_MA_MA_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ma != null) {
					qPos.add(ma);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of danh muc giay tos where ma = &#63;.
	 *
	 * @param ma the ma
	 * @return the number of matching danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByByMa(String ma) throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_BYMA,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHMUCGIAYTO_WHERE);

			if (ma == null) {
				query.append(_FINDER_COLUMN_BYMA_MA_1);
			}
			else {
				if (ma.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_BYMA_MA_3);
				}
				else {
					query.append(_FINDER_COLUMN_BYMA_MA_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (ma != null) {
					qPos.add(ma);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BYMA,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of danh muc giay tos where daXoa = &#63;.
	 *
	 * @param daXoa the da xoa
	 * @return the number of matching danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTrangThai(int daXoa) throws SystemException {
		Object[] finderArgs = new Object[] { daXoa };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TRANGTHAI,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DANHMUCGIAYTO_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAI_DAXOA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(daXoa);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TRANGTHAI,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of danh muc giay tos.
	 *
	 * @return the number of danh muc giay tos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DANHMUCGIAYTO);

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
	 * Initializes the danh muc giay to persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.cmon.dao.tlct.model.DanhMucGiayTo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DanhMucGiayTo>> listenersList = new ArrayList<ModelListener<DanhMucGiayTo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DanhMucGiayTo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DanhMucGiayToImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DanhMucGiayToPersistence.class)
	protected DanhMucGiayToPersistence danhMucGiayToPersistence;
	@BeanReference(type = LichSuGiayToDinhKemPersistence.class)
	protected LichSuGiayToDinhKemPersistence lichSuGiayToDinhKemPersistence;
	@BeanReference(type = TaiLieuChungThucPersistence.class)
	protected TaiLieuChungThucPersistence taiLieuChungThucPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DANHMUCGIAYTO = "SELECT danhMucGiayTo FROM DanhMucGiayTo danhMucGiayTo";
	private static final String _SQL_SELECT_DANHMUCGIAYTO_WHERE = "SELECT danhMucGiayTo FROM DanhMucGiayTo danhMucGiayTo WHERE ";
	private static final String _SQL_COUNT_DANHMUCGIAYTO = "SELECT COUNT(danhMucGiayTo) FROM DanhMucGiayTo danhMucGiayTo";
	private static final String _SQL_COUNT_DANHMUCGIAYTO_WHERE = "SELECT COUNT(danhMucGiayTo) FROM DanhMucGiayTo danhMucGiayTo WHERE ";
	private static final String _FINDER_COLUMN_MA_MA_1 = "danhMucGiayTo.ma IS NULL AND danhMucGiayTo.daXoa = 0";
	private static final String _FINDER_COLUMN_MA_MA_2 = "danhMucGiayTo.ma = ? AND danhMucGiayTo.daXoa = 0";
	private static final String _FINDER_COLUMN_MA_MA_3 = "(danhMucGiayTo.ma IS NULL OR danhMucGiayTo.ma = ?) AND danhMucGiayTo.daXoa = 0";
	private static final String _FINDER_COLUMN_BYMA_MA_1 = "danhMucGiayTo.ma IS NULL";
	private static final String _FINDER_COLUMN_BYMA_MA_2 = "danhMucGiayTo.ma = ?";
	private static final String _FINDER_COLUMN_BYMA_MA_3 = "(danhMucGiayTo.ma IS NULL OR danhMucGiayTo.ma = ?)";
	private static final String _FINDER_COLUMN_TRANGTHAI_DAXOA_2 = "danhMucGiayTo.daXoa = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "danhMucGiayTo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DanhMucGiayTo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DanhMucGiayTo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DanhMucGiayToPersistenceImpl.class);
	private static DanhMucGiayTo _nullDanhMucGiayTo = new DanhMucGiayToImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DanhMucGiayTo> toCacheModel() {
				return _nullDanhMucGiayToCacheModel;
			}
		};

	private static CacheModel<DanhMucGiayTo> _nullDanhMucGiayToCacheModel = new CacheModel<DanhMucGiayTo>() {
			public DanhMucGiayTo toEntityModel() {
				return _nullDanhMucGiayTo;
			}
		};
}