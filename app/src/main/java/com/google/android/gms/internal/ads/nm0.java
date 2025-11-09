package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class nm0 extends zl0 implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f21513OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final List f21514OooOo0o;

    public nm0(Object obj, List list) {
        this.f21513OooOo0O = obj;
        this.f21514OooOo0o = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21513OooOo0O;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21514OooOo0o;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
