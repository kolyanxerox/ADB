package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.rh */
/* loaded from: classes2.dex */
public class C3594rh implements InterfaceC3289kf {

    /* renamed from: a */
    private static Map<String, Object> f11187a = new HashMap();

    /* renamed from: com.ironsource.rh$b */
    public static class b {

        /* renamed from: a */
        String f11188a;

        /* renamed from: b */
        String f11189b;

        /* renamed from: c */
        String f11190c;

        /* renamed from: d */
        Context f11191d;

        /* renamed from: e */
        String f11192e;

        /* renamed from: a */
        public b m11723a(Context context) {
            this.f11191d = context;
            return this;
        }

        /* renamed from: b */
        public b m11726b(String str) {
            this.f11190c = str;
            return this;
        }

        /* renamed from: c */
        public b m11727c(String str) {
            this.f11188a = str;
            return this;
        }

        /* renamed from: d */
        public b m11728d(String str) {
            this.f11192e = str;
            return this;
        }

        /* renamed from: a */
        public b m11724a(String str) {
            this.f11189b = str;
            return this;
        }

        /* renamed from: a */
        public C3594rh m11725a() {
            return new C3594rh(this);
        }
    }

    private C3594rh(b bVar) {
        m11720a(bVar);
        m11719a(bVar.f11191d);
    }

    /* renamed from: b */
    public static void m11722b(String str) {
        f11187a.put(C3037dc.f8251f, SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.InterfaceC3289kf
    /* renamed from: a */
    public Map<String, Object> mo9666a() {
        return f11187a;
    }

    public /* synthetic */ C3594rh(b bVar, a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    private void m11719a(Context context) {
        f11187a.put(C3037dc.f8250e, C2635a9.m4798b(context));
        f11187a.put(C3037dc.f8251f, C2635a9.m4801d(context));
    }

    /* renamed from: a */
    private void m11720a(b bVar) {
        Context context = bVar.f11191d;
        C3898za c3898zaM13309b = C3898za.m13309b(context);
        f11187a.put(C3037dc.f8255j, SDKUtils.encodeString(c3898zaM13309b.m13316e()));
        f11187a.put(C3037dc.f8256k, SDKUtils.encodeString(c3898zaM13309b.m13317f()));
        f11187a.put(C3037dc.f8257l, Integer.valueOf(c3898zaM13309b.m13312a()));
        f11187a.put(C3037dc.f8258m, SDKUtils.encodeString(c3898zaM13309b.m13315d()));
        f11187a.put(C3037dc.f8259n, SDKUtils.encodeString(c3898zaM13309b.m13314c()));
        f11187a.put(C3037dc.f8249d, SDKUtils.encodeString(context.getPackageName()));
        f11187a.put(C3037dc.f8252g, SDKUtils.encodeString(bVar.f11189b));
        f11187a.put("sessionid", SDKUtils.encodeString(bVar.f11188a));
        f11187a.put(C3037dc.f8247b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f11187a.put(C3037dc.f8260o, C3037dc.f8265t);
        f11187a.put(C3037dc.f8261p, C3037dc.f8262q);
        if (TextUtils.isEmpty(bVar.f11192e)) {
            return;
        }
        f11187a.put(C3037dc.f8254i, SDKUtils.encodeString(bVar.f11192e));
    }

    /* renamed from: a */
    public static void m11721a(String str) {
        f11187a.put(C3037dc.f8250e, SDKUtils.encodeString(str));
    }
}
