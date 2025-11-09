package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class oo0oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000O0Oo.OooO0o f26909OooO00o;

    static {
        o000O0Oo.OooO0o oooO0o;
        Uri uri = oo0ooO.f26910OooO00o;
        synchronized (o0OO00OO.class) {
            try {
                if (o0OO00OO.f26541OooO00o == null) {
                    o000O0Oo.OooO0o oooO0o2 = new o000O0Oo.OooO0o(3);
                    synchronized (o0OO00OO.class) {
                        if (o0OO00OO.f26541OooO00o != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        o0OO00OO.f26541OooO00o = oooO0o2;
                    }
                }
                oooO0o = o0OO00OO.f26541OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        f26909OooO00o = oooO0o;
    }
}
