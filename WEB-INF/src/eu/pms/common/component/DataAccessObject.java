package eu.pms.common.component;

import eu.pms.common.exceptions.ComponentException;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: orayyan
 * Date: 05/05/2007
 * Time: 12:17:33 م
 * To change this template use File | Settings | File Templates.
 */
public interface DataAccessObject
{
    public Object insert(Object valueObject)         throws ComponentException;

    public void   insertOrUpdate(Object valueObject) throws ComponentException;

    public void   update(Object valueObject)         throws ComponentException;

    public void   delete(Object valueObject)         throws ComponentException;



}
