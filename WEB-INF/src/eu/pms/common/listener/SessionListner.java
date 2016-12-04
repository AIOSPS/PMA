package eu.pms.common.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 03/30/2015
 * Time: 12:23 م
 */
public class SessionListner  implements HttpSessionListener
{

  private List sessions = new ArrayList();

    public SessionListner()
    {
    }

    public void sessionCreated(HttpSessionEvent event)
    {
        HttpSession session = event.getSession();
        sessions.add(session.getId());

        session.setAttribute("counter", this);
    }

    public void sessionDestroyed(HttpSessionEvent event)
    {
        HttpSession session = event.getSession();
        sessions.remove(session.getId());

        session.setAttribute("counter", this);
    }

    public int getActiveSessionNumber()
    {
        return sessions.size();
    }
}
