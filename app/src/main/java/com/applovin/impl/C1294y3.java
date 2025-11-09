package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C1220k;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.y3 */
/* loaded from: classes.dex */
public class C1294y3 {

    /* renamed from: a */
    private final PriorityBlockingQueue f3127a = new PriorityBlockingQueue();

    /* renamed from: b */
    private final C1220k f3128b;

    /* renamed from: com.applovin.impl.y3$b */
    public static class b extends Thread {

        /* renamed from: a */
        private final BlockingQueue f3129a;

        /* renamed from: b */
        private final C1220k f3130b;

        public /* synthetic */ b(BlockingQueue blockingQueue, int i, C1220k c1220k, a aVar) {
            this(blockingQueue, i, c1220k);
        }

        /* renamed from: a */
        private void m3742a() {
            m3744b((c) this.f3129a.take());
        }

        /* JADX WARN: Removed duplicated region for block: B:175:0x00d1 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #12 {all -> 0x00dd, blocks: (B:173:0x00b9, B:175:0x00d1, B:196:0x0108, B:180:0x00e2, B:183:0x00ee, B:195:0x0107, B:194:0x0104, B:191:0x00ff, B:181:0x00e6), top: B:224:0x00b9, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m3744b(com.applovin.impl.C1294y3.c r17) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1294y3.b.m3744b(com.applovin.impl.y3$c):void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    m3742a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i, C1220k c1220k) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (c1220k == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f3129a = blockingQueue;
            this.f3130b = c1220k;
            setPriority(((Integer) c1220k.m2866a(C1268v4.f2658Q)).intValue());
        }

        /* renamed from: a */
        public static /* synthetic */ void m3743a(c cVar, d dVar) {
            cVar.f3137f.accept(dVar);
        }

