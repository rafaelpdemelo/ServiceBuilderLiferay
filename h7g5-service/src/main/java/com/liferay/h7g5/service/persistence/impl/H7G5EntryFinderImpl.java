package com.liferay.h7g5.service.persistence.impl;


import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.H7G5EntryLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

public class H7G5EntryFinderImpl extends H7G5EntryFinderBaseImpl {

    public List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId) {
        Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery h7g5EntryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("h7g5FolderId", h7g5FolderId));


            List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(h7g5EntryQuery);

            return entries;
        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }
        return null;
    }

    public H7G5Entry findByKey(String key) throws NoSuchH7G5EntryException {
        Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery h7g5EntryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("key", key));


            return (H7G5Entry) H7G5EntryLocalServiceUtil.dynamicQuery(h7g5EntryQuery).get(0);

        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }
        return null;
    }

    


}