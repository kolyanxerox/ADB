package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a */
    private static final Map f1911a = new HashMap();

    /* renamed from: b */
    private static final Map f1912b = new HashMap();

    /* renamed from: c */
    private static final ArrayList f1913c = new ArrayList();

    /* renamed from: d */
    private static final Handler f1914d = new HandlerC1196a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$a */
    public class HandlerC1196a extends Handler {
        public HandlerC1196a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.m2440b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$b */
    public static class C1197b {

        /* renamed from: a */
        final Intent f1915a;

        /* renamed from: b */
        final Map f1916b;

        /* renamed from: c */
        final List f1917c;

        public C1197b(Intent intent, Map map, List list) {
            this.f1915a = intent;
            this.f1916b = map;
            this.f1917c = list;
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$c */
    public static class C1198c {

        /* renamed from: a */
        final IntentFilter f1918a;

        /* renamed from: b */
        final Receiver f1919b;

        /* renamed from: c */
        boolean f1920c;

        /* renamed from: d */
        boolean f1921d;

        public C1198c(IntentFilter intentFilter, Receiver receiver) {
            this.f1918a = intentFilter;
            this.f1919b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m2440b() {
        int size;
        C1197b[] c1197bArr;
        while (true) {
            synchronized (f1911a) {
                try {
                    ArrayList arrayList = f1913c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    c1197bArr = new C1197b[size];
                    arrayList.toArray(c1197bArr);
                    arrayList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                C1197b c1197b = c1197bArr[i];
                if (c1197b != null) {
                    for (C1198c c1198c : c1197b.f1917c) {
                        if (c1198c != null && !c1198c.f1921d) {
                            c1198c.f1919b.onReceive(c1197b.f1915a, c1197b.f1916b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f1911a;
        synchronized (map) {
            try {
                C1198c c1198c = new C1198c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(c1198c);
                Iterator<String> itActionsIterator = intentFilter.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    Map map2 = f1912b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(c1198c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f1911a) {
            try {
                List listM2438a = m2438a(intent);
                if (listM2438a == null) {
                    return false;
                }
                f1913c.add(new C1197b(intent, map, listM2438a));
                Handler handler = f1914d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<C1198c> listM2438a = m2438a(intent);
        if (listM2438a == null) {
            return;
        }
        for (C1198c c1198c : listM2438a) {
            if (!c1198c.f1921d) {
                c1198c.f1919b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            m2440b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f1911a;
        synchronized (map) {
            try {
                List<C1198c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (C1198c c1198c : list) {
                    c1198c.f1921d = true;
                    Iterator<String> itActionsIterator = c1198c.f1918a.actionsIterator();
                    while (itActionsIterator.hasNext()) {
                        String next = itActionsIterator.next();
                        List list2 = (List) f1912b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((C1198c) it.next()).f1919b == receiver) {
                                    c1198c.f1921d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f1912b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static List m2438a(Intent intent) {
        synchronized (f1911a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<C1198c> list = (List) f1912b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = null;
                for (C1198c c1198c : list) {
                    if (!c1198c.f1920c && c1198c.f1918a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c1198c);
                        c1198c.f1920c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((C1198c) obj).f1920c = false;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