        /* renamed from: a */
        private HttpURLConnection m3741a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f3132a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f3133b);
            httpURLConnection.setConnectTimeout(cVar.f3136e);
            httpURLConnection.setReadTimeout(cVar.f3136e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f3134c.isEmpty()) {
                for (Map.Entry entry : cVar.f3134c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    /* renamed from: com.applovin.impl.y3$c */
    public static class c implements Comparable {

        /* renamed from: i */
        private static final AtomicInteger f3131i = new AtomicInteger();

        /* renamed from: a */
        private final String f3132a;

        /* renamed from: b */
        private final String f3133b;

        /* renamed from: c */
        private final Map f3134c;

        /* renamed from: d */
        private final byte[] f3135d;

        /* renamed from: e */
        private final int f3136e;

        /* renamed from: f */
        private final Consumer f3137f;

        /* renamed from: g */
        private final Executor f3138g;

        /* renamed from: h */
        private final int f3139h;

        /* renamed from: com.applovin.impl.y3$c$a */
        public static class a {

            /* renamed from: a */
            private String f3140a;

            /* renamed from: b */
            private String f3141b;

            /* renamed from: c */
            private Map f3142c = new HashMap();

            /* renamed from: d */
            private byte[] f3143d;

            /* renamed from: e */
            private int f3144e;

            /* renamed from: f */
            private Consumer f3145f;

            /* renamed from: g */
            private Executor f3146g;

            /* renamed from: a */
            public a m3762a(String str) {
                this.f3140a = str;
                return this;
            }

            /* renamed from: b */
            public a m3768b(String str) {
                this.f3141b = str;
                return this;
            }

            /* renamed from: a */
            public a m3764a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f3142c = map;
                return this;
            }

            /* renamed from: a */
            public a m3763a(String str, String str2) {
                this.f3142c.put(str, str2);
                return this;
            }

            /* renamed from: a */
            public a m3766a(byte[] bArr) {
                this.f3143d = bArr;
                return this;
            }

            /* renamed from: a */
            public a m3760a(int i) {
                this.f3144e = i;
                return this;
            }

            /* renamed from: a */
            public a m3761a(Consumer consumer) {
                this.f3145f = consumer;
                return this;
            }

            /* renamed from: a */
            public a m3765a(Executor executor) {
                this.f3146g = executor;
                return this;
            }

            /* renamed from: a */
            public c m3767a() {
                return new c(this);
            }
        }

        public /* synthetic */ c(a aVar, a aVar2) {
            this(aVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(c cVar) {
            return this.f3139h - cVar.f3139h;
        }

        private c(a aVar) {
            this.f3132a = aVar.f3140a;
            this.f3133b = aVar.f3141b;
            this.f3134c = aVar.f3142c != null ? aVar.f3142c : Collections.EMPTY_MAP;
            this.f3135d = aVar.f3143d;
            this.f3136e = aVar.f3144e;
            this.f3137f = aVar.f3145f;
            this.f3138g = aVar.f3146g;
            this.f3139h = f3131i.incrementAndGet();
        }
    }

    /* renamed from: com.applovin.impl.y3$d */
    public static class d {

        /* renamed from: a */
        private final int f3147a;

        /* renamed from: b */
        private final byte[] f3148b;

        /* renamed from: c */
        private final byte[] f3149c;

        /* renamed from: d */
        private final long f3150d;

        /* renamed from: e */
        private final Throwable f3151e;

        /* renamed from: com.applovin.impl.y3$d$a */
        public static class a {

            /* renamed from: a */
            private int f3152a;

            /* renamed from: b */
            private byte[] f3153b;

            /* renamed from: c */
            private byte[] f3154c;

            /* renamed from: d */
            private long f3155d;

            /* renamed from: e */
            private Throwable f3156e;

            /* renamed from: a */
            public a m3780a(int i) {
                this.f3152a = i;
                return this;
            }

            /* renamed from: b */
            public a m3785b(byte[] bArr) {
                this.f3154c = bArr;
                return this;
            }

            /* renamed from: a */
            public a m3783a(byte[] bArr) {
                this.f3153b = bArr;
                return this;
            }

            /* renamed from: a */
            public a m3782a(Throwable th) {
                this.f3156e = th;
                return this;
            }

            /* renamed from: a */
            public a m3781a(long j) {
                this.f3155d = j;
                return this;
            }

            /* renamed from: a */
            public d m3784a() {
                return new d(this);
            }
        }

        public /* synthetic */ d(a aVar, a aVar2) {
            this(aVar);
        }

        /* renamed from: a */
        public static a m3769a() {
            return new a();
        }

        /* renamed from: b */
        public int m3770b() {
            return this.f3147a;
        }

        /* renamed from: c */
        public int m3771c() throws Throwable {
            Throwable th = this.f3151e;
            if (th == null) {
                return this.f3147a;
            }
            throw th;
        }

        /* renamed from: d */
        public byte[] m3772d() throws Throwable {
            Throwable th = this.f3151e;
            if (th == null) {
                return this.f3148b;
            }
            throw th;
        }

        /* renamed from: e */
        public long m3773e() {
            return this.f3150d;
        }

        /* renamed from: f */
        public byte[] m3774f() {
            return this.f3149c;
        }

        private d(a aVar) {
            this.f3147a = aVar.f3152a;
            this.f3148b = aVar.f3153b;
            this.f3149c = aVar.f3154c;
            this.f3150d = aVar.f3155d;
            this.f3151e = aVar.f3156e;
        }
    }

    public C1294y3(C1220k c1220k) {
        this.f3128b = c1220k;
    }

    /* renamed from: a */
    public void m3739a() {
        for (int i = 0; i < ((Integer) this.f3128b.m2866a(C1268v4.f2650P)).intValue(); i++) {
            new b(this.f3127a, i, this.f3128b).start();
        }
    }

    /* renamed from: a */
    public void m3740a(c cVar) {
        if (cVar != null) {
            this.f3127a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
