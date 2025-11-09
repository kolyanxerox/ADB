package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.mo */
/* loaded from: classes2.dex */
public final class C3426mo {

    /* renamed from: e */
    public static final a f10310e = new a(null);

    /* renamed from: f */
    private static volatile C3426mo f10311f;

    /* renamed from: a */
    private C3092er f10312a;

    /* renamed from: b */
    private final AtomicBoolean f10313b;

    /* renamed from: c */
    private String f10314c;

    /* renamed from: d */
    private C3725u8 f10315d;

    /* renamed from: com.ironsource.mo$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final InterfaceC2993c3 m10881a(IronSource.AD_UNIT adFormat) {
            kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
            C3426mo c3426mo = C3426mo.f10311f;
            C3725u8 c3725u8M10876b = c3426mo != null ? c3426mo.m10876b() : null;
            C3426mo c3426mo2 = C3426mo.f10311f;
            C3092er c3092erM10878e = c3426mo2 != null ? c3426mo2.m10878e() : null;
            return (c3725u8M10876b == null || c3092erM10878e == null) ? new C3285kb() : new C3689t7(c3725u8M10876b, c3092erM10878e, adFormat);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        /* renamed from: a */
        public final C3426mo m10882a() {
            C3426mo c3426mo;
            C3426mo c3426mo2 = C3426mo.f10311f;
            if (c3426mo2 != null) {
                return c3426mo2;
            }
            synchronized (this) {
                c3426mo = C3426mo.f10311f;
                if (c3426mo == null) {
                    c3426mo = new C3426mo(null);
                    C3426mo.f10311f = c3426mo;
                }
            }
            return c3426mo;
        }
    }

    private C3426mo() {
        this.f10313b = new AtomicBoolean(false);
        this.f10314c = "";
    }

    /* renamed from: d */
    public static final C3426mo m10872d() {
        return f10310e.m10882a();
    }

    /* renamed from: b */
    public final C3725u8 m10876b() {
        return this.f10315d;
    }

    /* renamed from: c */
    public final AtomicBoolean m10877c() {
        return this.f10313b;
    }

    /* renamed from: e */
    public final C3092er m10878e() {
        return this.f10312a;
    }

    /* renamed from: f */
    public final String m10879f() {
        return this.f10314c;
    }

    /* renamed from: g */
    public final void m10880g() {
        this.f10313b.set(true);
    }

    public /* synthetic */ C3426mo(kotlin.jvm.internal.OooOO0O oooOO0O) {
        this();
    }

    /* renamed from: a */
    public final void m10873a(C3092er c3092er) {
        this.f10312a = c3092er;
    }

    /* renamed from: a */
    public final void m10874a(C3725u8 c3725u8) {
        this.f10315d = c3725u8;
    }

    /* renamed from: a */
    public final void m10875a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f10314c = str;
    }
}
