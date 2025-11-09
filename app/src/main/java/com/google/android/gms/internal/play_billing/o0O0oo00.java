package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o0O0oo00 {

    /* renamed from: OooO0OO */
    public static final o0O0oo00 f27130OooO0OO = new o0O0oo00();

    /* renamed from: OooO0O0 */
    public final ConcurrentHashMap f27132OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO00o */
    public final o0O0O0o0 f27131OooO00o = new o0O0O0o0();

    public final o0OO000o OooO00o(Class cls) {
        o0OO000o o0oo000oOooOo00;
        Charset charset = o0oO0Ooo.f27160OooO00o;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f27132OooO0O0;
        o0OO000o o0oo000o = (o0OO000o) concurrentHashMap.get(cls);
        if (o0oo000o != null) {
            return o0oo000o;
        }
        o0O0O0o0 o0o0o0o0 = this.f27131OooO00o;
        o0o0o0o0.getClass();
        o0O000o0 o0o000o0 = oo0oO0.f27216OooO00o;
        o0OoO00O.class.isAssignableFrom(cls);
        o0OO000 o0oo000OooO00o = ((o0O0O0o0) o0o0o0o0.f27109OooO00o).OooO00o(cls);
        if ((o0oo000OooO00o.f27138OooO0Oo & 2) == 2) {
            o0O000o0 o0o000o02 = oo0oO0.f27216OooO00o;
            o0O000o0 o0o000o03 = o0O000O.f27087OooO00o;
            o0oo000oOooOo00 = new o0O0o00O(o0o000o02, o0oo000OooO00o.f27135OooO00o);
        } else {
            int i = o0O0o0.f27116OooO00o;
            int i2 = o0O0O0Oo.f27107OooO00o;
            o0O000o0 o0o000o04 = oo0oO0.f27216OooO00o;
            o0O000o0 o0o000o05 = o0oo000OooO00o.OooO00o() + (-1) != 1 ? o0O000O.f27087OooO00o : null;
            int i3 = o0O0OOO0.f27112OooO00o;
            o0oo000oOooOo00 = o0O0o000.OooOo00(o0oo000OooO00o, o0o000o04, o0o000o05);
        }
        o0OO000o o0oo000o2 = (o0OO000o) concurrentHashMap.putIfAbsent(cls, o0oo000oOooOo00);
        return o0oo000o2 == null ? o0oo000oOooOo00 : o0oo000o2;
    }
}
