package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wm0 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final wm0 f25331OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ wm0[] f25332OooOo0o;

    static {
        wm0 wm0Var = new wm0("INSTANCE", 0);
        f25331OooOo0O = wm0Var;
        f25332OooOo0o = new wm0[]{wm0Var};
    }

    public static wm0[] values() {
        return (wm0[]) f25332OooOo0o.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ii0.o0OoOo0("no calls to next() since the last call to remove()", false);
    }
}
