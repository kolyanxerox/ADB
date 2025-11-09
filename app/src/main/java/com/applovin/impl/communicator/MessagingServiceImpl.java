package com.applovin.impl.communicator;

import OooOo0o.o000oOoO;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f593a;

    /* renamed from: b */
    private final Object f594b = new Object();

    /* renamed from: c */
    private final Map f595c = new HashMap();

    /* renamed from: d */
    private final Object f596d = new Object();

    /* renamed from: a */
    private Queue m497a(String str) {
        LinkedList linkedList;
        synchronized (this.f596d) {
            try {
                Queue queue = (Queue) this.f595c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    private void m500b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f596d) {
                try {
                    Queue queue = (Queue) this.f595c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.f595c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    private void m501c(CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM498a = m498a();
        this.f593a = scheduledThreadPoolExecutorM498a;
        scheduledThreadPoolExecutorM498a.execute(new o000oOoO(communicatorMessageImpl, 7));
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = m497a(str).iterator();
        while (it.hasNext()) {
            m501c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        m501c(appLovinCommunicatorMessage);
        m500b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m498a() {
        synchronized (this.f594b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f593a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new OooO00o(0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m496a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
