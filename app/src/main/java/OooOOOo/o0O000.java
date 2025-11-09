package OoooOOO;

import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class o0O000 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final Object f14206OooO0o = new Object();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14207OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f14208OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f14209OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f14210OooO0Oo = new Object();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f14211OooO0o0 = null;

    public /* synthetic */ o0O000(String str, Object obj, o00Oo00 o00oo00) {
        this.f14207OooO00o = str;
        this.f14209OooO0OO = obj;
        this.f14208OooO0O0 = o00oo00;
    }

    public final Object OooO00o(Object obj) {
        synchronized (this.f14210OooO0Oo) {
        }
        if (obj != null) {
            return obj;
        }
        if (oO0000O.f14623OooOO0O == null) {
            return this.f14209OooO0OO;
        }
        synchronized (f14206OooO0o) {
            try {
                if (OooO.OooO0o0()) {
                    return this.f14211OooO0o0 == null ? this.f14209OooO0OO : this.f14211OooO0o0;
                }
                try {
                    for (o0O000 o0o000 : o0O000O.f14225OooO00o) {
                        if (OooO.OooO0o0()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            o00Oo00 o00oo00 = o0o000.f14208OooO0O0;
                            if (o00oo00 != null) {
                                objZza = o00oo00.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f14206OooO0o) {
                            o0o000.f14211OooO0o0 = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                o00Oo00 o00oo002 = this.f14208OooO0O0;
                if (o00oo002 != null) {
                    try {
                        return o00oo002.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f14209OooO0OO;
            } finally {
            }
        }
    }
}
