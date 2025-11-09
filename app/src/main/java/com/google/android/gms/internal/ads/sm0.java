package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class sm0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f24123OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f24124OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f24125OooO0OO;

    public sm0(Object obj, Object obj2, Object obj3) {
        this.f24123OooO00o = obj;
        this.f24124OooO0O0 = obj2;
        this.f24125OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        Object obj = this.f24123OooO00o;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f24124OooO0O0);
        return new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Multiple entries with same key: ", strValueOf, C3034d9.i.f8173b, strValueOf2, " and "), String.valueOf(obj), C3034d9.i.f8173b, String.valueOf(this.f24125OooO0OO)));
    }
}
