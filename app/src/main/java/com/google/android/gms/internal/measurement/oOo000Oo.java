package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class oOo000Oo {

    /* renamed from: OooO0OO */
    public static final oOo000Oo f26877OooO0OO = new oOo000Oo();

    /* renamed from: OooO0O0 */
    public final ConcurrentHashMap f26879OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO00o */
    public final oO00Oo0 f26878OooO00o = new oO00Oo0(0);

    public final oO0 OooO00o(Class cls) {
        oO0 oo0OooOo00;
        Charset charset = oO00O0o.f26684OooO00o;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f26879OooO0O0;
        oO0 oo0 = (oO0) concurrentHashMap.get(cls);
        if (oo0 != null) {
            return oo0;
        }
        oO00Oo0 oo00oo0 = this.f26878OooO00o;
        oo00oo0.getClass();
        oO0Oo0oo oo0oo0oo = oO0O000.f26723OooO00o;
        ooOOOOoo.class.isAssignableFrom(cls);
        oOo000o0 ooo000o0OooO0O0 = ((oO00Oo0) oo00oo0.f26700OooOo0O).OooO0O0(cls);
        if ((ooo000o0OooO0O0.f26883OooO0Oo & 2) == 2) {
            oO0Oo0oo oo0oo0oo2 = oO0O000.f26723OooO00o;
            oO0Oo0oo oo0oo0oo3 = oO0Ooooo.f26765OooO00o;
            oo0OooOo00 = new oOo00o0o(oo0oo0oo2, ooo000o0OooO0O0.f26880OooO00o);
        } else {
            int i = oOo00ooO.f26887OooO00o;
            int i2 = oO00OOOo.f26697OooO00o;
            oO0Oo0oo oo0oo0oo4 = oO0O000.f26723OooO00o;
            oO0Oo0oo oo0oo0oo5 = ooo000o0OooO0O0.OooO00o() + (-1) != 1 ? oO0Ooooo.f26765OooO00o : null;
            int i3 = oO00o00.f26716OooO00o;
            oo0OooOo00 = oO00o0.OooOo00(ooo000o0OooO0O0, oo0oo0oo4, oo0oo0oo5);
        }
        oO0 oo02 = (oO0) concurrentHashMap.putIfAbsent(cls, oo0OooOo00);
        return oo02 != null ? oo02 : oo0OooOo00;
    }
}
