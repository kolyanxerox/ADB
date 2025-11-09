package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.ironsource.lc */
/* loaded from: classes2.dex */
public class C3321lc {

    /* renamed from: e */
    private static final String f9313e = "EventsTracker";

    /* renamed from: a */
    private InterfaceC3289kf f9314a;

    /* renamed from: b */
    private C3112fc f9315b;

    /* renamed from: c */
    private InterfaceC3041dg f9316c;

    /* renamed from: d */
    private ExecutorService f9317d;

    /* renamed from: com.ironsource.lc$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9318a;

        public a(String str) {
            this.f9318a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3232ir c3232ir = new C3232ir();
                ArrayList<Pair<String, String>> arrayListM8662d = C3321lc.this.f9315b.m8662d();
                if ("POST".equals(C3321lc.this.f9315b.m8663e())) {
                    c3232ir = C3904zg.m13338b(C3321lc.this.f9315b.m8660b(), this.f9318a, arrayListM8662d);
                } else if ("GET".equals(C3321lc.this.f9315b.m8663e())) {
                    c3232ir = C3904zg.m13331a(C3321lc.this.f9315b.m8660b(), this.f9318a, arrayListM8662d);
                }
                C3321lc.this.m9756a("response status code: " + c3232ir.f9047a);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
            }
        }
    }

    public C3321lc(C3112fc c3112fc, InterfaceC3289kf interfaceC3289kf) {
        if (c3112fc == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (c3112fc.m8661c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f9315b = c3112fc;
        this.f9314a = interfaceC3289kf;
        this.f9316c = c3112fc.m8661c();
        this.f9317d = Executors.newSingleThreadExecutor();
    }

    /* renamed from: b */
    private void m9758b(String str) {
        this.f9317d.submit(new a(str));
    }

    /* renamed from: a */
    public void m9756a(String str) {
        if (this.f9315b.m8664f()) {
            Log.d(f9313e, str);
        }
    }

    /* renamed from: a */
    public void m9759a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        m9756a(OooO0oO.OooOo.OooOoo(str, StringUtils.SPACE, map.toString()));
        if (this.f9315b.m8659a() && !str.isEmpty()) {
            HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo("eventname", str);
            m9757a(mapOooOOo, this.f9314a.mo9666a());
            m9757a(mapOooOOo, map);
            m9758b(this.f9316c.mo8307a(mapOooOOo));
        }
    }

    /* renamed from: a */
    private void m9757a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
        }
    }
}
