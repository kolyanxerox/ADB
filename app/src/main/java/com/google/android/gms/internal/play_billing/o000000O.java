package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class o000000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f26973OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f26974OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f26975OooO0OO;

    public o000000O(Object obj, Object obj2, Object obj3) {
        this.f26973OooO00o = obj;
        this.f26974OooO0O0 = obj2;
        this.f26975OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        Object obj = this.f26973OooO00o;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f26974OooO0O0);
        return new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Multiple entries with same key: ", strValueOf, C3034d9.i.f8173b, strValueOf2, " and "), String.valueOf(obj), C3034d9.i.f8173b, String.valueOf(this.f26975OooO0OO)));
    }
}
